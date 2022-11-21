package Challenge_4_Main;

import Base_of_Main.Base_All_Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class guru99_Page extends Base_All_Main
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
