package Selenium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumDriver  {

    public static WebDriver webdriver; // driver intermediaire
    public static EventFiringWebDriver driver; // driver final

    public static WebDriverWait wait;
    public static Long defaultImplicitlyWaitTimeOut = (long) 60;



    public SeleniumDriver() {
        super();
    }

    public static void startApp(){

        SeleniumEvent handler = new SeleniumEvent();

        //String driverPath = "./src/main/resources/webdriver/geckodriver.exe";
        String driverPath = "./src/main/resources/webdriver/chromedriver.exe";

        //System.setProperty("webdriver.gecko.driver", driverPath);
        System.setProperty("webdriver.chrome.driver", driverPath);

        //webdriver = new FirefoxDriver();
        webdriver = new ChromeDriver();

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        //webdriver = new RemoteWebDriver(new URL("http://localhost:7777/wd/hub"), capabilities);
        //webdriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);

		    /*DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			webdriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);*/

        driver = new EventFiringWebDriver(webdriver);
        driver.register(handler);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(defaultImplicitlyWaitTimeOut, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        wait = new WebDriverWait(driver, 60);
    }


    public static void deleteCookies() throws Exception {
        driver.manage().deleteAllCookies();
        Thread.sleep(2000);
    }

    public static void stopApp() throws Exception {
        driver.quit();
    }
}
