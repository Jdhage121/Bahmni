package appPages;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Patientdocumentpage  {
    public WebDriver driver;
    public Patientdocumentpage(WebDriver driver) {
        this.driver = driver;
    }

    public By PatientDocumentsbutton = By.xpath("//a[@id='bahmni.patient.document.upload']");
    public By PatientNamebutton = By.xpath("//div[text()='Rudra Kaul']");
    public By visitbutton = By.cssSelector("#newVisit > h5");
    public By visittypebutton = By.xpath("//select[@ng-model='newVisit.visitType']");
    public By datebutton = By.xpath("//input[@name='startDate']");
    public By savebutton = By.xpath("//button[@type='submit']");

    public void clickonPatientDocumentssbutton() {
        driver.findElement(PatientDocumentsbutton).click();
    }
    public void clickonPatientNamebutton() {
        driver.findElement(PatientNamebutton).click();
    }
    public void visitbutton() {
        driver.findElement(visitbutton).click();
    }
    public void visittypebutton() {
        Select select = new Select(driver.findElement(visittypebutton));
        select.selectByVisibleText("OPD");
    }
    public void clickdate() {
        driver.findElement(datebutton).sendKeys("01/01/2022");
    }
    public void savebutton() {driver.findElement(savebutton).click();
    }

    public void Patientdocumentpage() {

        driver.findElement(PatientNamebutton).sendKeys("Rudra Kaul");
        driver.findElement(visitbutton).click();
        driver.findElement(visittypebutton).sendKeys("OPD");
        driver.findElement(datebutton).sendKeys("01/01/2022");
        driver.findElement(savebutton).click();
    }
}




