package main;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AmazonTestNGHomeWork extends InitializeWeDriverTest{

    @Test
    public void test1(){
        page.loadAmazonPage("https://www.amazon.com/");
        page.setSearchRequest("flowers");
        page.pressSearchButton();
        Assert.assertEquals(page.searchResult().size(), 48);
    }

    @Test
    public void test2(){
        page.loadAmazonPage("https://www.amazon.com/s?k=flowers&crid=1B94N1AHGHN5V&sprefix=flowers%2Caps%2C203&ref=nb_sb_noss_1");
        page.pressCategory();
        Assert.assertEquals(page.searchCategoryAssert().size(), 17);
    }

}
