package Challenge_3_Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class JQuery_Base
{
    protected WebDriver AlyDriver;

    public JQuery_Base(WebDriver AlyDriver)
    {
        PageFactory.initElements(AlyDriver, this);
    }

}
