package Challenge_Master3_Main;

import Base_of_Main.Base_All_Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Master3_Page extends Base_All_Main
{
    public Master3_Page(WebDriver AlyDriver) {super(AlyDriver);}

    @FindBy(id="user-name")
    public WebElement Username;
    @FindBy(id="password")
    public WebElement Pass;
    @FindBy(id="login-button")
    public WebElement loginbtn;

//    @FindBy (className = "inventory_item")
//    public List<WebElement>  Items;

    @FindBy (className = "inventory_item_price")
    public List<WebElement> ItemsPrice;




}
