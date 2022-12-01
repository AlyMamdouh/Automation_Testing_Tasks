package Challenge_24_Test;

import Challenge_24_Main.Ch24_Page;
import Challenge_24_Test.TestBase_24;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ch24_Calendar3 extends TestBase_24
{
    static Ch24_Page Ch24obj;

    public  void SetdateDDMMYY (String day, String month, int year) throws InterruptedException
    {
        int yeardiff = year - Calendar.getInstance().get(Calendar.YEAR);
        AlyDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Ch24obj.DatePicker.click();
        Ch24obj.midlink.click();


        if(yeardiff!=0)
        {


            if(yeardiff>0)
            {
                for(int i=0;i< yeardiff;i++)
                {
                    AlyDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                    Ch24obj.next.click();
                }
            }


            else if(yeardiff<0)
            {
                for(int i=0;i< (yeardiff*(-1));i++)
                {
                    AlyDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                    Ch24obj.prev.click();
                }
            }

        }


        Ch24obj.Months = AlyDriver.findElements(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr/td/span"));
        for(int i =0 ; i<Ch24obj.Months.size();i++)
        {
            if(month.equalsIgnoreCase(Ch24obj.Months.get(i).getText()))
                Ch24obj.Months.get(i).click();
        }

        Ch24obj.Days = AlyDriver.findElements(By.xpath("//td[@class='day']"));
        for(int i =0 ; i<Ch24obj.Days.size();i++)
        {
            if(day.equalsIgnoreCase(Ch24obj.Days.get(i).getText()))
            {
                Ch24obj.Days.get(i).click();
                break;
            }
        }

    }





    @Test (priority = 1)
    public void Calendar3_1() throws InterruptedException
    {
        Ch24obj = new Ch24_Page(AlyDriver);
        SetdateDDMMYY("25","Dec",2020);
        Thread.sleep(2000);
    }


    @Test (priority = 2)
    public void Calendar3_2() throws InterruptedException
    {
        Ch24obj = new Ch24_Page(AlyDriver);
        SetdateDDMMYY("25","Dec",2023);
        Thread.sleep(2000);
    }

}
