package stepDefinitions;

import appPages.LoginPage;
import appPages.VeenaPatientDocPage;
import drivers.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VeenaPatientDocStepDefinition {
    LoginPage loginPage = new LoginPage(DriverManager.getDriver());
    VeenaPatientDocPage driver1 = new VeenaPatientDocPage(DriverManager.getDriver());

    VeenaPatientDocPage veenaPatientDocPage = new VeenaPatientDocPage(DriverManager.getDriver());

    @Given("user launches the Application")
    public void userLaunchesTheApplication() throws InterruptedException {
        DriverManager.getDriver().get("https://docker.standard.mybahmni.in/bahmni/home/index.html#/dashboard");
       loginPage.loginToBahmniApp("Superman","Admin123");
    }

    @And("user enters the login credentials and clicks on login button")
    public void userEntersTheLoginCredentialsAndClicksOnLoginButton() {
    }

    @And("user should be able to login to the Application")
    public void userShouldBeAbleToLoginToTheApplication() {

    }

    @When("user clicks on the Patient Documents")
    public void userClicksOnThePatientDocuments() {

        veenaPatientDocPage.ClickOnPatientDocumentUploadButton();
    }

    @Then("user search for the patient in all patients list")
    public void userSearchForThePatientInAllPatientsList()throws InterruptedException {
        veenaPatientDocPage.searchForPatient("Katie John");

    }

    @And("user click on the search button")
    public void userClickOnTheSearchButton() {

        VeenaPatientDocPage.clickOnSearchButton();
    }

    @And("the user can upload the Document")
    public void theUserCanUploadTheDocument() {
    }

    @And("user can view the Document")
    public void userCanViewTheDocument() {
    }



}
