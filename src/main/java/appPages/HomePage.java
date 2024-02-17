package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {


    public WebDriver driver;


    public HomePage(WebDriver driver){

        this.driver=driver;
    }


    private By registrationButton = By.id("bahmni.registration");
    private By AdminButton        = By.id("bahmni.admin");
    public void navigateToregistrationScreen() throws InterruptedException {

        driver.findElement(registrationButton).click();
        Thread.sleep(3000);
    }
    
    public void navigateToAdminScreen() throws InterruptedException {
    	 driver.findElement(AdminButton).click();
         Thread.sleep(3000);
    }





}
