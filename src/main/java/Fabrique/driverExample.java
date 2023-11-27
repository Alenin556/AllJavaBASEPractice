package Fabrique;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverExample {

    WebDriver getWebDriver(String browserName){
        switch (browserName){
            case "chrome":
                return new ChromeDriver();
            case "firefox":
                return new FirefoxDriver();
            default:
                throw new RuntimeException("Incorrect BrowserName");
        }
    }

}
