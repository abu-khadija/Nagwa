package Tests;

import Pages.workSheetHomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkSheetTest extends TestBase{
    @Test
    public void workSheet(){
        workSheetHomePage w;
        w = new workSheetHomePage(driver);
        w.questions();

        //Assertion
        String expectedResult = "Q1:";
        String actualResult = driver.findElement(By.className("inline-displayed")).getText();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
