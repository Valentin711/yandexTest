package yandex.com.web.SiteManager.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MapsPage extends BasePage{
    private static MapsPage instance;
    public static MapsPage get() {
        if (instance == null) {
            instance = new MapsPage();
        }
        return instance;
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
