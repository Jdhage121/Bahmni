package stepDefinitions;

import appPages.AdminModule;
import drivers.DriverManager;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AdminStepDefination {

    AdminModule admin = new AdminModule(DriverManager.getDriver());
    @Then("user click on the Admin module from the home page")
    public void user_click_on_the_admin_module_from_the_home_page() {
        admin.clickOnAdminModule();
    }
    @Then("user is on the admin module page")
    public void user_is_on_the_admin_module_page() {
        Assert.assertTrue(admin.csvUpload().isDisplayed());
    }
    @Then("user click on the {string}")
    public void user_click_on_the(String tabName) {
        admin.getElemntByLinkText(tabName).click();
    }

    @Then("user select file type as {string}")
    public void user_select_file_type(String fileType){
        admin.selectFile(fileType);
    }

    @Then(("user upload the csv file"))
    public void uploadFile(){
        try {
            Thread.sleep(5000);
        }catch (Exception e){

        }
        admin.uploadFile(DriverManager.getDriver().findElement(By.xpath("//input[@type='file']")));
    }

}
