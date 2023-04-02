package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class workSheetClass extends pageBase{
    //constructor
    public workSheetClass(WebDriver driver) {super(driver);}

    //Elements
    private final By questions = By.className("instance");


    //count number of questions in worksheet section
    public void QuestionsCounter(){
        List<WebElement> Questions = driver.findElements(questions);
        System.out.println("Number of Questions is: " + Questions.size());
    }
}
