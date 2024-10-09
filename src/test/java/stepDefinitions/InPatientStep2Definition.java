package stepDefinitions;

import appPages.*;
import drivers.DriverManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.oer.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.concurrent.TimeUnit;

//import java.time.Duration;

public class InPatientStep2Definition {

    WebDriver driver;

    LoginPage loginpage = new LoginPage(DriverManager.getDriver());
    InPatientPage inPatientPage = new InPatientPage(DriverManager.getDriver());

    @Given("user launches Bahmni application and logs on successfully onto patient queue page")
    public void userLaunchesBahmniApplicationAndLogsOnSuccessfullyOntoPatientQueuePage()  throws InterruptedException {
        inPatientPage.launchBahmniUrl();
        loginpage.loginToBahmniApp("superman", "Admin123", "OPD-1");
        inPatientPage.clickOnIPModule();
        Thread.sleep(5000);
    }


    @When("user clicks on queuepagetab and selects action for the patient id pid")
    public void user_clicks_on_queuepagetab_and_selects_action_for_the_patient_id_pid(DataTable dataTable) throws InterruptedException
    {

        List<List<String>> testdata = dataTable.asLists(String.class);

        for (List<String> s: testdata)
        {
            System.out.println("value of each row: " +s);
            Thread.sleep(4000);
            inPatientPage.callPatientAdmTransDis(s.get(0),s.get(1),s.get(2));
            Thread.sleep(4000);
            inPatientPage.selectActionFromDropdown(s.get(0),s.get(1));

            if ((s.get(1).contains("Admit")) || (s.get(1).contains("Diff")))
            {
                inPatientPage.callBedAssignNewPatientOrDiffWardTransfer(s.get(1));
            }
            if ((s.get(1).contains("Same")) || (s.get(1).contains("Duplicate")) || (s.get(1).contains("MoreThanTwo")))
            {
                inPatientPage.callBedAssignSameWardTransfer(s.get(1));
            }

        }

    }


    @Then("patient should be successfully disposed as required")
    public void patientShouldBeSuccessfullyDisposedAsRequired()
    {
        System.out.println(" Successfully disposed step ");
    }


}



