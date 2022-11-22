package Challenge_8_Main;

import Base_of_Main.Base_All_Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class monster_Page extends Base_All_Main
{
    public monster_Page(WebDriver AlyDriver) { super(AlyDriver); }




    @FindBy (xpath = "//input[@id='file-upload']")
    public WebElement ChooseCV ;




}
