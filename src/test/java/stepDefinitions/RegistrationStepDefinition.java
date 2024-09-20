package stepDefinitions;

import appPages.HomePage;
import appPages.RegistrationPage;
import drivers.DriverManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

import java.util.List;

public class RegistrationStepDefinition {


   HomePage homepage =new HomePage(DriverManager.getDriver());
   RegistrationPage registrationPage = new RegistrationPage(DriverManager.getDriver());



    @Then("user click on registration button on home screen")
    public void user_click_on_registration_button_on_home_screen() throws InterruptedException {


//        homepage.navigateToregistrationScreen();
    }
    @Then("user clicks on create new button")
    public void user_clicks_on_create_new_button() throws InterruptedException {

        registrationPage.navigateToCapturePatientDetails();
    }
    @Then("user enters {string} and {string} and {string} and {string} to create patient registration")
    public void user_enters_and_and_and_to_create_patient_registration(String firstname, String lastname, String gender, String age) throws InterruptedException {

   registrationPage.createPatientRegistration(firstname,lastname,gender,age);

    }

    @Then("clicks on startOPD button")
    public void clicks_on_start_opd_button() throws InterruptedException {
        registrationPage.clickStartOPD();
    }



    @Then("user enters patient data as below")
    public void user_enters_patient_data_as_below(DataTable dataTable) throws InterruptedException {

        List<List<String>> testData=dataTable.asLists();

        registrationPage.createPatientRegistration(testData.get(0).get(0), testData.get(0).get(1),testData.get(0).get(2),testData.get(0).get(3));

    }


}
