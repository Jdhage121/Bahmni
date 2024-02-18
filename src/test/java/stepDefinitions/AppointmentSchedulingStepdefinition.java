package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AppointmentSchedulingStepdefinition {

        private WebDriver driver;

        @Given("user launches the application")
        public void userLaunchesApplication() {
            driver.get("https://docker.standard.mybahmni.in/bahmni/home/index.html#/login");
        }

        @When("user enters the login credentials and click on login button")
        public void userEntersCredentialsAndClicksLogin() {
            driver.findElement(By.id("username")).sendKeys("superman");
            driver.findElement(By.id("password")).sendKeys("Admin123");
            driver.findElement(By.id("loginButton")).click();
        }

        @Then("user should be able to login to the app")
        public void userShouldBeAbleToLogin() {
                assert true; driver.findElement(By.id("loggedInUserName")).isDisplayed();
        }

        @Then("user click on the Appointment Scheduling module from the home page")
        public void user_click_on_the_appointment_scheduling_module_from_the_home_page() {
                try {
                        Thread.sleep(5000);
                }catch (Exception e){

                }
                driver.findElement(By.linkText("Appointment Scheduling")).click();
                throw new io.cucumber.java.PendingException();
        }

        @Then("user is on the Appointment Scheduling module page")
        public void user_is_on_the_appointment_scheduling_module_page() {
                try {
                        Thread.sleep(5000);
                }catch (Exception e){

                }
                driver.findElement(By.linkText("Appointment Scheduling")).click();
                throw new io.cucumber.java.PendingException();
                }
        }
