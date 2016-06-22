package yandex.com.web.SiteManager.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
    private static WebDriver driver;
    private static HomePage instance;
    public static HomePage get() {
        if (instance == null) {
            instance = new HomePage().init();
        }
        return instance;
    }
    protected HomePage() {
        this.driver=getDriver();
    }

    protected HomePage init(){
        PageFactory.initElements(driver, this);
        return this;
    }

    @FindBy(xpath="//*[@data-id='maps']")
    WebElement title;

    public void openMapsPage(){
        title.click();
    }

}
