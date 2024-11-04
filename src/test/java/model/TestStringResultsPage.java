package model;

import model.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestStringResultsPage extends BasePage {

    @FindBy (xpath = "//h2")
    private WebElement titleH2;

    public TestStringResultsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getTitleH2() {
        return titleH2;
    }

}
