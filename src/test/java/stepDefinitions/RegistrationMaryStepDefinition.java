package stepDefinitions;

import appPages.RegistrationPage;
import appPagesMs.LoginPageMs;
import drivers.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class RegistrationMaryStepDefinition {
    LoginPageMs logIn1 = new LoginPageMs(DriverManager.getDriver());
    RegistrationPage registrationPage = new RegistrationPage(DriverManager.getDriver());


    @And("user enters invalid login credentials {string} {string} and click on login button")
    public void user_enters_invalid_login_credentials_and_click_on_login_button(String UserName, String Password) throws InterruptedException {

        logIn1.loginToBahmniApp1(UserName, Password);
    }

    @Given("user launches the applications")
    public void user_launches_the_application() throws InterruptedException {
        DriverManager.getDriver().get("https://docker.standard.mybahmni.in/bahmni/home/index.html#/login");
        Thread.sleep(3000);
    }


    @Then("user should see the message {string}")
    public void user_should_see_the_message(String errorMessage) {
        String actualErrorMes = logIn1.getTextOf();
        Assert.assertEquals(actualErrorMes, errorMessage);
    }

    @Then("user should be able to register the new patient successfully and get a pop up message as Saved")
    public void user_should_be_able_to_register_the_new_patient_successfully_and_get_a_pop_up_message_as_saved() throws InterruptedException {
        registrationPage.clickSave();
    }


}
