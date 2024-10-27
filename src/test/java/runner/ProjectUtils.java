package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public final class ProjectUtils {

    private static final String DOMAIN_FOR_TEST = "ratatype.com";

    static WebDriver createDriver() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("incognito", "--window-size=1500,800");
//        ChromeDriver driver = new ChromeDriver(options);

        FirefoxDriver driver = new FirefoxDriver(new FirefoxOptions().addArguments("-private", "--window-size=1500,800"));

        return driver;
    }

    static String getUrl() {
        return "https://" + DOMAIN_FOR_TEST + "/";
    }

    public static void get(WebDriver driver) {
        driver.get(getUrl());
    }

    public static void log(String str) {
        System.out.println(str);
    }

}
