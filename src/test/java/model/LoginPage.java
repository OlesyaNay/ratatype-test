package model;

import model.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy (id = "google_login")
    private WebElement logInWithGoogleButton;

    protected LoginPage(WebDriver driver) {
        super(driver);
    }

    public GoogleAuthorizationPage clickLoginWithGoogleButton() {
        logInWithGoogleButton.click();

        return new GoogleAuthorizationPage(getDriver());
    }

}
