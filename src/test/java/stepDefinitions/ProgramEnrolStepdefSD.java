package stepDefinitions;

import appPages.LoginPage;
import appPages.ProgramEnrolPF_SD;
import drivers.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ProgramEnrolStepdefSD {
    LoginPage obj1= new LoginPage(DriverManager.getDriver());
    ProgramEnrolPF_SD obj = new ProgramEnrolPF_SD(DriverManager.getDriver());
    @Given("the user is logged into the Bahmni application with valid credentials")
    public void theUserIsLoggedIntoTheBahmniApplicationWithValidCredentials() throws InterruptedException {
    DriverManager.getDriver().get("https://docker.standard.mybahmni.in/bahmni/home/index.html#/login");
    obj1.loginToBahmniApp("Superman", "Admin123");
    }
    @And("the user navigates to the Program module in the Bahmni Labour Ward Dashboard")
    public void theUserNavigatesToTheProgramModuleInTheBahmniLabourWardDashboard() throws InterruptedException {
    obj.NavigateToProgramPage();
    Thread.sleep(2000);
    Assert.assertTrue(obj.VerifyProgramPage());
    }
    @When("the user searches for the patient name")
    public void theUserSearchesForThePatientName() throws InterruptedException {
        obj.NavigateToPatientPage();
    }
    @And("the program enrollment page is displayed")
    public void theProgramEnrollmentPageIsDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(obj.VerifyPatientPage());
    }
    @And("the user initiates a new program enrollment selects the Program state, Start date, ID number, clicks Enroll")
    public void theUserInitiatesANewProgramEnrollmentSelectsTheProgramStateStartDateIDNumberClicksEnroll() throws InterruptedException {
        obj.AddProgram();
    }
    @Then("enrolled program should be visible as an Active Program on the patient dashboard")
    public void enrolledProgramShouldBeVisibleAsAnActiveProgramOnThePatientDashboard() throws InterruptedException {
        Assert.assertTrue(obj.VerifyPatientActiveProgram());
        Thread.sleep(2000);
    }
    @Then("error message should display on the dashboard")
    public void errorMessageShouldDisplayOnTheDashboard() throws InterruptedException {
     Assert.assertTrue(obj.VerifyError());
     Thread.sleep(2000);
    }
 @And("delete patient from the program")
 public void deletePatientFromTheProgram() throws InterruptedException {
     Thread.sleep(2000);
     obj.DeletePatient();
     Thread.sleep(2000);
 }

 @Then("patient should be successfully deleted from the program")
 public void patientShouldBeSuccessfullyDeletedFromTheProgram() throws InterruptedException {
 Assert.assertFalse(obj.VerifyPatientActiveProgram());
    }
}
