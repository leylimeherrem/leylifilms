package utils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Page;

public class BaseTests {
    private static WebDriver webDriver;

    protected static Page homePage;

   @BeforeClass
   public static void launchApplication() {
        setChromeDriverProperty();
        webDriver = new ChromeDriver();
        webDriver.get(Links.Home);
        homePage = new Page();
    }

    @AfterClass
    public static void closeBrowser(){
        webDriver.quit();
    }

    public static WebDriver getWebDriver(){
       return webDriver;
    }

    public static void setChromeDriverProperty() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

    }
}
