package runner;

import java.awt.*;

public final class TestUtils {

    public static void startTypingWithRobot(String text) throws AWTException {
        Robot robot = new Robot();
        robot.delay(3000);      // Create a three seconds delay.

        if (text.equals("type me to find out how many words per minute you can type")) {
            // Фраза "type me to find out how many words per minute you can type", которую нужно напечатать,
            // закодирована числовыми кодами клавиш для раскладки клавиатуры QWERTY
            // ('t'=84; 'y'=89; ' '=32 и т.д.)
            Integer[] intArray = {
                    84,89,80,69,32, 77,69,32, 84,79,32, 70,73,78,68,32, 79,85,84,32, 72,79,87,32, 77,65,78,89,32,
                    87,79,82,68,83,32, 80,69,82,32, 77,73,78,85,84,69,32, 89,79,85,32, 67,65,78,32, 84,89,80,69
            };

            // Generating key press event for writing the QWERTY letters
            for(int i = 0; i < intArray.length; i++) {
                robot.delay(120);
                robot.keyPress(intArray[i]);
            }
        }

        robot.delay(2000);
    }

}
