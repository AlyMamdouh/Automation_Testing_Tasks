package Challenge_25_Main;

import Base_of_Main.Base_All_Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Ch25_Page extends Base_All_Main
{
    public Ch25_Page(WebDriver AlyDriver) {super(AlyDriver);}

    @FindBy(xpath="//*[@id=\"nav-link-accountList-nav-line-1\"]")
    public WebElement HelloSignin;

}
