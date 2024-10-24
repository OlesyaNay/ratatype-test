package org.example.model.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BaseModel {

    private final WebDriver driver;

    private WebDriverWait wait2;
    private WebDriverWait wait3;
    private WebDriverWait wait5;


    protected BaseModel(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    protected WebDriver getDriver() {
        return driver;
    }

    protected WebDriverWait getWait2() {
        if (wait2 == null) {
            wait2 = new WebDriverWait(getDriver(), Duration.ofSeconds(2));
        }

        return wait2;
    }

    protected WebDriverWait getWait3() {
        if (wait3 == null) {
            wait3 = new WebDriverWait(getDriver(), Duration.ofSeconds(3));
        }

        return wait3;
    }

    protected WebDriverWait getWait5() {
        if (wait5 == null) {
            wait5 = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        }

        return wait5;
    }

}
