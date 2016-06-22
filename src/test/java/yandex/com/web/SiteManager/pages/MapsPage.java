package yandex.com.web.SiteManager.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MapsPage extends BasePage{
    private static MapsPage instance;
    public static WebDriver driver;
    public static MapsPage get() {
        if (instance == null) {
            instance = new MapsPage().init();
        }
        return instance;
    }


    protected MapsPage() {
        this.driver=getDriver();
    }
    protected MapsPage init() {
        PageFactory.initElements(driver, this);
        return this;
    }

    @FindBy(xpath="//*[@class='header-view__control-layout']//*[@class='toggle-button_islet-air__text']")
    WebElement title;


    public String getTitle(){
        System.out.println("Current object is not displayed at page");
        return title.getText();
    }

    public void openMarshroots(){
        title.click();
    }
}
