package yandex.com.web.SiteManager.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    private static HomePage instance;
    public static HomePage get() {
        if (instance == null) {
            instance = new HomePage();
        }
        return instance;
    }

    @FindBy(xpath="//*[@data-id='maps']")
    WebElement title;

    public void openMapsPage(){
        title.click();
    }

}
