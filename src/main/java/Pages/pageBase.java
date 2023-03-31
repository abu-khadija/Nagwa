package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class pageBase {
    protected WebDriver driver;


    //Create Constructor
    public pageBase(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements( driver, this);
    }
}

