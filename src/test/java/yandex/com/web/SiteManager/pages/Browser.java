package yandex.com.web.SiteManager.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser{
        private static WebDriver driver;
        public static WebDriver getDriver(){
            if(driver==null){ driver = new ChromeDriver();}
            return driver;
        }
        public static void CloseDriver()
        {
            if (driver != null) driver.quit();
        }
}
