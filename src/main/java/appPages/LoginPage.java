package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {


    public WebDriver driver;


    public LoginPage(WebDriver driver){

        this.driver=driver;
//        PageFactory.initElements(this.driver,driver);
    }

    // to store the locators

    // top perform the actions on the locators

    private By textUsername=By.id("username");
    private By textPassword=By.id("password");
    private By selectLocation=By.id("location");
    private By buttonLogin=By.xpath("//button[@type='submit' and text()='Login']");

//    //@FindBy is replacement of driver.findElement()
//    @FindBy(id="username") WebElement userName;
//
//    @FindBy(id="password") WebElement password;
//    @FindBy(id="location") WebElement location;
//    @FindBy(xpath = "//button[@type='submit' and text()='Login']") WebElement loginBtn;

    public void loginToBahmniApp(String username, String password) throws InterruptedException {
        driver.findElement(textUsername).sendKeys(username);
        driver.findElement(textPassword).sendKeys(password);
        driver.findElement(buttonLogin).click();
        Select select=new Select(driver.findElement(selectLocation));
        select.selectByVisibleText("Bahmni Clinic");
        driver.findElement(By.xpath("//button[text()='Submit Location']")).click();
        Thread.sleep(5000);
    }
}
