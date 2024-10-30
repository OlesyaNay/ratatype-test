package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

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
    protected void beforeMethod(Method method) {
        System.out.println("log: >>> Run " + this.getClass().getName() + "." + method.getName());

        startDriver();
        getWeb();
    }

    @AfterMethod
    protected void afterMethod(ITestResult testResult) {
        stopDriver();

        System.out.println("log: Execution time is "
                + ((testResult.getEndMillis() - testResult.getStartMillis()) / 1000) + " sec");
    }

}
