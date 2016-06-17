package yandex.com.web.SiteManager.pages.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import yandex.com.web.SiteManager.SiteManager;


public class Element {
    private WebElement element;
    @FindBy(xpath="//*[@data-id='maps']")
    WebElement title;
/*    public Element () {
        PageFactory.initElements(SiteManager().getDriver, title);
    }*/
}
