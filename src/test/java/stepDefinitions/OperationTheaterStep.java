package stepDefinitions;

import appPages.OperationTheaS;
import drivers.DriverManager;
import io.cucumber.java.en.Then;
    public class OperationTheaterStep {
        OperationTheaS otm = new OperationTheaS(DriverManager.getDriver());


        @Then("user click on the OperationTheatre  module from home page")
        public void user_click_on_the_operation_theatre_module_from_home_page() throws InterruptedException {
            otm.navigateToOT();
            Thread.sleep(3000);
        }

        @Then("user click on the OT Scheduling")
        public void user_click_on_the_ot_scheduling() throws InterruptedException {

            otm.navigatetoOTtxtbox();
            Thread.sleep(3000);
        }
        @Then("user clicks on New Surgical Block")
        public void user_clicks_on_new_surgical_block() throws InterruptedException {
            otm.navigateSurgical();
            Thread.sleep(3000);
        }
        @Then("user is able to enter surgoen detalis")
        public void user_is_able_to_enter_surgoen_detalis() {
            otm.createSurgicalBlock();
            try {
                Thread.sleep(5000);
            }catch (Exception e){

            }

        }

}
