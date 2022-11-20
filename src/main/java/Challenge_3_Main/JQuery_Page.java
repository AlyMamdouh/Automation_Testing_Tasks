package Challenge_3_Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JQuery_Page extends JQuery_Base
{

    @FindBy(xpath = "/html/body/div")
    public WebElement button;


    public JQuery_Page(WebDriver AlyDriver)
    {
        super(AlyDriver);
    }

}
