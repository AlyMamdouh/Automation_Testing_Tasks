package Challenge_10_Main;

import Base_of_Main.Base_All_Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Coursess_Page extends Base_All_Main
{
    public Coursess_Page(WebDriver AlyDriver) {super(AlyDriver);}



    @FindBy(xpath ="//*[@id=\"opentab\"]")
    public WebElement OpenTabBtn;




}
