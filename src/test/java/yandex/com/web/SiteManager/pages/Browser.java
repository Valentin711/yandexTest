package yandex.com.web.SiteManager.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser{
        private static WebDriver driver;
        public static WebDriver getDriver(){
            if(driver==null){ driver = new FirefoxDriver();}
            return driver;
        }
        public static void CloseDriver()
        {
            if (driver != null) driver.quit();
        }
}
