package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.CommonMethods;

import java.util.concurrent.TimeUnit;

import static steps.LoginSteps.driver;
import static utilities.CommonMethods.sendData;

public class EmployeeSteps extends CommonMethods {


    @When("user click on PIM option")
    public void user_click_on_pim_option() {
        WebElement pimOption = driver.findElement(By.cssSelector("a#menu_pim_viewPimModule"));
        pimOption.click();
    }

    @When("user clicks on add employee option")
    public void user_clicks_on_add_employee_option() {
        WebElement addEmployee = driver.findElement(By.cssSelector("a#menu_pim_addEmployee"));
        addEmployee.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("user enters firstname middlename and lastname")
    public void user_enters_firstname_middlename_and_lastname() {
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement middleName = driver.findElement(By.id("middleName"));
        WebElement lastName = driver.findElement(By.id("lastName"));

    firstName.sendKeys("mike");
    middleName.sendKeys("lopez123");
    lastName.sendKeys("ekaterina");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        WebElement saveButton = driver.findElement(By.id("btnSave"));
        saveButton.click();
    }

    @Then("employee added successfully")
    public void employee_added_successfully() {
        System.out.println("Test passed");
       // driver.quit();
    }

    @When("user enters {string} {string} and {string} values")
    public void user_enters_and_values(String firstname, String middlename, String lastname) {
        WebElement firstNameField = driver.findElement(By.id("firstName"));
        WebElement middleNameField = driver.findElement(By.id("middleName"));
        WebElement lastNameField = driver.findElement(By.id("lastName"));

      sendData(firstNameField, firstname);
      sendData(middleNameField, middlename);
      sendData(lastNameField, lastname);
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("user enters {string} {string} {string} values")
    public void user_enters_values(String firstname, String middlename, String lastname) {
        WebElement firstNameField = driver.findElement(By.id("firstName"));
        WebElement middleNameField = driver.findElement(By.id("middleName"));
        WebElement lastNameField = driver.findElement(By.id("lastName"));

        sendData(firstNameField, firstname);
        sendData(middleNameField, middlename);
        sendData(lastNameField, lastname);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

}
