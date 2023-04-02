package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LessonSearchClass extends pageBase{
    //constructor
    public LessonSearchClass(WebDriver driver) {super(driver);}

//Elements
    private final By searchButton = By.xpath("//button[@type='button']");
    private final By searchText = By.id("txt_search_query");
    private final By submitButton = By.id("btn_global_search");

//searching on Nagwa lessons.
    public void SearchOnLesson(String lesson ) {
        
        driver.findElement(searchButton).click();
        driver.findElement(searchText).sendKeys(lesson);
        driver.findElement(submitButton).click();
    }
}
