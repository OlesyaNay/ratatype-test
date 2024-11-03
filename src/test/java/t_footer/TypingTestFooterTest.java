package t_footer;

import model.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class TypingTestFooterTest extends BaseTest {

    @Test
    public void testClickTypingTutorLinkInFooter() {
        String pageTitle = new HomePage(getDriver())
                .goToTypingTestPage()
                .getFooter()
                .clickTypingTutorLinkInFooter()
                .getTitleText();

        Assert.assertEquals(pageTitle, TYPING_TUTOR_TITLE);
    }

    @Test
    public void testClickTypingTestLinkInFooter() {
        String pageTitle = new HomePage(getDriver())
                .goToTypingTestPage()
                .getFooter()
                .clickTypingTestLinkInFooter()
                .getTitleText();

        Assert.assertEquals(pageTitle, TYPING_TEST_TITLE);
    }

    @Test
    public void testClickGroupsLinkInFooter() {
        String pageTitle = new HomePage(getDriver())
                .goToTypingTestPage()
                .getFooter()
                .clickGroupsLinkInFooter()
                .getTitleText();

        Assert.assertEquals(pageTitle, GROUPS_TITLE);
    }

    @Test
    public void testClickCoursesLinkInFooter() {
        String pageTitle = new HomePage(getDriver())
                .goToTypingTestPage()
                .getFooter()
                .clickCoursesLinkInFooter()
                .getTitleText();

        Assert.assertEquals(pageTitle, COURSES_TITLE);
    }

    @Test
    public void testClickHighScoresLinkInFooter() {
        String pageTitle = new HomePage(getDriver())
                .goToTypingTestPage()
                .getFooter()
                .clickHighScoresLinkInFooter()
                .getTitleText();

        Assert.assertEquals(pageTitle, HIGH_SCORES_TITLE);
    }

    @Test
    public void testClickLearnLinkInFooter() {
        String pageTitle = new HomePage(getDriver())
                .goToTypingTestPage()
                .getFooter()
                .clickLearnLinkInFooter()
                .getTitleText();

        Assert.assertEquals(pageTitle, LEARN_TITLE);
    }

    @Test
    public void testClickFaqLinkInFooter() {
        String pageTitle = new HomePage(getDriver())
                .goToTypingTestPage()
                .getFooter()
                .clickFaqLinkInFooter()
                .getTitleText();

        Assert.assertEquals(pageTitle, FAQ_TITLE);
    }

    @Test
    public void testClickPlayTheGameAndLearnLinkInFooter() {
        String pageTitle = new HomePage(getDriver())
                .goToTypingTestPage()
                .getFooter()
                .clickPlayTheGameAndLearnLinkInFooter()
                .getTitleText();

        Assert.assertEquals(pageTitle, PLAY_THE_GAME_AND_LEARN_TITLE);
    }

    @Test
    public void testClickKeyboardTestLinkInFooter() {
        String pageTitle = new HomePage(getDriver())
                .goToTypingTestPage()
                .getFooter()
                .clickKeyboardTestLinkInFooter()
                .getTitleText();

        Assert.assertEquals(pageTitle, KEYBOARD_TEST_TITLE);
    }

}
