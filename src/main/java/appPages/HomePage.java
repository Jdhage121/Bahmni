package appPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseAction {
    public WebDriver driver;
    @FindBy(xpath = "//a[@id='bahmni.registration']") // driver.findElement method is replaced by @FindBy
    private WebElement registrationButton;
    @FindBy(xpath = "//a[@id = 'bahmni.programs']")
    private WebElement programsButton;
    @FindBy(xpath = "//a[@id = 'bahmni.clinical']")
    private WebElement clinicalButton;
    @FindBy(xpath = "//a[@id = 'bahmni.radiology.document.upload']")
    private WebElement radiologyDocumentUploadButton;
    @FindBy(xpath = "//a[@id = 'bahmni.patient.document.upload']")
    private WebElement patientDocumentUploadButton;
    @FindBy(xpath = "//a[@id = 'bahmni.ipd']")
    private WebElement bedManagementButton;
    @FindBy(xpath = "//a[@id = 'bahmni.admin']")
    private WebElement adminButton;
    @FindBy(xpath = "//a[@id = 'bahmni.reports']")
    private WebElement reportsButton;
    @FindBy(xpath = "//a[@id = 'bahmni.orders']")
    private WebElement ordersButton;
    @FindBy(xpath = "//a[@id = 'bahmni.implementer.interface']")
    private WebElement implementerInterfaceButton;
    @FindBy(xpath = "//a[@id = 'bahmni.atomfeed.console']")
    private WebElement atomFeedConsoleButton;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Initialize PageFactory elements
    }

    public void assertHomePageButtons() {
        verifyIsElementDisplayed(registrationButton);
        verifyIsElementDisplayed(programsButton);
        verifyIsElementDisplayed(clinicalButton);
        verifyIsElementDisplayed(radiologyDocumentUploadButton);
        verifyIsElementDisplayed(patientDocumentUploadButton);
        verifyIsElementDisplayed(bedManagementButton);
        verifyIsElementDisplayed(adminButton);
        verifyIsElementDisplayed(reportsButton);
        verifyIsElementDisplayed(ordersButton);
        verifyIsElementDisplayed(implementerInterfaceButton);
        verifyIsElementDisplayed(atomFeedConsoleButton);
        System.out.println(" I see all the buttons ");

    }

    public void assertUserReturnsToHomePage() {
        assertHomePageButtons();
        System.out.println("Test Passed");
    }

    public void navigateToRegistrationScreen() throws InterruptedException {
        registrationButton.click();
        Thread.sleep(6000);
    }


    public void navigateToregistrationScreen() {

    }
}
