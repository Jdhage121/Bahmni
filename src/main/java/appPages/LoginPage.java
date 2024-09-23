package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends BaseAction {


    public WebDriver driver;


    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }


    // to store the locators

    // top perform the actions on the locators


    private By textUserName = By.id("username");
    private By textPassword = By.id("password");
    private By selectLocation = By.id("location");
    private By buttonLogin = By.xpath("//button[@type='submit' and text()='Login']");


    public void loginToBahmniApp(String username, String password) throws InterruptedException {
        driver.findElement(textUserName).sendKeys(username);
        driver.findElement(textPassword).sendKeys(password);
        driver.findElement(buttonLogin).click();
        Select select = new Select(driver.findElement(selectLocation));
        select.selectByVisibleText("General Ward");
        driver.findElement(By.xpath("//button[text()='Continue']")).click();
        Thread.sleep(5000);
    }
}



