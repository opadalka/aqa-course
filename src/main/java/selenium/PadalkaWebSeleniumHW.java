package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PadalkaWebSeleniumHW {
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver chd = new ChromeDriver();

        try {
    //Open Chrome browser
            chd.get("https://ukr.net/");
            WebElement searchMailFrame = chd.findElement(By.xpath("//iframe[@name = 'mail widget']"));
            chd.switchTo().frame(searchMailFrame);

    //Find input fields for entering login/password
            WebElement searchLoginField = chd.findElement(By.id("id-input-login"));
            WebElement searchPasswordField = chd.findElement(By.id("id-input-password"));

    //Enter login
            searchLoginField.sendKeys("cawynja@ukr.net");

    //Enter password
            searchPasswordField.sendKeys("123456");

    //Press Button to proceed with login
            WebElement searchButton = chd.findElement(By.className("form__submit"));
            searchButton.click();

    //Proceed with captcha
            chd.switchTo().defaultContent();
            WebElement searchCaptchaFrame = chd.findElement(By.xpath("//iframe[@title = 'reCAPTCHA']"));
            chd.switchTo().frame(searchCaptchaFrame);
            WebElement searchCaptchaBox = chd.findElement(By.className("recaptcha-checkbox-borderAnimation"));
            searchCaptchaBox.click();


        } finally {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            chd.quit();
        }

    }

}
