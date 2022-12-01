package Challenge_24_Main;

import Base_of_Main.Base_All_Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Ch24_Page extends Base_All_Main
{
    public Ch24_Page(WebDriver AlyDriver) {super(AlyDriver);}

    @FindBy(xpath="//*[@id=\"datepicker\"]/span")
    public static WebElement DatePicker;

    @FindBy(xpath="(//th[@class='prev'][normalize-space()='«'])[2]")
    public static WebElement prev;

    @FindBy(xpath="/html/body/div[2]/div[2]/table/thead/tr/th[3]")
    public static WebElement next;

    @FindBy(xpath="/html/body/div[2]/div[1]/table/thead/tr[1]/th[2]")
    public static WebElement midlink;
    public static List<WebElement> Months;
    public static List <WebElement> Days;

}
