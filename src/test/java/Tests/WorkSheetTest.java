package Tests;

import Pages.workSheetClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkSheetTest extends TestBase{
    @Test
    public void workSheet(){
        workSheetClass CountQuestion;
        CountQuestion = new workSheetClass(driver);

        //print the Number of Question (Bonus)
        CountQuestion.QuestionsCounter();

        //Assertion
        String expectedResult = "Q1:";
        String actualResult = driver.findElement(By.className("inline-displayed")).getText();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
