package Challenge_5_Main;

import Base_of_Main.Base_All_Main;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Orangee_Page extends Base_All_Main {

    public Orangee_Page(WebDriver AlyDriver) {
        super(AlyDriver);
    }

    @FindBy(name = "username")
    WebElement usernamee;


    @FindBy(name = "password")
    WebElement passwordd;


    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    WebElement logginn;



    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")
    WebElement Recruitment ;



    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    /* functions of test cases */

    public void Login()
    {
        usernamee.sendKeys("Admin");
        passwordd.sendKeys("admin123");
        logginn.click();

    }

    public void OpenInNewTab()
    {
        String Click_NewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
        Recruitment.sendKeys(Click_NewTab);
    }


}
