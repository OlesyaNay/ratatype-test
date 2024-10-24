package org.example.model;

import org.example.model.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy (xpath = "//*[@id='typing-tutor-link']")
    private WebElement typingTutorLinkInHeader;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public TypingTutorPage clickTypingTutorLinkInHeader() {
        typingTutorLinkInHeader.click();

        return new TypingTutorPage(getDriver());
    }

}
