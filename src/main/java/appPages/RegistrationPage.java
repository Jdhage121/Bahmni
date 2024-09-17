package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class RegistrationPage {

    public WebDriver driver;


    public RegistrationPage(WebDriver driver){

        this.driver=driver;
    }
    private By createNewButton = By.xpath("//span[@class='nav-link' and contains(text(),'Create')]");
    private By actualSrcName=By.xpath("//*[@id=\"view-content\"]/div[3]/section/div[1]/table/tbody/tr[1]/td[3]");
    private By search=By.xpath("//*[@id=\"view-content\"]/div[1]/header/ul/li[1]/a/span");
    private By firstNameText = By.id("givenName");
    private By lastNameText = By.id("familyName");
    private By selectGender = By.id("gender");
    private By ageText = By.id("ageYears");
    private By startOPD_Button= By.xpath("//button[text()='Start OPD visit']");
    private By saveButton=By.xpath("//button[@type='submit']");
    private By searchName = By.id("name");
    private By searchClick= By.xpath("//*[@id=\"view-content\"]/div[3]/section/section/article[2]/form/article[5]/div/button");


    public void navigateToCapturePatientDetails() throws InterruptedException {
        driver.findElement(createNewButton).click();
        Thread.sleep(7000);
    }

    public void searchClick() throws InterruptedException {

        Thread.sleep(5000);
        driver.findElement(search).click();
        Thread.sleep(3000);
        driver.findElement(searchName).click();
        Thread.sleep(3000);

    }

    public void searchByName(String name) throws InterruptedException {

         Thread.sleep(3000);
        driver.findElement(searchName).sendKeys(name);
        Thread.sleep(3000);
        driver.findElement(searchClick).click();
        Thread.sleep(5000);
    }

    public String actualSearchName() {
        driver.findElement(actualSrcName).getText();
        return driver.findElement(By.xpath("//*[@id=\"view-content\"]/div[3]/section/div[1]/table/tbody/tr[1]/td[3]")).getText();
    }

    public void createPatientRegistration(String firstname, String lastname, String gender, String age) throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(firstNameText).sendKeys(firstname);
        Thread.sleep(3000);
        driver.findElement(lastNameText).sendKeys(lastname);
        Thread.sleep(3000);
        driver.findElement(ageText).sendKeys(age);
        Thread.sleep(1000);
    }

    public List<String> getGenderOptions() {
        List<String> actualGenOption = new ArrayList<>();
        WebElement selectGender = driver.findElement(By.id("gender"));
        Select select = new Select(selectGender);
        List<WebElement> genderOptions = select.getOptions();
        for (int i = 0; i < genderOptions.size(); i++) {
            genderOptions.get(i).getText();//actual gender options
            actualGenOption.add(genderOptions.get(i).getText());
        }
        return actualGenOption;
    }


    public void clickStartOPD() throws InterruptedException {
        driver.findElement(startOPD_Button).click();
        Thread.sleep(3000);

    }

    public void clickSave() throws InterruptedException {
        driver.findElement(saveButton).click();
        Thread.sleep(3000);
    }

}
