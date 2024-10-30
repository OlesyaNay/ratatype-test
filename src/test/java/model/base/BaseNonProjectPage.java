package model.base;

import org.openqa.selenium.WebDriver;

public abstract class BaseNonProjectPage extends BaseModel{
    protected BaseNonProjectPage(WebDriver driver) {
        super(driver);
    }
}
