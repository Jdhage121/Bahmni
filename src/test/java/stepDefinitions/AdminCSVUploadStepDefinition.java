package stepDefinitions;

import appPages.AdminpageCSVUpload;
import appPages.HomePage;
import drivers.DriverManager;
import io.cucumber.java.en.Then;

public class AdminCSVUploadStepDefinition {
	 HomePage homepage =new HomePage(DriverManager.getDriver());
	AdminpageCSVUpload CSVUpload = new AdminpageCSVUpload(DriverManager.getDriver());
	@Then("user click on the Admin Module")
		public void user_click_on_the_Admin_Module() throws InterruptedException {
		homepage.navigateToAdminScreen();
	}
	@Then("user select the CSV Upload")
	 public void user_select_the_CSV_Upload() throws InterruptedException {
		CSVUpload.navigatetoCSVUploadpage();
	}
	@Then("User select file type")
	public void User_select_file_type() {
		CSVUpload.CSVUploadfile();
	}
	
	@Then("user should able to upload the file ")
	public void user_should_able_to_upload_the_file () {
		
	}
}
