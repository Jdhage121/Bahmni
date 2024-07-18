package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.HashMap;

public class DriverManager {
    public static ThreadLocal<WebDriver> container = new ThreadLocal<WebDriver>();

    public static synchronized WebDriver getDriver() {

        return container.get();
    }


    public WebDriver initialiseBrowser(String browserType) throws MalformedURLException {


        switch (browserType) {

            case "Chrome":
                WebDriverManager.chromedriver().setup();
                container.set(new ChromeDriver());
                break;

            case "Firefox":
                WebDriverManager.firefoxdriver().setup();
                container.set(new FirefoxDriver());
                break;

            case "Safari":
                WebDriverManager.safaridriver().setup();
                container.set(new SafariDriver());
                break;

            case "Edge":
                WebDriverManager.edgedriver().setup();
                container.set(new EdgeDriver());
                break;

            case "Remote":

                MutableCapabilities capabilities = new MutableCapabilities();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("incognito");  // ChromeOptions for starting chrome in incognito mode

                capabilities.setCapability(ChromeOptions.CAPABILITY, options);

                capabilities.setCapability("browserName", "Safari");
                capabilities.setCapability("browserVersion", "17.0");
                HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
                browserstackOptions.put("os", "OS X");
                browserstackOptions.put("osVersion", "Sonoma");
                capabilities.setCapability("bstack:options", browserstackOptions);
                String username = "prashanthsamudra_9uc23D";
                String accessKey = "LXtj4dZ84jzfXy9QKvY8";
                String BROWSERURL = "https://" + username + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub";
                container.set(new RemoteWebDriver(new URL(BROWSERURL), capabilities));


                break;

            default:
                System.out.println("Please provide the browserType value from Chrome/Firefox/Safari/Edge");
                break;

        }
        return getDriver();

    }


}
