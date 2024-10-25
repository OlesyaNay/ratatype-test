package com.ratatype;

import com.ratatype.runner.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

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

        Robot robot = new Robot();
        robot.delay(3000);      // Задержка в 3 секунды перед началом работы робота.

        // Фраза "type me to find out how many words per minute you can type", которую нужно напечатать,
        // закодирована числовыми кодами клавиш для раскладки клавиатуры QWERTY
        // ('t'=84; 'y'=89; ' '=32 и т.д.)
        Integer[] intArray = {
                84,89,80,69,32, 77,69,32, 84,79,32, 70,73,78,68,32, 79,85,84,32, 72,79,87,32, 77,65,78,89,32,
                87,79,82,68,83,32, 80,69,82,32, 77,73,78,85,84,69,32, 89,79,85,32, 67,65,78,32, 84,89,80,69
        };

        // Генерация события нажатия клавиши для написания букв в раскладке QWERTY
        for(int i = 0; i < intArray.length; i++) {
            robot.delay(120);
            robot.keyPress(intArray[i]);
        }

        WebElement titleH2 = getDriver().findElement(By.xpath("//h2"));

        Assert.assertTrue(titleH2.getText().contains("words per minute"));
    }

}
