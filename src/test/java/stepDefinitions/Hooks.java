//package stepDefinitions;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Hooks
//{
//    public static WebDriver driver;
//
//    @Before
//    public void loadbrowser()
//
//    {
//        WebDriverManager.chromedriver().clearDriverCache().setup();
//        driver = new ChromeDriver();
//        driver.get("https://qa.snomed.mybahmni.in/bahmni/home/index.html#/login");
//        driver.manage().window().maximize();
//    }
//    @After
//    public void close()
//    {
//        driver.quit();
//
//    }
//}
