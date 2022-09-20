package selenium.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverContainer {

    private static final WebDriverContainer webDriverInstance = new WebDriverContainer();
    private static WebDriver driver;

    private WebDriverContainer(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    //public static WebDriverContainer getWebDriverInstance(){
       // return webDriverInstance;
    //}

    public static WebDriver getDriver(){
        return driver;
    }



}
