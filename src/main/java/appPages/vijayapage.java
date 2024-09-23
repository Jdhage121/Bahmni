package appPages;

import drivers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class vijayapage {
    public WebDriver driver;

    public vijayapage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    AdminModule adminModule = new AdminModule(DriverManager.getDriver());

    @FindBy(className = "icon-bahmni-documents")
    public WebElement Patientdoclink;

    @FindBy(xpath = "//span[text()='All Patients ']")
    public WebElement Allpatientlink;

    @FindBy(id="patientIdentifier")
    public WebElement SearchTextbox;

    @FindBy(xpath="//button[@type='submit']/i")
    public WebElement Searchbutton;

     @FindBy(xpath="//ul[@class='doc-upload-accordion']/child::li[2]")
     public WebElement VisitDuration;

    @FindBy(xpath = "(//input[@type='file'])[2]")
    public WebElement uploadButton;

    @FindBy(css=".btn")
    public WebElement submitButton;

    public void uploadfunction() throws InterruptedException {
        Patientdoclink.click();
        Allpatientlink.click();
        SearchTextbox.sendKeys("Katie John");
        Searchbutton.click();
        Thread.sleep(6000);
        VisitDuration.click();
        Thread.sleep(5000);
        adminModule.uploadFile(uploadButton);
    }

}
