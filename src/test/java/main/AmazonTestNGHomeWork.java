package main;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AmazonTestNGHomeWork extends InitializeWeDriverTest{

    @Test
    public void test1(){
        page.loadAmazonPage();
        page.setSearchRequest("flowers");
        page.pressSearchButton();
        Assert.assertEquals(page.searchResult().size(), 48);
    }


}
