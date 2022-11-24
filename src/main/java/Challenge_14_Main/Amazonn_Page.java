package Challenge_14_Main;

import Base_of_Main.Base_All_Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Amazonn_Page extends Base_All_Main
{
    public Amazonn_Page(WebDriver AlyDriver) {super(AlyDriver);}

    @FindBy(id ="nav-link-accountList")
    public WebElement Hellobtn;

    @FindBy(xpath ="//*[@id=\"nav-al-your-account\"]/a[1]")
    public WebElement Account;

    @FindBy(xpath = "//*[@id=\"nav-al-your-account\"]/div")
    public WebElement YourAccount ;


}
