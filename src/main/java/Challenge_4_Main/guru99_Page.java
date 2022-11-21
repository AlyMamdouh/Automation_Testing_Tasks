package Challenge_4_Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class guru99_Page extends guru99_Base
{

    public guru99_Page(WebDriver AlyDriver)
    {
        super(AlyDriver);
    }

    @FindBy(xpath = "//*[@id=\"authentication\"]/span")
    public WebElement RightClickMe;

    @FindBy(xpath = "//*[@id=\"authentication\"]/ul/li[1]")
    public WebElement Edit;





}
