package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookWelcomePage extends BasicActions {


    @FindBy (xpath = "//a[contains(., 'News Feed')]")
    private WebElement newsFeed;

    public FacebookWelcomePage(WebDriver driver) {
        super(driver);
    }

    public FacebookWelcomePage validateFacebookWelcomePage() {
        checkElementPresent(newsFeed, "newsFeed");
        return this;
    }

}
