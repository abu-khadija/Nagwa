package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class searchResultsPage extends pageBase{
    public searchResultsPage(WebDriver driver) {super(driver);}


    private final By lessonTwo = By.linkText("Addition Polymerization");
    private final By worksheetSection = By.className("question-preview");



    public void chooseLesson(){
        driver.findElement(lessonTwo).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10300)", "");
        driver.findElement(worksheetSection).click();
    }
}
