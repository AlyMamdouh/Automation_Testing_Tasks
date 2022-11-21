package Challenge_2_Main;

import Base_of_Main.Base_All_Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Courses_Page extends Base_All_Main {




    @FindBy(xpath = "//*[@id=\"course-list\"]/div[1]/div/a")
    public WebElement JSOpen;


    public Courses_Page(WebDriver AlyDriver) {
        super(AlyDriver);
    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    /* functions of test cases */


}
