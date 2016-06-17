package yandex.com.web.SiteManager;

import org.openqa.selenium.WebDriver;
import yandex.com.web.SiteManager.pages.BasePage;
import yandex.com.web.SiteManager.pages.HomePage;
import yandex.com.web.SiteManager.pages.MapsPage;

public class SiteManager extends BasePage{
    private static WebDriver driver;
    private String siteAddress;

    public SiteManager(WebDriver driver){
        this.driver = driver;
    }
    public SiteManager(String siteAddress, WebDriver driver) {
        this.driver = driver;
        this.siteAddress = siteAddress;
        driver.get(siteAddress);
    }
    public SiteManager(String siteAddress) {
        this.siteAddress = siteAddress;
        driver.get(siteAddress);
    }

    public HomePage getHomePage() {return HomePage.get();}
    public MapsPage getMapsPage() {return MapsPage.get();}

    public void quit(){
        driver.quit();
    }
/*  public HomePage getHomePage() {return HomePage.get(driver);}
    public MapsPage getMapsPage() {return MapsPage.get(driver);}*/

}

