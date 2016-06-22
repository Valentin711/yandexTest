package yandex.com.web.tests;


import com.sun.javafx.collections.MappingChange;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import yandex.com.web.SiteManager.SiteManager;

public abstract class BaseTest {
    private WebDriver driver;
    private String URL;
    public static SiteManager siteManager;

    @BeforeClass(alwaysRun = true)
    public void initialisation() {
        //driver = new FirefoxDriver();
        //FirefoxProfile profile = new FirefoxProfile();
        //profile.setPreference("plugin.state.java", 2);
        //ChromeDriverManager.getInstance().setup();
        //System.setProperty("webdriver.chrome.driver", "D:\\chrome_2.20\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", "C:\\pathto\\my\\chromedriver.exe");
        //DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        //System.setProperty("webdriver.chrome.driver", "D:\\chrome_2.20\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-firefox-driver\\2.29.1");
/*        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("test-type");
        //capabilities.setCapability("webdriver.chrome.driver", "D:\\chrome_2.20\\chromedriver.exe");

        //capabilities.setCapability("binary", "C:\\Users\\user\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-firefox-driver\\2.29.1");

        //"firefox.binary",
        capabilities.setCapability("binary","C:\\Users\\user\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-firefox-driver\\2.29.1\\selenium-firefox-driver-2.29.1.jar");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);*/
/*        System.setProperty("webdriver.binary", "C:\\Users\\user\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-firefox-driver\\2.29.1\\selenium-firefox-driver-2.29.1.jar");

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        capabilities.setCapability("binary", "C:\\Users\\user\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-firefox-driver\\2.29.1\\selenium-firefox-driver-2.29.1.jar");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);*/
// options.setBinary("C:\\Users\\user\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\2.53.0\\selenium-chrome-driver-2.53.0");
        /*        options.addArguments("google-base-url=http://yandex.ua");
        options.addArguments("custom-launcher-page=http://yandex.ua");
        options.addArguments("gaia-url=http://yandex.ua");
        options.addArguments("google-url=http://yandex.ua");
        options.addArguments("url=http://yandex.ua");*/

        System.setProperty("webdriver.chrome.driver", "D:\\chrome_2.20\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        if (URL == null) {URL = "http://yandex.ua";}
        //if (driver==null) {this.driver = new ChromeDriver(options);}

        siteManager = new SiteManager();

    }

    @AfterClass(alwaysRun = true)
    public void offTestServer() {
        siteManager.quit();
    }
}
