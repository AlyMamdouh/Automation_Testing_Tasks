package Base_of_Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Base_All_Main {
    protected static WebDriver  AlyDriver;
    public Base_All_Main(WebDriver  AlyDriver)
    {
        PageFactory.initElements(AlyDriver, this);
    }

    public static void ClickButton(WebElement button)
    {
        button.click();
    }
}
