package appPages;

import drivers.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BaseAction {
    public WebDriver driver = DriverManager.getDriver();
    public void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectDropDownValue(WebElement element, String value){
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public String getCurrentSystemDate(int noOfhourse) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.HOUR, noOfhourse);
        return dateFormat.format(c.getTime());
    }

    public void jsexecutorSetText(WebElement element, String value) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].value='" + value + "';", element);
    }
}
