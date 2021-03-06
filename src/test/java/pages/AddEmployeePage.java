package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.CommonMethods;

public class AddEmployeePage extends CommonMethods {

    @FindBy(id="menu_pim_viewPimModule")
    public WebElement PIMOption;

    @FindBy(id="menu_pim_addEmployee")
    public WebElement addEmployeeButton;

    @FindBy(id="firstName")
    public WebElement firstName;

    @FindBy(id="middleName")
    public WebElement middleName;

    @FindBy(id="lastName")
    public WebElement lastName;

    @FindBy(id="btnSave")
    public WebElement saveButton;



    public AddEmployeePage(){
        PageFactory.initElements(driver, this);
    }
}
