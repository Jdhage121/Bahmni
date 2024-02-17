package stepDefinitions;

import appPages.LoginPage;
import drivers.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinition {



    LoginPage loginPage = new LoginPage(DriverManager.getDriver());

    @Given("user launches the application")
    public void user_launches_the_application() throws InterruptedException {

        DriverManager.getDriver().get("https://docker.standard.mybahmni.in/bahmni/home/index.html#/login");
//        DriverManager.getDriver().get("https://demo-lite.mybahmni.in/bahmni/home/index.html#/login");
        Thread.sleep(3000);
    }
    @Given("user enters the login credentials and click on login button")
    public void user_enters_the_login_credentials_and_click_on_login_button() throws InterruptedException {

        loginPage.loginToBahmniApp("superman","Admin123");
    }
    @Then("user should be able to login to the app")
    public void user_should_be_able_to_login_to_the_app() {


    }
}