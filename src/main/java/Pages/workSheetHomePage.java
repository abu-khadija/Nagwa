package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class workSheetHomePage extends pageBase{
    public workSheetHomePage(WebDriver driver) {super(driver);}

    private final By questions = By.className("instance");


    public void questions(){
        List<WebElement> Questions = driver.findElements(questions);
        System.out.println("Number of Questions is: " + Questions.size());
    }
}
