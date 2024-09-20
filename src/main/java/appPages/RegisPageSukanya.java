package appPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class RegisPageSukanya {

        public WebDriver driver;

        public RegisPageSukanya(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

        }

        @FindBy(xpath = "//Select[@id='location']")
        private WebElement location;
        @FindBy(css = "button.confirm")
        private WebElement continueButton;
        @FindBy(id = "bahmni.registration")
        private WebElement regiatrationLink;

        @FindBy(className = "fa-plus")
        private WebElement createNewButton;
        @FindBy(id = "givenName")
        private WebElement firstName;
        @FindBy(id = "familyName")
        private WebElement lastName;
        @FindBy(id = "gender")
        private WebElement gender;
        @FindBy(id="birthdate")
        private WebElement birthDate;
        @FindBy(className = "right")
        private WebElement saveButton;
        @FindBy(css = "span.mylegend")
        private WebElement successmsg;
        public boolean verifyLocationPage() {
            return continueButton.isDisplayed();
        }

        public void selectWard(String Ward) {
            new Select(location).selectByVisibleText(Ward);
            continueButton.click();

        }

        public void CreateNewPatient() {
            regiatrationLink.click();
            createNewButton.click();
        }

        public void enteringDetails(String fName, String lName, String Gender, String dob) {
            firstName.sendKeys(fName);
            lastName.sendKeys(lName);
            if (Gender.trim().equalsIgnoreCase("Female")) {
                new Select(gender).selectByVisibleText("Female");
            } else if (Gender.trim().equalsIgnoreCase("Male")) {
                new Select(gender).selectByVisibleText("Male");
            } else if (Gender.trim().equalsIgnoreCase("Other")) {
                new Select(gender).selectByVisibleText("Other");
            } else {
                new Select(gender).selectByVisibleText("Select Gender");
            }
            birthDate.sendKeys(dob);
        }
        public void setSaveButton(){
            saveButton.click();
        }

        public void secondSaveButton(){
            continueButton.click();

        }
        public boolean verifySuccessSave(){
            return successmsg.isDisplayed();
        }
        public boolean verifyErrormsg(){
            return firstName.isDisplayed();
        }
    }


