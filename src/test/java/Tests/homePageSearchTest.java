package Tests;

import Pages.homePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class homePageSearchTest extends testBase{
    @Test
    public void search(){
        homePage home;
        home = new homePage(driver);

        home.search();

        //Assertion
        String expectedResult = "Search results [1-100]";
        String actualResult = driver.findElement(By.className("page-title")).getText();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
