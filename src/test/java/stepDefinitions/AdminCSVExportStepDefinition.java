package stepDefinitions;

import appPages.AdminpageCSVExport;
import appPages.HomePage;
import appPages.RegistrationPage;
import drivers.DriverManager;
import io.cucumber.java.en.Then;

public class AdminCSVExportStepDefinition {
	HomePage homepage =new HomePage(DriverManager.getDriver());
	   AdminpageCSVExport CSVExportpage = new AdminpageCSVExport();
	   @Then("user click on the Admin Module")
		public void user_click_on_the_Admin_Module() throws InterruptedException {
		homepage.navigateToAdminScreen();
			   }
	   @Then("user select the CSV Export")
	   public void user_select_the_CSV_Export() throws InterruptedException {
		   CSVExportpage.navigatetoCSVExportpage();
	   }
	  
	   @Then("user select the file and click on Export button")
	   public void user_select_the_file_and_click_on_Export_button() throws InterruptedException {
		   CSVExportpage.CSVExportfile();
	   }
	   
	   @Then("user should able to download the file")
	   public void user_should_able_to_download_the_file() {
		   
	   }
}
