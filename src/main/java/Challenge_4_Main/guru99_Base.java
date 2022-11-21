package Challenge_4_Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class guru99_Base {
    protected static WebDriver AlyDriver;

    public guru99_Base(WebDriver AlyDriver)
    {
        PageFactory.initElements(AlyDriver, this);
    }

}
