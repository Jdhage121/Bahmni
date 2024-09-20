package stepDefinitions;

import drivers.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CommonActions {


// open browser
//close browser
// in TestNG there are annotations called Before and After


    private DriverManager driverManager;
    private ConfigReader configReader;
    private WebDriver driver;
    private Properties properties;



    @Before(order=1)
    public void beforeEveryScenario() throws IOException {

        configReader=new ConfigReader();
        properties=configReader.getData();
        driverManager =new DriverManager();
        driver=driverManager.initialiseBrowser(properties.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }


    @After
    public void afterEveryScenario(){
        if(driver!=null) {
            driver.close();
        }

    }



}
