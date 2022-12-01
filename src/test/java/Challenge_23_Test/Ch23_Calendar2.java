package Challenge_23_Test;

import Challenge_23_Main.Ch23_Page;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ch23_Calendar2 extends TestBase_23
{
    Ch23_Page Ch23obj;

    @Test
    public void Calendar2() throws InterruptedException
    {
        Ch23obj = new Ch23_Page(AlyDriver);


        Ch23obj.DatePick.click();


        Select SelectMonths = new Select(Ch23obj.Months);
        Assert.assertFalse(SelectMonths.isMultiple());  //assert en multible selection is not allowed
        SelectMonths.selectByVisibleText("Jun");
        Thread.sleep(2000);

        Select SelectYears = new Select(Ch23obj.Years);
        Assert.assertFalse(SelectYears.isMultiple());
        SelectYears.selectByVisibleText("2023");
        Thread.sleep(2000);


//        Ch23obj.Day5.click();
//        or..
        String x = "12";                                      // rkm el yom elle ba5taro
        for(int i=0;i<Ch23obj.daysss.size();i++)
        {
            if(Ch23obj.daysss.get(i).getText().equals(x))
            {
                Ch23obj.daysss.get(i).click();
                break;
            }

        }
        Thread.sleep(2000);

    }

}
