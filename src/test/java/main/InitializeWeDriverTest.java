package main;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import selenium.driver.WebDriverContainer;
import selenium.pages.AmazonPage;

public class InitializeWeDriverTest {

    protected static AmazonPage page;
    private static WebDriver driver;

    @BeforeAll
    //Initialize webdriver
    public static void InitializeWebDriverTest(){
        driver = WebDriverContainer.getDriver();
        page = new AmazonPage(driver);
    }


    @AfterAll
    //Close WebDriver
    public static void quitWebDriver(){
        driver.quit();
    }
}
