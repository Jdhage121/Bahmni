package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DeekshaReg_POM {
    public WebDriver driver;

    public DeekshaReg_POM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Initialize PageFactory elements

    }

    public @FindBy(id = "bahmni.registration") WebElement regTab;

    public void clickonReg() {
        //click on registration
        regTab.click();
    }

    public @FindBy(xpath = "//span[@class='nav-link' and contains(text(),'Create')]") WebElement createNew;

    public void clickonCreateNew() throws InterruptedException {
        //click on create new
        createNew.click();
        Thread.sleep(3000);
    }

    public @FindBy(id = "givenName") WebElement patientName;
    public @FindBy(id = "familyName") WebElement patientLastName;
    public @FindBy(id = "gender") WebElement gender;

    public @FindBy(id = "ageYears") WebElement age;
    public @FindBy(xpath = "//button[text()='Start OPD visit']") WebElement startOPD;

    public void RegForm(String firstname, String lastName, String gender, String ageTxt) throws InterruptedException {

        patientName.sendKeys(firstname);
        patientLastName.sendKeys(lastName);
        Select select = new Select(driver.findElement(By.id("gender")));
        select.selectByVisibleText(gender);
        age.sendKeys(ageTxt);
        Thread.sleep(3000);
    }

    public void clickStartOPD() throws InterruptedException {

        startOPD.click();
        Thread.sleep(5000);
    }

    public void invalidRegForm(String lastName, String gender, String ageTxt, String number) throws InterruptedException {

        patientLastName.sendKeys(lastName);
        Select select = new Select(driver.findElement(By.id("gender")));
        select.selectByVisibleText(gender);
        age.sendKeys(ageTxt);
        Thread.sleep(3000);}
}
