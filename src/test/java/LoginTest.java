import model.GoogleAuthorizationPage;
import model.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void testClickLoginWithGoogleButton() {
        GoogleAuthorizationPage googleAuthorizationPage = new HomePage(getDriver())
                .goToLoginPage()
                .clickLoginWithGoogleButton();

        String text = googleAuthorizationPage.getTextFromGoToApplicationString();

        Assert.assertTrue(googleAuthorizationPage.isGoogleAuthorizationPageOpened());
        Assert.assertEquals(text, "Ratatype");
    }

    @Test
    public void testClickForgotYourPasswordLink() {
        String pageTitle = new HomePage(getDriver())
                .goToLoginPage()
                .clickForgotYourPasswordLink()
                .getTitleText();

        Assert.assertEquals(pageTitle, "Forgot password — Ratatype");
    }

    @Test
    public void testClickSignUpNowLink() {
        String pageTitle = new HomePage(getDriver())
                .goToLoginPage()
                .clickSignUpNowLink()
                .getTitleText();

        Assert.assertEquals(pageTitle, "Create a free account — Ratatype");
    }

}
