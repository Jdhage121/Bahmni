package appPages;

import org.bouncycastle.asn1.dvcs.DVCSObjectIdentifiers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class tejapatientpage {
    public WebDriver driver;

    public tejapatientpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public @FindBy(id = "bahmni.patient.document.upload") WebElement patientDocumentUploadButton;

    public @FindBy(xpath = "//span[text()='All Patients ']") WebElement allPatientList;

    public @FindBy(id = "patientIdentifier") WebElement searchBox;

    public @FindBy(xpath = "//button[@type='submit']") WebElement SearchResult;

    public @FindBy(css = ".patient-details") WebElement patientname;

    public @FindBy(xpath = "//input[@type = 'file']") WebElement browserButton;

    public @FindBy(xpath = "form[name='visit0'] button[type='submit']") WebElement saveButton;


    public void clickOnPatientDocumentUploadButton() {
        patientDocumentUploadButton.click();
    }


    public void searchForPatient(String nameOfthePatient) throws InterruptedException {
        allPatientList.click();
        searchBox.sendKeys(nameOfthePatient);
        Thread.sleep(2000);
        searchBox.click();


    }

    public void clickOnSearchResult() {
        SearchResult.click();

        patientname.isDisplayed();


    }

    public void clickOnBrowserButton() {


        WebElement element = driver.findElement(By.xpath("//input[@type = 'file']"));
        element.sendKeys("E:\\cover letter.docx");
        browserButton.click();
        saveButton.click();
    }


}



