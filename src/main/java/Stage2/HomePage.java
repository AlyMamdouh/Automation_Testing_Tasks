package Stage2;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.IOException;

public class HomePage extends PageBase
{
    public HomePage(WebDriver AlyDriver){
        super(AlyDriver);

    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////


    @FindBy(name = "username")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    WebElement loggin;

    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[1]")
    WebElement LinkedIn;

    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[2]")
    WebElement Facebook;

    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[3]")
    WebElement Twitter;

    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[4]")
    WebElement Youtube;

    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p")
    WebElement ForgotPassword;

    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/div/form/div[1]/div/div[2]/input")
    WebElement forg_username;

    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/div/form/div[2]/button[2]")
    WebElement forg_submit;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    /* functions of test cases */

    public  void Login_Valid()
    {
        username.sendKeys("Admin");
        password.sendKeys("admin123");
        ClickButton(loggin);      //or use --> loggin.click();

    }


    public  void Login_InValid()
    {
        username.sendKeys("Aly_Mamdouh");
        password.sendKeys("lol5678");
        ClickButton(loggin); //or use --> loggin.click();
    }


    public  void Verify_LinkedIn()
    {
        ClickButton(LinkedIn); //or use --> LinkedIn.click();
    }

    public  void Verify_Facebook()
    {
        ClickButton(Facebook); //or use --> Facebook.click();
    }

    public  void Verify_Twitter()
    {
        ClickButton(Twitter); //or use --> Twitter.click();
    }

    public  void Verify_Youtube()
    {
        ClickButton(Youtube); //or use --> Youtube.click();
    }

    public  void Verify_ForgotPass()
    {
        ForgotPassword.click();
        forg_username.sendKeys("Admin");
        ClickButton(forg_submit); //or use --> forg_submit.click();

    }


}
