package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProgramEnrolPF_SD {
    public WebDriver driver;
public ProgramEnrolPF_SD(WebDriver driver){
    this.driver= driver;
    PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//a[@id='bahmni.programs']")
    private WebElement programs;
@FindBy(xpath = "//span[normalize-space()='All']")
private WebElement allPatients;
@FindBy(id = "patientIdentifier")
private WebElement searchPatient;
@FindBy(css = "div.reg-srch-btn.left")
private WebElement searchbutton;
@FindBy(xpath = "//a[@class='section-title active']")
private WebElement newProgramEnrollment;
@FindBy(xpath="//select[@ng-model='programSelected']")
private WebElement chooseProgram;
@FindBy(xpath = "//Select[@class='ng-valid ng-dirty ng-valid-parse ng-touched']/option[text()='TB Program']")
private WebElement tbProgram;
@FindBy(xpath = "//input[@id='ID_Number']")
private WebElement idNumber;
@FindBy(xpath = "//input[@value='Enroll']")
private WebElement enroll;
@FindBy(xpath = "//h2[normalize-space()='Active Programs']")
private WebElement verifyPatientActiveProgram;
@FindBy(xpath = "//div[@class='msg']")
private WebElement errorMessage;
@FindBy(css="input#delete_btn")
private WebElement deleteButton;
@FindBy(css="textarea[placeholder='Reason to delete the program']")
private WebElement deleteReason;
@FindBy(xpath = "//input[@value='Delete']")
private WebElement deleteButton2;
@FindBy(xpath = "//button[@id='delete']")
private WebElement deleteButton3;
    public void NavigateToProgramPage() {
    programs.click();
    allPatients.click();
    }
    public boolean VerifyProgramPage(){
        return allPatients.isDisplayed();
    }
    public void NavigateToPatientPage() throws InterruptedException {
        searchPatient.sendKeys("john");
        searchbutton.click();
    }
    public boolean VerifyPatientPage(){
        return newProgramEnrollment.isDisplayed();
    }
    public void AddProgram() throws InterruptedException {
        newProgramEnrollment.click();
        new Select(driver.findElement(By.xpath("//select[@ng-model='programSelected']"))).selectByVisibleText("TB Program");
        idNumber.sendKeys("200001");
        enroll.click();
        Thread.sleep(2000);
            }
    public boolean VerifyPatientActiveProgram(){
        return verifyPatientActiveProgram.isDisplayed();
    }
    public boolean VerifyError() throws InterruptedException {
        return errorMessage.isDisplayed();
    }
    public void DeletePatient() throws InterruptedException {
        deleteButton.click();
        deleteReason.sendKeys("Testing");
        deleteButton2.click();
        deleteButton3.click();
    }
    public boolean VerifyDelete() throws InterruptedException {
        return deleteButton.isDisplayed();
    }
}

