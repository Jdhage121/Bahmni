package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AdminpageCSVExport {
 public WebDriver driver;
 public void CSVExportpage(WebDriver driver){
	 this.driver= driver;
 }
	
	private By CSVExport = By.xpath("//a[text()='CSV Export']");
	private By Entertext = By.xpath("//input[@type='text'][@name='conceptSet']");
	private By ExportButton = By.xpath("//button[@type='submit' and text()='Export']");
	
	public void navigatetoCSVExportpage() throws InterruptedException {
		driver.findElement(CSVExport).click();
		Thread.sleep(3000);
	}
	
	public void CSVExportfile() throws InterruptedException {
		Select select = new Select(driver.findElement(Entertext));
		select.deselectByVisibleText("Drug Routes");
		driver.findElement(ExportButton).click();
		Thread.sleep(3000);
		
	}
}
