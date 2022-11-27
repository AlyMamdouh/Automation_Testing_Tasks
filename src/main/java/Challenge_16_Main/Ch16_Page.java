package Challenge_16_Main;

import Base_of_Main.Base_All_Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Ch16_Page extends Base_All_Main
{
    public Ch16_Page(WebDriver AlyDriver) {super(AlyDriver);}

    @FindBy (xpath = "//*[@id=\"course-list\"]/div[4]/div/a")
    public WebElement SelCourse;

}