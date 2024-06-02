package stepDefinitions;
import appPages.Patientdocumentpage;
import drivers.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
public class PatientdocStepdefination {
Patientdocumentpage patientdocumentpage = new Patientdocumentpage(DriverManager.getDriver());
    @Given("verified user clicks on the Patient Documents button")
    public void verified_user_clicks_on_the_patient_documents_button() {
        patientdocumentpage.clickonPatientDocumentssbutton();
    }
    @When("select the patient from the dashboard")
    public void select_the_patient_from_the_dashboard() {
            patientdocumentpage.clickonPatientNamebutton();
            }
    @Then("click on visit")
    public void click_on_visit() {
        patientdocumentpage.visitbutton();
    }
    @Then("click on visittype")
    public void click_on_visittype() {
        patientdocumentpage.visittypebutton();
    }
    @Then("click date")
    public void click_date() {
        patientdocumentpage.clickdate();
    }
    @Then("user uploads the documents by clicking on save button")
    public void user_uploads_the_documents_by_clicking_on_scan_button() {
        patientdocumentpage.savebutton();

    }



}
