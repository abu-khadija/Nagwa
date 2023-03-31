package Tests;

import Pages.searchResultsPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class searchResultsTest extends testBase{
    @Test
    public void results(){
        searchResultsPage r;
        r =new searchResultsPage(driver);


        r.chooseLesson();

        //Assertion
        String expectedResult = "START PRACTISING";
        String actualResult = driver.findElement(By.className("cta")).getText();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
