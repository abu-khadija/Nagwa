package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class searchResultsClass extends pageBase{
    public searchResultsClass(WebDriver driver) {super(driver);}


    private final By lessonTwo = By.xpath("/html/body/div/div[1]/div/div/main/div[3]/ul/li[2]/div/a");

    private final By worksheetSection = By.className("question-preview");


    public void chooseLesson(){
        //Click on 2nd lesson in the search results
        driver.findElement(lessonTwo).click();
        //Scrolling down using js.
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10300)", "");
        //click preview button of worksheet section.
        driver.findElement(worksheetSection).click();
    }
}
