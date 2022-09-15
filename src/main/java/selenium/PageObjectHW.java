package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PageObjectHW {

    private final WebDriver driver;

    public PageObjectHW(WebDriver driver){
        this.driver = driver;
    }

    public void loadWebSite(){
        driver.get("https://www.cloudflare.com/");
    }

    public void signUpProcess(){
        driver.findElement(By.xpath("//span[@class='blue1 f2 fw6 lh-6']")).click();
    }

    public void waitForProcessing(){
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));
    }

    public void fillInEmail(String email){
        driver.findElement(By.name("email")).sendKeys(email);
    }

    public void fillInPassword(String password) {
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(password);
    }

    public Boolean checkSuccessPasswordEntryConditions() {
        List<WebElement> meetConditionList = driver.findElements(By.tagName("svg"));
        if (meetConditionList.size() == 3) {
            return true;
        } else {
            return false;
        }
    }

    public void captchaPressBox(){
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Widget containing a Cloudflare security challenge']")));
        driver.findElement(By.id("not_a_bot")).click();
        driver.switchTo().parentFrame();
    }
    public void pressAnySuitableButton(){
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        for (WebElement suitableButton : buttons){
            try {
                suitableButton.click();
            } catch (Exception exception){

            }
        }
    }
}
