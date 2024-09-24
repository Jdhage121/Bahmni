package stepDefinitions;

import appPages.OTDeeksha_POM;
import drivers.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class OT_Deeksha {

    OTDeeksha_POM otm = new OTDeeksha_POM(DriverManager.getDriver());
    @Then("user click on Operation Theatre button on homepage")
    public void user_click_on_operation_theatre_button_on_homepage() throws InterruptedException {

        otm.clickonOT();
    }
    @Then("click on OT Scheduling")
    public void click_on_ot_scheduling() throws InterruptedException {

        otm.clickonOTScheduling();
    }
    @Then("click on the button New Surgical Block")
    public void click_on_the_button_new_surgical_block() throws InterruptedException {
    otm.clickonnewsurgical();
    }
    @Then("User is able to enter Surgeon details")
    public void user_is_able_to_enter_surgeon_details() throws InterruptedException {
    otm.createSurgicalBlock();
    }


    @And("click on save button")
    public void clickOnSaveButton() {
    }
}
