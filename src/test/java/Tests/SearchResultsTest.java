package Tests;

import Pages.searchResultsClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchResultsTest extends TestBase{
    @Test
    public void results(){
        searchResultsClass results;
        results =new searchResultsClass(driver);


        results.chooseLesson();

        //Assertion
        String expectedResult = "START PRACTISING";
        String actualResult = driver.findElement(By.className("cta")).getText();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
