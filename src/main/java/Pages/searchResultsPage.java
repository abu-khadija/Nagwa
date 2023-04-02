package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class searchResultsPage extends pageBase{
    public searchResultsPage(WebDriver driver) {super(driver);}


    private final By lessonTwo = By.xpath("/html/body/div/div[1]/div/div/main/div[3]/ul/li[2]/div/a");
    //.list > li:nth-child(2) > div:nth-child(1) > a:nth-child(1)
    //.list > li:nth-child(2) > div:nth-child(1) > a:nth-child(1)
    ///html/body/div/div[1]/div/div/main/div[3]/ul/li[2]/div/a
    private final By worksheetSection = By.className("question-preview");



    public void chooseLesson(){
        driver.findElement(lessonTwo).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10300)", "");
        driver.findElement(worksheetSection).click();
    }
}
