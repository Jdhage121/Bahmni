package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AdminModule {
    public WebDriver driver;
    public AdminModule(WebDriver driver){
        this.driver=driver;
    }
    public By adminModuleBtn = By.xpath("//a[@id='bahmni.admin']");
    public By csvUploadBtn = By.xpath("//a[text()='CSV Upload']");
    public By uploadBtn = By.xpath("//button[contains(text(),'Upload')]");
    public void clickOnAdminModule(){
        driver.findElement(adminModuleBtn).click();
    }
    public WebElement csvUpload(){
        return driver.findElement(csvUploadBtn);
    }
    public WebElement getElemntByLinkText(String value){
        return driver.findElement(By.xpath("//a[text()='"+value+"']"));
    }
    public void selectFile(String fileType){
        driver.findElement(By.id(fileType)).click();
    }
    public void uploadFile(WebElement element){
        String js = "arguments[0].style.height='auto';arguments[0].style.visibility='visible';";
        ((JavascriptExecutor)driver).executeScript(js,element);
        element.sendKeys("C:\\Users\\sri\\IdeaProjects\\Bahmni\\src\\main\\resources\\test.pdf");
       driver.findElement(uploadBtn).click();
        Assert.assertTrue(driver.findElement(By.xpath("//li[@ng-repeat='file in visit.files | reverse']")).isDisplayed());
    }

}
