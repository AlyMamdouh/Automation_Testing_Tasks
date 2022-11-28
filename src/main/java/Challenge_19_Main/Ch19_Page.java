package Challenge_19_Main;

import Base_of_Main.Base_All_Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Ch19_Page extends Base_All_Main
{
    @FindBy (name = "username")
    public WebElement username;

    @FindBy (name = "password")
    public WebElement password;

    @FindBy (xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    public WebElement loggin;

    public Ch19_Page(WebDriver AlyDriver) {super(AlyDriver);}


}