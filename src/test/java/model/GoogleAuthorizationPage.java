package model;

import model.base.BaseNonProjectPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleAuthorizationPage extends BaseNonProjectPage {

    @FindBy (xpath = "//base[contains(@href,'accounts.google.com')]")
    WebElement headGoogleAuthorizationPage;

    @FindBy (xpath = "//button[@jsname='LZaERc']")
    WebElement textFromGoToApplicationString;

    protected GoogleAuthorizationPage(WebDriver driver) {
        super(driver);
    }

    public boolean isGoogleAuthorizationPageOpened() {
        return headGoogleAuthorizationPage.isEnabled();
    }

    public String getTextFromGoToApplicationString() {
        return textFromGoToApplicationString.getText();
    }

}
