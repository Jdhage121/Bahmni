package stepDefinitions;

import appPages.DeekshaReg_POM;
import drivers.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeekshaRegistration {

        public DeekshaReg_POM reg = new DeekshaReg_POM(DriverManager.getDriver());
        //registration Reg = new registration();


        @Then("Clicks on the Registration tab")
        public void clicks_on_the_registration_tab() {
                       // DeekshaReg_POM reg = new DeekshaReg_POM(DriverManager.getDriver());
                reg.clickonReg();
        }

        @Then("Clicks on create new button")
        public void clicks_on_create_new_button() throws InterruptedException {

                reg.clickonCreateNew();

        }

        @Then("User enters {string} and {string} and {string} and {string}")
        public void user_enters_and_and_and(String fname, String lname, String gen, String age) throws InterruptedException {

                reg.RegForm(fname, lname, gen, age);

        }

        @Then("clicks on startOPD button")
        public void clicks_on_start_opd_button() throws InterruptedException {
               reg.clickStartOPD();
        }


}


