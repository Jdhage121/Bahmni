package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminpageCSVUpload {
public WebDriver driver;
	public AdminpageCSVUpload(WebDriver driver) {
		this.driver=driver;
	}
	
	private By CSVUpload = By.xpath("//a[text()='CSV Upload']");
	private By radiobutton = By.name("upload-type");
	private By Choosefile = By.linkText("Choose file(s)");
	private By Uploadbutton = By.linkText("Upload");
	
	
	
	public void navigatetoCSVUploadpage() throws InterruptedException {
		driver.findElement(CSVUpload).click();
		Thread.sleep(3000);
	}
	
	public void CSVUploadfile() {
		driver.findElement(radiobutton).click();
		driver.findElement(Choosefile).click();
		WebElement uploadfile = driver.findElement(Choosefile);
		uploadfile.sendKeys("D:\\Downloads.D\fileupload.jpeg");
		driver.findElement(Uploadbutton).click();
	}
	
	
	
}
