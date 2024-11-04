package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

public final class TestUtils {

    public static void startTypingWithRobotInTypingTutorPage(WebDriver driver) throws AWTException, InterruptedException {
        Thread.sleep(1000);

        String xpathFirstLetter = "//*[@class='letter']";

        WebElement firstLetter = driver.findElement(By.xpath(xpathFirstLetter));
        WebElement secondLetters = driver
                .findElement(By.xpath("//*[@class='letter']/following-sibling::span"));

        Integer count = firstLetter.getText().length() + secondLetters.getText().length();

        if (firstLetter.isDisplayed()) {
            Robot robot;
            robot = new Robot();
            robot.delay(1000);

            for (int i = 0; i < count; i++) {
                firstLetter = driver.findElement(By.xpath(xpathFirstLetter));
                String letter = firstLetter.getText();
                Character symbol = letter.toUpperCase().charAt(0);

                if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ".contains(letter)) {
                    robot.delay(130);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(symbol);
                    robot.keyRelease(symbol);
                    robot.keyRelease(KeyEvent.VK_SHIFT);

                } else {
                    robot.delay(130);
                    robot.keyPress(symbol);
                }
            }
        }

        Thread.sleep(1000);
    }

}
