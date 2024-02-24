package appPagesMs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPageMs {

    private By createNewButton = By.xpath("//span[@class='nav-link' and contains(text(),'Create')]");
    private By firstNameText = By.id("givenName");
    private By lastNameText = By.id("familyName");
    private By selectGender = By.id("gender");
    private By ageText = By.id("ageYears");
    private By startOPD_Button = By.xpath("//button[text()='Start OPD visit']");
    public WebDriver driver;

    public RegistrationPageMs(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToCapturePatientDetails() throws InterruptedException {
        driver.findElement(createNewButton).click();
        Thread.sleep(3000);
    }

    public void createPatientRegistration(String firstname, String lastname, String gender, String age) throws InterruptedException {
        driver.findElement(firstNameText).sendKeys(firstname);
        driver.findElement(lastNameText).sendKeys(lastname);

        Select select = new Select(driver.findElement(selectGender));
        select.selectByVisibleText(gender);

        driver.findElement(ageText).sendKeys(age);

        Thread.sleep(1000);
    }

    public void clickStartOPD() throws InterruptedException {
        driver.findElement(startOPD_Button).click();
        Thread.sleep(3000);
    }
}
