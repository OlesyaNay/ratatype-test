package model.base;

import model.Footer;
import org.openqa.selenium.WebDriver;

public abstract class BasePage extends BaseModel {

    protected BasePage(WebDriver driver) {
        super(driver);
    }

    public String getTitleText() {
        return getDriver().getTitle();
    }

    public Footer getFooter() {
        return new Footer(getDriver());
    }

}
