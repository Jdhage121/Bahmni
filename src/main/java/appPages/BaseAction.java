package appPages;

import drivers.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Set;


//import java.time.Duration;

public class BaseAction {
    public WebDriver driver = DriverManager.getDriver();

    public void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fluentWait(WebElement element) {
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
//wait.withTimeout(Duration.ofSeconds(100))
      //  .pollingEvery(Duration.ofSeconds(2))
       // wait.withTimeout(ofSeconds(100))  // threshold is 100 seconds
          //      .pollingEvery(ofSeconds(2))   // polling every 2 seconds
               // .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickElement(WebElement element) {
        fluentWait(element);
        element.click();
    }

    public void waitUntilElementIsDisplayed(WebElement element) {
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
      //  wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void verifyIsElementDisplayed(WebElement element) {
        waitUntilElementIsDisplayed(element);
        Assert.assertTrue(element.isDisplayed());
    }

    public void verifyElementText(WebElement element, String expectedResult) {
        waitUntilElementIsDisplayed(element);
        Assert.assertEquals(element.getText(), expectedResult);
    }

    public void verifyIsElementClickable(WebElement element) {
        Assert.assertTrue(element.isEnabled());
    }

    public void verifyAttributePlaceholderText(WebElement element, String expectedResult) {
        Assert.assertEquals(element.getAttribute("placeholder"), expectedResult);
    }

    public void selectDropDownValue(WebElement element, String value) {
        Select dropDown = new Select(element);
        dropDown.selectByVisibleText(value);
    }

    public void inputInfo(WebElement element, String input) {
        waitUntilElementIsDisplayed(element);
        element.sendKeys(input);
    }

    public String getCurrentSystemDate(int noOfHours) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.HOUR, noOfHours);
        return dateFormat.format(c.getTime());
    }

    public void waitUntilElementIsClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void clickElementUsingJs(WebElement element) {
        try {
            waitUntilElementIsClickable(element);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", element);
            Thread.sleep(1000);
            js.executeScript("arguments[0].click();", element);
            driver.navigate().refresh();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void assertTitle(String expectedResult) {
        try {
            Thread.sleep(3000);
            Assert.assertEquals(driver.getTitle(), expectedResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyElementContainsText(WebElement element, String expectedResult) {
        waitUntilElementIsDisplayed(element);
        if (element.getAttribute("textContent").trim().contains(expectedResult)) {
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
    }

    public void scrollIntoView(WebElement element) {
        try {
            waitUntilElementIsClickable(element);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", element);
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void handleAlert(String decision) {
        Alert alert = driver.switchTo().alert();
        if (decision.equals("accept")) {
            alert.accept();
        } else {
            alert.dismiss();
        }
    }

    public void handlePromptAlert(String input, String decision) {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(input);
        if (decision.equals("accept")) {
            alert.accept();
        } else {
            alert.dismiss();
        }
    }

    public void handleFrame(String value) {
        driver.switchTo().frame(value);
    }

    public void navigateBack() {
        driver.switchTo().defaultContent();
    }

    public void switchToChildWindow() {
        String parentWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
            }
        }
        driver.switchTo().window(parentWindow);
    }

    public void handleMultipleWindows(String title) {
        String parentWindow1 = driver.getWindowHandle();
        Set<String> windows1 = driver.getWindowHandles();
        for (String window : windows1) {
            driver.switchTo().window(window);
            if (driver.getTitle().equals(title)) {
                driver.switchTo().window(parentWindow1);
            }
        }
    }
}
