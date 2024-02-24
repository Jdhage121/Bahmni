package stepDefinitions;

import appPages.HomePage;
import appPages.RegistrationPage;
import drivers.DriverManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class RegistrationStepDefinition {


    HomePage homepage = new HomePage(DriverManager.getDriver());
    RegistrationPage registrationPage = new RegistrationPage(DriverManager.getDriver());
    RegistrationPage actualNameSearch = new RegistrationPage(DriverManager.getDriver());


    @Then("user click on registration button on home screen")
    public void user_click_on_registration_button_on_home_screen() throws InterruptedException {


        homepage.navigateToregistrationScreen();
        Thread.sleep(5000);
    }

    @Then("user clicks on create new button")
    public void user_clicks_on_create_new_button() throws InterruptedException {

        registrationPage.navigateToCapturePatientDetails();
    }

    @Then("user enters {string} and {string} and {string} and {string} to create patient registration")
    public void user_enters_and_and_and_to_create_patient_registration(String firstname, String lastname, String gender, String age) throws InterruptedException {

        registrationPage.createPatientRegistration(firstname, lastname, gender, age);

    }

    @Then("clicks on startOPD button")
    public void clicks_on_start_opd_button() throws InterruptedException {
        registrationPage.clickStartOPD();
    }


    @Then("user enters patient data as below")
    public void user_enters_patient_data_as_below(DataTable dataTable) throws InterruptedException {

        List<List<String>> testData = dataTable.asLists();

        registrationPage.createPatientRegistration(testData.get(0).get(0), testData.get(0).get(1), testData.get(0).get(2), testData.get(0).get(3));

    }

    @Then("user unable to register new patient and get a {string}")
    public void user_unable_to_register_new_patient_and_get_a(String string) {
        System.out.println("Registration unsuccessful");
    }

    @Then("user should see the different option {string}")
    public void user_should_see_the_different_option(String string) {

    }

    @When("user click the Gender dropdown options the user should see {string}")
    public void user_click_the_gender_dropdown_options_the_user_should_see_different_available_option(String gender) {
        //genderOptions.get(i).getText();
        Boolean result = registrationPage.getGenderOptions().contains(gender);
        Assert.assertTrue(result);


    }

    @Then("user clicks on the search button")
    public void user_clicks_on_the_search_button() throws InterruptedException {
        registrationPage.searchClick();


    }

    @Then("user should be redirected to the search results page to search by {string}")
    public void user_should_be_redirected_to_the_search_results_page_to_search_by(String Name) {

        try {
            registrationPage.searchByName(Name);
        } catch (InterruptedException e) {
            // e.printStackTrace();
        }
    }

    @Then("user should see the search result {string}")
    public void user_should_see_the_search_result(String expectedName) throws InterruptedException {
        Thread.sleep(3000);

        String actualSrcName = actualNameSearch.actualSearchName();
        Assert.assertEquals(actualSrcName, expectedName);
    }


}
