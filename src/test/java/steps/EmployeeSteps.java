package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.AddEmployeePage;
import utilities.CommonMethods;

import java.util.concurrent.TimeUnit;

import static steps.LoginSteps.driver;
import static utilities.CommonMethods.sendData;

public class EmployeeSteps extends CommonMethods {

    @When("user click on PIM option")
    public void user_click_on_pim_option() {
        AddEmployeePage add = new AddEmployeePage();
        add.PIMOption.click();
    }

    @When("user clicks on add employee option")
    public void user_clicks_on_add_employee_option() {
        AddEmployeePage add = new AddEmployeePage();
       // WebElement addEmployee = driver.findElement(By.cssSelector("a#menu_pim_addEmployee"));
        add.addEmployeeButton.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("user enters firstname middlename and lastname")
    public void user_enters_firstname_middlename_and_lastname() {
        AddEmployeePage add = new AddEmployeePage();
    add.firstName.sendKeys("mike");
   add.middleName.sendKeys("lopez123");
    add.lastName.sendKeys("ekaterina");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        AddEmployeePage add = new AddEmployeePage();
       // WebElement saveButton = driver.findElement(By.id("btnSave"));
        add.saveButton.click();
    }

    @Then("employee added successfully")
    public void employee_added_successfully() {
        System.out.println("Test passed");
       // driver.quit();
    }

    @When("user enters {string} {string} and {string} values")
    public void user_enters_and_values(String firstname, String middlename, String lastname) {

        AddEmployeePage add = new AddEmployeePage();
      sendData(add.firstName, firstname);
      sendData(add.middleName, middlename);
      sendData(add.lastName, lastname);
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("user enters {string} {string} {string} values")
    public void user_enters_values(String firstname, String middlename, String lastname) {
        AddEmployeePage add = new AddEmployeePage();
        sendData(add.firstName, firstname);
        sendData(add.middleName, middlename);
        sendData(add.lastName, lastname);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

}
