package stepDefinitions;
import appPages.patientpage;
import drivers.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PatientStepDefinition {
    patientpage patientpage = new patientpage(DriverManager.getDriver());
    @When("user click  on the patient document")
    public void userclickonthepatientdocument() {
        patientpage.clickOnPatientDocumentUploadButton();
    }
    @Then("user search for the patient in the all patient list")
    public void usersearchforthepatientintheallpatient_list() throws InterruptedException {
        patientpage.searchForPatient("john");
    }
    @And("user click on select button")
    public void userclickonselectbutton() {
        patientpage.clickOnSearchResult();
    }

}



