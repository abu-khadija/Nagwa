package Tests;

import Pages.LessonSearchClass;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.io.FileReader;
import java.io.IOException;


public class LessonSearchTest extends TestBase{
    CSVReader reader;

    @Test
    public void search() throws IOException, CsvValidationException {
        //get path of csv file
        String CSV_file = System.getProperty("user.dir")+"/src/test/java/data/search.csv";
        reader = new CSVReader(new FileReader(CSV_file));
        String[] csvCell ;
        //while loop will be executed till the last value in CSV file.
        while ((csvCell = reader.readNext()) != null)
        {
        String lesson = csvCell[0];
            LessonSearchClass LessonSearch;
            LessonSearch = new LessonSearchClass(driver);

            LessonSearch.SearchOnLesson(lesson);


            //Assertion
            driver.findElement(By.id("btn_search")).isDisplayed();
        }
    }
}
