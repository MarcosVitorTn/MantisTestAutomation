package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (Config.getBrowser().equals("chrome")){
            if (driver == null) {
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                ChromeOptions options = new ChromeOptions();
                if (Config.getHEADLESS()){options.addArguments("--headless=new");}
                options.addArguments("--disable-gpu");
                options.addArguments("--window-size=1920,1080");
                driver = new ChromeDriver(options);
            }
        }
        if (Config.getBrowser().equals("firefox")){
            if (driver == null){
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
                FirefoxOptions options = new FirefoxOptions();
                if (Config.getHEADLESS()){options.addArguments("--headless");}
                options.addArguments("--window-size=1920,1080");
                driver = new FirefoxDriver(options);
            }
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
