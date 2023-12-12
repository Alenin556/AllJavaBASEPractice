package Parametrized.WEBTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverFabrique {

    static WebDriverManager fabriqueGetWebDriver(String browserName){
        switch (browserName){
            case "chrome":
                return WebDriverManager.chromedriver();
            case "firefox":
                return  WebDriverManager.firefoxdriver();
            default:
                throw new RuntimeException("Incorrect BrowserName");
        }
    }

}
