package main;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.PageObjectHW;

public class Main {

    public static void main(String... args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver chd = new ChromeDriver();

        try {
            PageObjectHW pageObjectHW = new PageObjectHW(chd);
            testFlareWeb(pageObjectHW);
            checkPasswordConditions(pageObjectHW);
        } finally {
            //chd.quit();
        }
    }

    public static void testFlareWeb(PageObjectHW pageObjectHW){
        pageObjectHW.loadWebSite();
        pageObjectHW.signUpProcess();
        pageObjectHW.waitForProcessing();
        pageObjectHW.fillInEmail("test@test.com");
        pageObjectHW.fillInPassword("1234GH56");

    }

    public static void checkPasswordConditions(PageObjectHW pageObjectHW){
        if (pageObjectHW.checkSuccessPasswordEntryConditions()){
            //pageObjectHW.captchaPressBox();
            pageObjectHW.pressAnySuitableButton();
        } else {
            pageObjectHW.fillInPassword("123ghjY&1g");
            //pageObjectHW.captchaPressBox();
            pageObjectHW.pressAnySuitableButton();
        }
    }

}