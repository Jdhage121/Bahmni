package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OTDeeksha_POM {

    private WebDriver driver;

    public OTDeeksha_POM(WebDriver driver) {
        this.driver = driver;
    }

    public void clickonOT() throws InterruptedException {

        driver.findElement(By.id("bahmni.ot")).click();
        Thread.sleep(3000);
    }
    public void clickonOTScheduling() throws InterruptedException {
        driver.findElement(By.xpath("//span[text()='OT Scheduling']")).click();
        Thread.sleep(3000);
    }

    public void clickonnewsurgical() throws InterruptedException {
        driver.findElement(By.xpath("//button[@class='back-btn dashboard-link ot-surgical-button']")).click();
        Thread.sleep(3000);
    }
    public void createSurgicalBlock() throws InterruptedException {

        Select se = new Select(driver.findElement(By.cssSelector("select[ng-model='surgicalForm.provider']")));
        se.selectByVisibleText("testuser");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[text()='testuser']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//label[@for='Orthopaedic OT']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[ng-model='surgicalForm.startDatetime']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[ng-model='surgicalForm.endDatetime']")).click();
        Thread.sleep(1000);
//        driver.findElement(By.xpath("//button[text()='Cancel Block']")).click();
//        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@class='ot-nav-save']")).click();
        Thread.sleep(3000);
    }

}
