package yandex.com.web.SiteManager.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public static WebDriver driver;
    public final WebDriver getDriver (){
        if(driver==null){
            driver = new Browser().getDriver();
        }
        return driver;
    }
}
