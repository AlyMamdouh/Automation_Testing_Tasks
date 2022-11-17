package Stage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    protected WebDriver AlyDriver;
    public PageBase(WebDriver AlyDriver)
    {
        PageFactory.initElements(AlyDriver, this);
    }


    //Static Method for clicking
    protected static void ClickButton(WebElement button)
    {
        button.click();
    }
}
