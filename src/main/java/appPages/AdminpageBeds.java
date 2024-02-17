package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AdminpageBeds {
public WebDriver driver;
public void Beds(WebDriver driver) {
	this.driver =driver;
}
private By Beds = By.xpath("//a[@text()='Beds']");
private By GeneralWard = By.xpath(("//span[@text()='General Ward']"));
private By GeneralWardRoom1 = By.xpath(("//span[@text()='General Ward Room 1']"));
private By Addbed = By.xpath(("//span[@text()='Add Bed']"));
private By BedNumber = By.id("bed-number-field");
private By BedType = By.id("bed-type");
private By Savebutton = By.name("submit");

public void navigatetoBeds() throws InterruptedException {
	driver.findElement(Beds).click();
	Thread.sleep(3000);
}

public void Bedalocation(String Bedno) throws InterruptedException {
	driver.findElement(GeneralWard).click();
	driver.findElement(GeneralWardRoom1).click();
	driver.findElement(Addbed).click();
	driver.findElement(BedNumber).sendKeys(Bedno);
	Select select=new Select(driver.findElement(BedType));
	select.deselectByVisibleText("deluxe");
	driver.findElement(Savebutton).click();
	Thread.sleep(3000);
}
}
