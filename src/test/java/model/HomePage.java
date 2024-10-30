package model;

import model.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    @FindBy (xpath = "//*[@id='typing-tutor-link']")
    private WebElement typingTutorLinkInHeader;

    @FindBy (xpath = "//*[@href='/typing-test/'][contains(@class, 'navbar')]")
    private WebElement typingTestLinkInHeader;

    @FindBy (xpath = "//*[@href='/learn/'][contains(@class, 'navbar')]")
    private WebElement typingLearnInHeader;

    @FindBy (xpath = "//button[contains(@class,'hidden dropdown-toggle btn-on-hover')]")
    private WebElement dropdownToggleInHeader;

    @FindBy (xpath = "//*[@href='/login/']")
    private WebElement loginLinkInDropdownToggleInHeader;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public TypingTutorPage clickTypingTutorLinkInHeader() {
        typingTutorLinkInHeader.click();

        return new TypingTutorPage(getDriver());
    }

    public TypingTestPage clickTypingTestLinkInHeader() {
        typingTestLinkInHeader.click();

        return new TypingTestPage(getDriver());
    }

    public LearnPage clickLearnLinkInHeader() {
        typingLearnInHeader.click();

        return new LearnPage(getDriver());
    }

    public HomePage clickDropdownToggleInHeader() {
        dropdownToggleInHeader.click();

        return this;
    }

    public LoginPage clickLoginLinkInDropdownToggleInHeader() {
        getWait2().until(ExpectedConditions.elementToBeClickable(loginLinkInDropdownToggleInHeader)).click();

        return new LoginPage(getDriver());
    }

}
