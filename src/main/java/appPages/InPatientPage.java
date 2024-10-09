package appPages;


import drivers.DriverManager;
import utils.ConfigReader;
import io.cucumber.plugin.event.Node;
import org.bouncycastle.oer.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class InPatientPage extends BaseAction
{

    WebDriver driver;

    public InPatientPage(WebDriver driver) {
        this.driver = driver;

    }

    private By tabWardList = By.xpath("//a[contains(text(),'Ward')]");
    private By tabToAdmit = By.xpath("//span[contains(text(),'Admit')]");
    private By tabAdmitted = By.xpath("//span[contains(text(),'Admitted')]");
    private By tabToDischarge = By.xpath("//span[contains(text(),'Discharge')]");
    private By tabAll = By.xpath("//span[text()='All ']");
    private By IPModule = By.xpath("//i[@class=\"icon-bahmni-inpatient\"]");
    private By pIDSearch = By.xpath("//input[@id=\"patientIdentifier\"]");
    private By searchELe = By.xpath("//button[@type=\"submit\"]");
    private By dropdown = By.xpath("//select[@id=\"dispositionAction\"]");
    private By activePatient = By.xpath("//li[@class=\"active-patient\"]");
    private By avlblBed = By.xpath("//li[@class=\"col available\"]");
    private By queuePageUsers = By.xpath("//i[@class=\"fa fa-users\"]");
    private By gnrlWardLink = By.xpath("//span[contains(text(),'General Ward -')]");
    private By saveButton = By.xpath("//button[@class=\"right admit_btn\"]");
    private By labourWardLink = By.xpath("//span[contains(text(),'Labour Ward -')]");
    private By transferButton = By.xpath("//a[@class=\"transfer\"]");
    private By assignOrtransferButton = By.xpath("//a[@class=\"assign\" or @class=\"transfer\"]");
    //li[text()='GAN203021']
    //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    public void dept(String arg0) {

        switch (arg0) {
            case "Ward List": {
                driver.findElement(tabWardList).click();
                break;
            }
            case "To Admit": {
                driver.findElement(tabToAdmit).click();
                break;
            }
            case "Admitted": {
                driver.findElement(tabAdmitted).click();
                break;
            }
            case "To Discharge": {
                driver.findElement(tabToDischarge).click();
                break;
            }
            case "All": {
                driver.findElement(tabAll).click();
                break;
            }
            default:
                System.out.println("Please click on one tab ");
                break;

        }

    }


    public void launchBahmniUrl() throws InterruptedException {
        driver.get("https://demo.mybahmni.org/bahmni/home/index.html#/login");
        //  driver.get(properties.getProperty("URL"));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Thread.sleep(3000);
        driver.manage().window().maximize();
        System.out.println("Bahmni app has been launched");
    }

    public void checkIfHomePage() {

        String expurl = "https://demo.mybahmni.org/bahmni/home/index.html#/dashboard";
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertEquals(driver.getCurrentUrl(), expurl);
        System.out.println("Successfully lands on homepage");
    }

    public void iPModuleIsPresent() {

        driver.findElement(IPModule).isDisplayed();
        System.out.println("User can see Inpatient module icon on the home page");
    }


    public void clickOnIPModule() {
        driver.findElement(IPModule).click();

    }

    public void patientQueuePageCheck() throws InterruptedException {
        String expURL = "ADT";
        Assert.assertEquals(driver.getTitle(), expURL);
        Thread.sleep(5000);
        System.out.println("landed on patient queue page successfully");
    }

    public void checkForTabsOnQueuePage() {
        driver.findElement(tabWardList).isDisplayed();
        driver.findElement(tabToAdmit).isDisplayed();
        driver.findElement(tabAdmitted).isDisplayed();
        driver.findElement(tabToDischarge).isDisplayed();
        driver.findElement(tabAll).isDisplayed();

    }


    public void callPatientAdmTransDis(String string1, String string2, String string3) throws InterruptedException {

        switch (string1) {
            case ("All"):
                driver.findElement(tabAll).click();
                Thread.sleep(4000);
                driver.findElement(pIDSearch).sendKeys(string3);
                driver.findElement(searchELe).click();
                Thread.sleep(5000);
                break;

            case ("Admitted"):
                driver.findElement(tabAdmitted).click();
                driver.findElement(pIDSearch).sendKeys(string3);
                Thread.sleep(10000);
                driver.findElement(activePatient).click();
                Thread.sleep(5000);
                break;

            case ("WardList"):

                driver.findElement(gnrlWardLink).click();
                Thread.sleep(10000);
                driver.findElement(labourWardLink).click();
                Thread.sleep(10000);
                if (string2.contains("Diff"))
                {
                    driver.findElement(By.xpath("//a[contains(text(),'GAN203023')]")).click();
                }
                else
                {
                    driver.findElement(By.xpath("//a[contains(text(),'GAN203021')]")).click();
                }
                Thread.sleep(5000);
                break;
        }


    }

    public void selectActionFromDropdown(String str0,String str) throws InterruptedException {

        WebElement dropdownele = driver.findElement(dropdown);
        Select select = new Select(dropdownele);
        if ((str0.compareTo("WardList") == 0 ) || (str0.compareTo("Admitted")) == 0)
        {   try {
            select.selectByVisibleText("Admit Patient");
        } catch(Exception e)
        {
            System.out.println("in catch exception 2: " +e);

        }
        }
        switch (str) {
            case ("Admit"):
                select.selectByVisibleText("Admit Patient");
                break;
            case ("TransferSame"):
            case ("TransferDuplicate"):
            case ("TransferDiff"):
            case ("TransferNotIfMoreThanTwo"):
                select.selectByVisibleText("Transfer Patient");
                break;
            case ("Discharge"):
                select.selectByVisibleText("Discharge Patient");
                break;

        }
        Thread.sleep(4000);
        driver.findElement(saveButton).click();
        Thread.sleep(5000);
    }

    //code has been written with the following assumptions:
    //if not new, patient is assumed to be in labour ward and is to be transferred to general ward
    //if new, patient is to be admitted to the general ward first
    public void callBedAssignNewPatientOrDiffWardTransfer(String string2) throws InterruptedException
    {
        driver.findElement(gnrlWardLink).click();
        Thread.sleep(4000);
        driver.findElement(avlblBed).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@class=\"assign\" or @class=\"transfer\"]")).click();
        Thread.sleep(4000);
        driver.findElement(queuePageUsers).click();
    }


    public void callBedAssignSameWardTransfer(String string2) throws InterruptedException
    {
        if (string2.contains("Same"))
        {
            driver.findElement(avlblBed).click();
            driver.findElement(assignOrtransferButton).click();
        }
        if (string2.contains("Duplicate"))
        {
            driver.findElement(By.xpath("//span[contains(text(),'304-c')]")).click();
            Thread.sleep(3000);
            try{
                //   driver.findElement(assignOrTransferButton).click();
                driver.findElement(transferButton).isDisplayed();
            }catch(Exception e)
            {
                System.out.println(" in catch method with exception being handled :" +e);
                //  e.printStackTrace();
            }
            System.out.println("control is out of the try and catch");

        }
        if (string2.contains("MoreThanTwo"))
        {
            //  driver.findElement(gnrlWardLink).click();
            // Thread.sleep(3000);
            driver.findElement(By.xpath("//span[contains(text(),'304-d')]")).click();
            Thread.sleep(3000);
            driver.findElement(transferButton).click();
            Thread.sleep(3000);
            driver.switchTo().alert().accept();
        }

        Thread.sleep(3000);
        driver.findElement(queuePageUsers).click();


    }
//
//

}





