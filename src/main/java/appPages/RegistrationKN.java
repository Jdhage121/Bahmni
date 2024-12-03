package appPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

    public class RegistrationKN
    {
        public WebDriver driver;

      public RegistrationKN(WebDriver driver){
          this.driver=driver;
      }
        public By Registration = By.id("bahmni.registration");
        public void clickonRegistration()
        {
            driver.findElement(Registration).isDisplayed();
            driver.findElement(Registration).click();
        }
    public void navigateToCapturePatientDetails() throws InterruptedException
        {
      driver.findElement(By.id("view-content")).click();
      Thread.sleep(3000);
        }
  public void createPatientRegistration(String firstname,String lastname, String gender,String age) throws InterruptedException
     {
        // driver.findElement(Idnumber).sendKeys("ABC2234");
         Thread.sleep(2000);

//         driver.findElement(By.id("givenName")).sendKeys("Kavi");
//         Thread.sleep(2000);
//         driver.findElement(By.id("givenName")).sendKeys("Kavi");
//         Thread.sleep(2000);
         driver.findElement(By.id("givenName")).sendKeys("Kavi");
        Thread.sleep(2000);
        driver.findElement(By.id("familyName")).sendKeys("Sam");
        Thread.sleep(1000);
        Select select = new Select(driver.findElement(By.id("gender")));
        //select.selectByVisibleText(By.id("Female"));
        driver.findElement(By.id("ageYears")).sendKeys("23");
        Thread.sleep(1000);
     }
//public void clickStartOPD() throws InterruptedException
//   {
//        driver.findElement(By.class("split-button")).click();
//        Thread.sleep(3000);
//   }
}

