package runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        features = {"src/test/resources/featureFiles"},
        glue = {"stepDefinitions","CommonActions"},
        plugin = {"pretty",

                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",

                "timeline:test-output-thread/"

        }, tags = ("@PatientDocumentsTest1")

)
public class PdTestNGTestRunner extends AbstractTestNGCucumberTests{
}
