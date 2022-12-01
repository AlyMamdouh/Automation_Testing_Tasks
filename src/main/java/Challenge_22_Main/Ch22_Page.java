package Challenge_22_Main;

import Base_of_Main.Base_All_Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Ch22_Page extends Base_All_Main
{
    public Ch22_Page(WebDriver AlyDriver) {super(AlyDriver);}

    @FindBy(id = "day")
    public WebElement Calendar;




}
