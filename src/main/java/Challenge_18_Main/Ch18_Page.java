package Challenge_18_Main;

import Base_of_Main.Base_All_Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Ch18_Page extends Base_All_Main
{

    public Ch18_Page(WebDriver AlyDriver) {super(AlyDriver);}


    @FindBy(name = "username")
    public WebElement usernamee;


    @FindBy(name = "password")
    public WebElement passwordd;


    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    public WebElement logginn;



}
