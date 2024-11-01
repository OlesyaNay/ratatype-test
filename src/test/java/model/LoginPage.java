package model;

import model.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    @FindBy (id = "google_login")
    private WebElement logInWithGoogleButton;

    @FindBy (xpath = "//*[@href='javascript:void(0)']")
    private WebElement forgotYourPasswordLink;

    protected LoginPage(WebDriver driver) {
        super(driver);
    }

    public GoogleAuthorizationPage clickLoginWithGoogleButton() {
        logInWithGoogleButton.click();

        return new GoogleAuthorizationPage(getDriver());
    }

    public RemindPage clickForgotYourPasswordLink() {
        getWait3().until(ExpectedConditions.elementToBeClickable(forgotYourPasswordLink)).click();

        return new RemindPage(getDriver());
    }

}
