package stepDefinitions;

import appPages.Hooks_Sukanya;
import appPages.LoginPage;
import appPages.RegisPage_Sukanya;
import drivers.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisStepDefs_Sukanya {

    LoginPage obj1 = new LoginPage(DriverManager.getDriver());
    RegisPageSukanya regObj = new RegisPageSukanya(DriverManager.getDriver());
    @Given("Login and select Location")
    public void loginAndSelectLocation() throws InterruptedException {
        DriverManager.getDriver().get("https://docker.standard.mybahmni.in/bahmni/home/index.html#/login");

        obj1.loginToBahmniApp("Superman", "Admin123");

    }

    @When("User click on the registration link and click create new link")
    public void userClickOnTheRegistrationLinkAndClickCreateNewLink(){
        regObj.CreateNewPatient();
    }

    @And("Enter the patient details {string},{string},{string},{string}")
    public void enterThePatientDetailsFirstNameLastNameGenderDOB(String fName, String lName,String gender,String dob) {
        regObj.enteringDetails(fName,lName,gender,dob);
    }

    @And("Save the patient details")
    public void saveThePatientDetails() {
        regObj.setSaveButton();
    }

    @Then("Patient profile will be created")
    public void patientProfileWillBeCreated() {
        regObj.secondSaveButton();
        Assert.assertTrue(regObj.verifySuccessSave());
    }
    @Then("User will get error msg")
    public void userWillGetErrorMsg() {
        Assert.assertTrue(regObj.verifyErrormsg());

    }
}
