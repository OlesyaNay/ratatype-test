package model;

import model.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Footer extends BasePage {

    @FindBy (xpath = "//a[@href='/typing-tutor/'][@class='hover:underline']")
    private WebElement typingTutorLinkInFooter;

    @FindBy (xpath = "//a[@href='/typing-test/'][@class='hover:underline']")
    private WebElement typingTestLinkInFooter;

    @FindBy (xpath = "//a[@href='/learn/groups/'][@class='hover:underline']")
    private WebElement groupsLinkInFooter;

    @FindBy (xpath = "//a[@href='/courses/'][@class='hover:underline']")
    private WebElement coursesLinkInFooter;

    @FindBy (xpath = "//a[@href='/high-scores/this-month/'][@class='hover:underline']")
    private WebElement highScoresLinkInFooter;

    @FindBy (xpath = "//a[@href='/learn/'][@class='hover:underline']")
    private WebElement learnLinkInFooter;

    @FindBy (xpath = "//a[@href='/faq/'][@class='hover:underline']")
    private WebElement faqLinkInFooter;

    @FindBy (xpath = "//a[@href='/learn/gamemode/'][@class='hover:underline']")
    private WebElement playTheGameAndLearnLinkInFooter;

    @FindBy (xpath = "//a[@href='/keyboard-test/'][@class='hover:underline']")
    private WebElement keyboardTestLinkInFooter;

    public Footer(WebDriver driver) {
        super(driver);
    }

    public TypingTestPage clickTypingTutorLinkInFooter() {
        typingTutorLinkInFooter.click();

        return new TypingTestPage(getDriver());
    }

    public TypingTestPage clickTypingTestLinkInFooter() {
        typingTestLinkInFooter.click();

        return new TypingTestPage(getDriver());
    }

    public GroupsPage clickGroupsLinkInFooter() {
        groupsLinkInFooter.click();

        return new GroupsPage(getDriver());
    }

    public CoursesPage clickCoursesLinkInFooter() {
        coursesLinkInFooter.click();

        return new CoursesPage(getDriver());
    }

    public HighScoresPage clickHighScoresLinkInFooter() {
        highScoresLinkInFooter.click();

        return new HighScoresPage(getDriver());
    }

    public LearnPage clickLearnLinkInFooter() {
        learnLinkInFooter.click();

        return new LearnPage(getDriver());
    }

    public FaqPage clickFaqLinkInFooter() {
        faqLinkInFooter.click();

        return new FaqPage(getDriver());
    }

    public PlayTheGameAndLearnPage clickPlayTheGameAndLearnLinkInFooter() {
        playTheGameAndLearnLinkInFooter.click();

        return new PlayTheGameAndLearnPage(getDriver());
    }

    public KeyboardTestPage clickKeyboardTestLinkInFooter() {
        keyboardTestLinkInFooter.click();

        return new KeyboardTestPage(getDriver());
    }

}
