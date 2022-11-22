package Challenge_9_Main;

import Base_of_Main.Base_All_Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.PublicKey;

public class Lambada_Page extends Base_All_Main
{
    public Lambada_Page(WebDriver AlyDriver) {super(AlyDriver);}

    @FindBy (xpath = "//*[@id=\"__next\"]/section[4]/div/div/div[2]/div[1]/a[1]")
    public WebElement FollowOnTwitter;





}
