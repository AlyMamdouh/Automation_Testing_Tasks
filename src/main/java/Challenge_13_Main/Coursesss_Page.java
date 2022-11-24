package Challenge_13_Main;

import Base_of_Main.Base_All_Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Coursesss_Page extends Base_All_Main
{

    public Coursesss_Page(WebDriver AlyDriver) {super(AlyDriver);}

    @FindBy (id = "displayed-text")
    public WebElement TextBox;

    @FindBy (id = "hide-textbox")
    public WebElement Hidebtn;

    @FindBy(id = "show-textbox")
    public WebElement Showbtn;







}
