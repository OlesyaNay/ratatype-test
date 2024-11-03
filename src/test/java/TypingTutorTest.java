import model.HomePage;
import model.TestStringResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;
import runner.TestUtils;

import java.awt.*;

public class TypingTutorTest extends BaseTest {

    // !!! !!! !!!
    // В тесте используется Robot для имитации нажатия клавиш на клавиатуре.
    // Если закрыть окно с тестом до окончания набора текста, то Robot продолжит нажимать клавиши
    // в ранее открытом окне (в IDE) пока не закончится текст или пока не будет остановлен тест.
    // !!! !!! !!!
    @Test
    public void testTextTypingWithRobotInTypingTutorPage() throws AWTException, InterruptedException {
        new HomePage(getDriver()).goToTypingTutorPage();

        TestUtils.startTypingWithRobotInTypingTutorPage(getDriver());

        String titleH2Text = new TestStringResultsPage(getDriver())
                .getTitleH2()
                .getText();

        Assert.assertTrue(titleH2Text.contains("words per minute"));
    }

}
