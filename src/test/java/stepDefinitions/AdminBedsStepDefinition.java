package stepDefinitions;

import appPages.AdminpageBeds;
import appPages.HomePage;
import drivers.DriverManager;
import io.cucumber.java.en.Then;

public class AdminBedsStepDefinition {
  HomePage homepage = new HomePage(DriverManager.getDriver());
  AdminpageBeds beds = new AdminpageBeds();
  
  @Then("user click on the Admin Module")
  public void user_click_on_the_Admin_Module() throws InterruptedException {
	  homepage.navigateToAdminScreen();
  }
  
  @Then("user select the Beds")
  public void user_select_the_Beds() throws InterruptedException {
	  beds.Bedalocation("316-c");
  }
  @Then("user should able to see the bed alocation")
  public void user_should_able_to_see_the_bed_alocation() {
	  
  }
}
