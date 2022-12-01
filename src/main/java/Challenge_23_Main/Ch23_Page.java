package Challenge_23_Main;

import Base_of_Main.Base_All_Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Ch23_Page extends Base_All_Main

{
    public Ch23_Page(WebDriver AlyDriver) {super(AlyDriver);}


    @FindBy (id = "datepicker")
    public WebElement DatePick ;


    @FindBy ( xpath = "//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")
    public WebElement Months ;

    @FindBy (xpath = "//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")
    public WebElement Years ;

    @FindBy (xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[2]")
    public WebElement Day5 ;

    @FindBy(tagName = "a")
    public List<WebElement> daysss;



}
