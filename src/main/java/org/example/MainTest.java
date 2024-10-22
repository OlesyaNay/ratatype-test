package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainTest {
    WebDriver driver;

    @BeforeMethod
    public void startDriver() {
        driver = new ChromeDriver(new ChromeOptions().addArguments("incognito", "start-maximized"));
    }

    @AfterMethod
    public void stopDriver() {
        driver.quit();
    }

    @Test
    public void testClickTestSpeedButton() {
        driver.get("https://www.ratatype.com/");

        driver.findElement(By.xpath("//*[text()='Test your speed']")).click();
        WebElement title = driver.findElement(By.xpath("//*[@class='h2']"));

        Assert.assertEquals(title.getText(), "Typing Certification Test");
    }
}