package appPagesMs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPageMs {
    private By textUsername = By.id("username");
    private By textPassword = By.id("password");
    private By selectLocation = By.id("location");
    private By buttonLogin = By.xpath("//button[@type='submit' and text()='Login']");
    public WebDriver driver;

    public LoginPageMs(WebDriver driver) {
        this.driver = driver;
    }

    public void loginToBahmniApp1(String username, String password) throws InterruptedException {
        driver.findElement(textUsername).sendKeys(username);
        driver.findElement(textPassword).sendKeys(password);
        driver.findElement(buttonLogin).click();
       Thread.sleep(5000);

    }

    public String getTextOf() {
        return driver.findElement(By.xpath("//*[@class='login']/form/div/div[1]/div/div")).getText();
    }
}