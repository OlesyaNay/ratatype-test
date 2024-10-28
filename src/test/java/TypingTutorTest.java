import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
    public void testTextTypingWithRobot() throws AWTException {
        getDriver().get("https://www.ratatype.com/typing-tutor/");

        String textForTyping = "type me to find out how many words per minute you can type";
        TestUtils.startTypingWithRobot(textForTyping);

        WebElement titleH2 = getDriver().findElement(By.xpath("//h2"));
        Assert.assertTrue(titleH2.getText().contains("words per minute"));
    }

}
