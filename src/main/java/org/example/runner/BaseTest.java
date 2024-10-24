package org.example.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    private WebDriver driver;

    private WebDriverWait wait2;
    private WebDriverWait wait3;
    private WebDriverWait wait5;

    private void startDriver() {
        System.out.println("log: Browser open");
        driver = ProjectUtils.createDriver();
    }

    private void getWeb() {
        System.out.println("log: Get web page");
        ProjectUtils.get(driver);
    }

    private void stopDriver() {
        closeDriver();
    }

    private void closeDriver() {
        if (driver != null) {
            driver.quit();

            driver = null;

            wait2 = null;
            wait3 = null;
            wait5 = null;

            ProjectUtils.log("log: Browser closed");
        }
    }

    protected WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    protected void beforeMethod() {
        startDriver();
        getWeb();
    }

    @AfterMethod
    protected void afterMethod() {
        stopDriver();
    }

}
