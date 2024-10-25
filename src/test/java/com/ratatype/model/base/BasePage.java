package com.ratatype.model.base;

import org.openqa.selenium.WebDriver;

public abstract class BasePage extends BaseModel {

    protected BasePage(WebDriver driver) {
        super(driver);
    }

    public String getTitleText() {
        return getDriver().getTitle();
    }

}
