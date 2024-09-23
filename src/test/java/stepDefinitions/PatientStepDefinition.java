package stepDefinitions;

import appPages.LoginPage;
import appPages.tejapatientpage;
import drivers.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PatientStepDefinition {

    tejapatientpage tejapatientpage = new tejapatientpage(DriverManager.getDriver());


    @When("user click  on the patient document")
    public void userclickonthepatientdocument() {
        tejapatientpage.clickOnPatientDocumentUploadButton();

    }

    @Then("user search for the patient in the all patient list")
    public void usersearchforthepatientintheallpatient_list() throws InterruptedException {
        tejapatientpage.searchForPatient("john");


    }


    @And("user click on select button")
    public void userclickonselectbutton() {

        tejapatientpage.clickOnSearchResult();
    }
    @Then("user should click on the browser Button")
    public void user_should_click_on_the_browser_button() {

        tejapatientpage.clickOnBrowserButton();


    }



    @And("user click on the Save button")
    public void userClickOnTheSaveButton() {
    }
}



