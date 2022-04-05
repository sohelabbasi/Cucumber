package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class CommonMethods {

    public static WebDriver driver;

    public void openBrowser(){
        ConfigReader.readProperties(Constants.CONFIG_PATH);
        switch (ConfigReader.getPropertyValue("browser")){
            case "chrome":
                if(ConfigReader.getPropertyValue("headless").equals("true")) {
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.setHeadless(true);
                    WebDriverManager.chromedriver().setup();
                    //initializing the chrome driver instance
                    driver = new ChromeDriver(chromeOptions);
                    System.out.println("My browser is opened");
                }else{
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                }
                //to clear all the cookies
                driver.manage().deleteAllCookies();
                driver.manage().window().maximize();
            break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            break;

            default:
                throw new RuntimeException("Invalid browser name");
        }

        driver.get(ConfigReader.getPropertyValue("url"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    public static void sendData(WebElement element, String data){
        element.clear();
        element.sendKeys(data);
    }

    public void closeBrowser(){
        driver.quit();
    }
}
