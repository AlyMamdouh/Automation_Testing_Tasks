package Challenge_3_Main;

import Base_of_Main.Base_All_Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JQuery_Page extends Base_All_Main
{
    public JQuery_Page(WebDriver AlyDriver)
    {
        super(AlyDriver);
    }

    @FindBy(xpath = "/html/body/div")
    public WebElement button;

}
