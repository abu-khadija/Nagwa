package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage extends pageBase{
    public homePage(WebDriver driver) {super(driver);}


    private final By searchButton = By.xpath("//button[@type='button']");
    private final By searchText = By.id("txt_search_query");
    private final By submitButton = By.id("btn_global_search");



    public void search(){
        driver.findElement(searchButton).click();
        driver.findElement(searchText).sendKeys("addition");
        driver.findElement(submitButton).click();
    }
}
