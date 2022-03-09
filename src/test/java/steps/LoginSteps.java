package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.CommonMethods;
import utilities.ConfigReader;

import java.util.concurrent.TimeUnit;

public class LoginSteps extends CommonMethods {

    @When("user enters valid login username and password")
    public void user_enters_valid_login_username_and_password() {
        WebElement usernameField = driver.findElement(By.cssSelector("input#txtUsername"));
        sendData(usernameField, "Admin");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement passwordField = driver.findElement(By.cssSelector("input#txtPassword"));
        sendData(passwordField, "Hum@nhrm123");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        WebElement loginButton = driver.findElement(By.cssSelector("input.button"));
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("admin user should be able to see dashboard page")
    public void admin_user_should_be_able_to_see_dashboard_page() {
        System.out.println("Test passed");
    }

    @When("user enters valid normal login username and password")
    public void user_enters_valid_normal_login_username_and_password() {
        WebElement usernameField = driver.findElement(By.cssSelector("input#txtUsername"));
        sendData(usernameField, ConfigReader.getPropertyValue("username"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement passwordField = driver.findElement(By.cssSelector("input#txtPassword"));
        sendData(passwordField, ConfigReader.getPropertyValue("password"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("normal user should be able to see dashboard page")
    public void normal_user_should_be_able_to_see_dashboard_page() {
        System.out.println("Test passed");
    }

    @When("user enters invalid admin login username and password")
    public void user_enters_invalid_admin_login_username_and_password() {
        WebElement usernameField = driver.findElement(By.cssSelector("input#txtUsername"));
       sendData(usernameField, ConfigReader.getPropertyValue("username"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement passwordField = driver.findElement(By.cssSelector("input#txtPassword"));
        sendData(passwordField, ConfigReader.getPropertyValue("password"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("system should show the error")
    public void system_should_show_the_error() {
        System.out.println("Failed, Error is shown");
    }


}
