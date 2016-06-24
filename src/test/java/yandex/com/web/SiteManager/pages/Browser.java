package yandex.com.web.SiteManager.pages;


import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Browser{
        private static WebDriver driver;
        public static WebDriver getDriver(){
           // System.setProperty("webdriver.chrome.driver", "D:\\chrome_2.20\\chromedriver.exe");
            //System.setProperty("chrome.binary","D:\\chrome_2.20\\selenium-chrome-driver\\2.53.0\\");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            options.addArguments("--no-sandbox");
            options.addArguments("test-type");

            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
          //  capabilities.setCapability("chrome.binary","D:\\chrome_2.20\\selenium-chrome-driver\\2.53.0\\");
            capabilities.setCapability(ChromeOptions.CAPABILITY, options);



            ChromeDriverManager.getInstance().setup();


            if(driver==null){ driver = new ChromeDriver(capabilities);}return driver;}
        public static void CloseDriver(){if (driver != null) driver.quit();}
}
