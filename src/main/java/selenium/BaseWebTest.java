package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseWebTest {

    public void loadGooglePage() {
        ChromeDriver chromeDriver = null;
        try {
            WebDriverManager.chromedriver().setup();

            chromeDriver = new ChromeDriver();
            chromeDriver.get("https://google.com/");

            List<WebElement> buttons = chromeDriver.findElements(By.tagName("button"));
            buttons.get(3).click();

            WebElement searchBar = chromeDriver.findElement(By.name("q"));
            searchBar.click();
            searchBar.sendKeys("test parametrization");
            WebElement searchButton = chromeDriver.findElement(By.name("btnK"));
            searchButton.click();
        } finally {
            if (chromeDriver != null) {
                chromeDriver.quit();
            }
        }
    }
}


