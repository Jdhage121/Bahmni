package appPages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OperationTheaS {
    public WebDriver driver;
    String date,month,year,hours,minutes;



    public OperationTheaS(WebDriver driver){

        this.driver=driver;
    }


    private By btn_operationTheatre=By.id("bahmni.ot");
    private By btn_OTScheduling = By.xpath("//span[text()='OT Scheduling']");
    private By btn_newsurgical= By.xpath("//button[@class='back-btn dashboard-link ot-surgical-button']");
    private By selectsurgeon=By.cssSelector("select[ng-model='surgicalForm.provider']");

    private By otTest=By.xpath("//label[@class='location-buttons']");
    private By startDateTime_btn=By.cssSelector("input[ng-model='surgicalForm.startDatetime']");
    private By endDateTime_btn=By.cssSelector("input[ng-model='surgicalForm.endDatetime']");
    private By cancel_btn=By.xpath("//button[text()='Cancel Block']");
    private By save_btn=By.xpath("//input[@class='ot-nav-save']");
    public void navigateToOT() throws InterruptedException {
        driver.findElement(btn_operationTheatre).click();
        Thread.sleep(3000);
    }

    public void navigatetoOTtxtbox() {


        driver.findElement(btn_OTScheduling).click();
    }

    public void navigateSurgical(){
        driver.findElement(btn_newsurgical).click();
    }
    public void createSurgicalBlock() {

        Select se = new Select(driver.findElement(selectsurgeon));
        se.selectByVisibleText("Yogesh Kumar");
        driver.findElement(By.xpath("//option[text()='Yogesh Kumar']"));
        driver.findElement(otTest).click();
        StartandEndTimeSelect( driver.findElement(startDateTime_btn));

        //   driver.findElement(startDateTime_btn).sendKeys("17/02/2024 01:30");
    }
    public void sdt (){
        driver.findElement(startDateTime_btn).click();
    }
    public void edt (){
        driver.findElement(endDateTime_btn).click();
    }



    public void StartandEndTimeSelect(WebElement ele ) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date date = new Date();
        String s = formatter.format(date);
        // System.out.println(s);
        //jsexecutorSetText(ele,s);
        ele.sendKeys(s+Keys.TAB + s.split(" ")[1] );
        driver.findElement(By.xpath("(//*[text()='Today'])[1]")).click();
                 /*ele.click();
                 ele.sendKeys(s+Keys.END + s.split(" ")[1]*/


    }
    public void jsexecutorSetText(WebElement  element,String value ){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].value='"+ value +"';", element);



    }


}
