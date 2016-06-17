package yandex.com.web.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import yandex.com.web.SiteManager.SiteManager;

public abstract class BaseTest {
    private WebDriver driver;
    private String URL;
    protected static SiteManager siteManager;

    @BeforeClass(alwaysRun = true)
    public void initialisation() {
        //driver = new FirefoxDriver();
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("plugin.state.java", 2);
        System.setProperty("webdriver.firefox.bin", "/usr/bin/firefox");
        //System.setProperty("webdriver.chrome.driver", "D:\\chrome_2.20\\chromedriver.exe");
        if (URL == null) {URL = "http://yandex.ua";}
        if (driver==null){
            driver= new ChromeDriver();
        }
        siteManager = new SiteManager(URL,driver);
        //siteManager = new SiteManager(URL);
 // нужно для jenkins
/*        firefox.setCapability(FirefoxDriver.PROFILE, profile);
        driver = new FirefoxDriver();
        siteManager = new SiteManager(URL,driver);*/
/*
        WebDriverFactory.dismissAll();

        WebDriverFactory.setMode(WebDriverFactoryMode.SINGLETON);

        firefox.setCapability(FirefoxDriver.PROFILE, profile);
        driver = WebDriverFactory.getDriver(firefox);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebDriverRunner.setWebDriver(driver);
*/

    }

    @AfterClass(alwaysRun = true)
    public void offTestServer() {
        siteManager.quit();
    }
}
