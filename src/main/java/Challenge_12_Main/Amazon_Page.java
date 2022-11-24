package Challenge_12_Main;

import Base_of_Main.Base_All_Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Amazon_Page extends Base_All_Main
{
    public Amazon_Page(WebDriver AlyDriver) {super(AlyDriver);}

    @FindBy(id ="nav-link-accountList")
    public WebElement Hellobtn;

    @FindBy(xpath ="//*[@id=\"nav-al-your-account\"]/a[1]")
    public WebElement Account;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[1]/h1")
    public WebElement YourAccount ;


}
