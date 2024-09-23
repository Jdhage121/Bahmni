package appPages;

import drivers.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class VeenaPatientDocPage {
    public WebDriver driver;

    public VeenaPatientDocPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }
    public @FindBy(id = "bahmni.patient.document.upload") WebElement patientDocumentUploadButton;

    public @FindBy(xpath = "//span[normalize-space()='All Patients']") WebElement allpatientslist;

    public @FindBy(xpath = "//input[@id='patientIdentifier']" ) WebElement searchBox;

    public @FindBy(xpath = "//li[@ng-repeat='visit in visits']") WebElement VisitDuration;

    public @FindBy(xpath = "//input[@id='file-browse-cbc1656e-dd87-4f12-b99c-e0c842d5efee']") WebElement UploadDocument;

    public @FindBy(xpath = "//i[@class='fa fa-file-pdf-o']") WebElement OpenDocument;

    public void searchForPatient(String nameOfThePatient) throws InterruptedException {
        allpatientslist.click();
        Thread.sleep(6000);
        searchBox.sendKeys(nameOfThePatient);
        Thread.sleep(6000);
        searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(6000);
        VisitDuration.click();
        Thread.sleep(6000);
        uploadFile(DriverManager.getDriver().findElement(By.xpath("//input[@id='file-browse-cbc1656e-dd87-4f12-b99c-e0c842d5efee']")));
        Thread.sleep(6000);
        OpenDocument.click();
        Thread.sleep(6000);

    }

    public void uploadFile(WebElement element){
        String js = "arguments[0].style.height='auto';arguments[0].style.visibility='visible';";
        ((JavascriptExecutor)driver).executeScript(js,element);
        element.sendKeys("/Users/nidhi/IdeaProjects/Bahmni/src/main/resources/prescription1.pdf");

    }

    public static void clickOnSearchButton() {

    }

    public void ClickOnPatientDocumentUploadButton() {
        patientDocumentUploadButton.click();


    }



}
