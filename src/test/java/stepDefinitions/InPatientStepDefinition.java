package stepDefinitions;

import appPages.*;
import drivers.DriverManager;
import utils.ConfigReader;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.bouncycastle.oer.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.sql.SQLOutput;
import java.util.List;
import java.util.concurrent.TimeUnit;

//import java.time.Duration;

public class InPatientStepDefinition
{

    WebDriver driver;
    //WebDriver driver = new ChromeDriver();
    LoginPage loginpage = new LoginPage(DriverManager.getDriver());
    InPatientPage inPatientPage = new InPatientPage(DriverManager.getDriver());

    @Given("user launches Bahmni application")
    public void user_launches_bahmni_application() throws InterruptedException
    {
        inPatientPage.launchBahmniUrl();
    }


    @When("user enters valid credentials and logs on successfully onto home page")
    public void userEntersValidCredentialsAndLogsOnSuccessfullyOntoHomePage() throws InterruptedException
    {
        loginpage.loginToBahmniApp("superman","Admin123","OPD-1");
        System.out.println("Successfully logged on");
        inPatientPage.checkIfHomePage();

    }


    @Then("user should see InPatient app on the home page")
    public void user_should_see_in_patient_app_on_the_home_page() {
        inPatientPage.iPModuleIsPresent();

    }

    @And("user clicks on InPatient app on the home page")
    public void userClicksOnInPatientAppOnTheHomePage() {
        inPatientPage.clickOnIPModule();

    }

    @Then("user should land on patient queue page")
    public void userShouldLandOnPatientQueuePage() throws InterruptedException
    {
        inPatientPage.patientQueuePageCheck();
    }


    @Then("user should see all tabs")
    public void user_should_see_all_tabs()
    {
        inPatientPage.checkForTabsOnQueuePage();

    }



}
    /* public void user_should_see_all_tabs(DataTable dataTable)
    {
        List<List<String>> tablist = dataTable.asLists(String.class);
       for(List<String> e:tablist)
       {
           System.out.println(e);

       }
        System.out.println("Tablist : ");
        System.out.println("First data: " + tablist.get(2).get(0));


    } */


