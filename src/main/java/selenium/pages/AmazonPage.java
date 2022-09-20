package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AmazonPage {

    private final WebDriver driver;

    private final static String URL = "https://www.amazon.com/";

    public AmazonPage(WebDriver driver){
        this.driver = driver;
    }

    public void loadAmazonPage(){
        driver.get(URL);
    }

    public void setSearchRequest(String request){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(request);
    }

    public void pressSearchButton(){
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    public List<WebElement> searchResult(){
        return new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//img[@data-image-index]")));
    }

}
