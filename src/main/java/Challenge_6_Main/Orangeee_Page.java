package Challenge_6_Main;

import Base_of_Main.Base_All_Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class Orangeee_Page extends Base_All_Main {

    public Orangeee_Page(WebDriver AlyDriver)
    {
        super(AlyDriver);
    }

    @FindBy(name = "username")
    WebElement usernamee;


    @FindBy(name = "password")
    WebElement passwordd;


    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    WebElement logginn;



    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")
    public WebElement Recruitment ;


    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]")
    public WebElement Vacancies ;



    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    /* functions of test cases */

    public void Login()
    {
        usernamee.sendKeys("Admin");
        passwordd.sendKeys("admin123");
        logginn.click();

    }

//    public void OpenRecruitment_Vacancies() throws InterruptedException {
//        Recruitment.click();
//
//
//        Actions action = new Actions(AlyDriver);
//        action.moveToElement(Vacancies).perform();
//        Thread.sleep(2000);
//        Vacancies.click();
//    }

}
