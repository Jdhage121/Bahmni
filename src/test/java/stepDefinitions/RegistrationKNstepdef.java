package stepDefinitions;


import appPages.RegistrationKN;
import drivers.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RegistrationKNstepdef {

    RegistrationKN registration = new RegistrationKN(DriverManager.getDriver());
    @Given("Launch the URL and login the application")
    public void launch_the_url_and_login_the_application() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }
    @When("User in the home page click on the Registration button")
    public void user_in_the_home_page_click_on_the_registration_button() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }
    @Then("User click on the create new button")
    public void user_click_on_the_create_new_button() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }
   @Then("User enters {string} and {string} and {string} and {string} to create Patient registration")
    public void user_enters_and_and_and_to_create_patient_registration(String string, String string2, String string3, String string4) {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }
    @Then("click on startOPD button")
    public void click_on_start_opd_button() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }

}
