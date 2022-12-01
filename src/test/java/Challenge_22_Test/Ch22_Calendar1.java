package Challenge_22_Test;

import Challenge_22_Main.Ch22_Page;
import org.testng.annotations.Test;

public class Ch22_Calendar1 extends TestBase_22
{
    Ch22_Page Ch22obj;

    @Test
    public void Calendar1() throws InterruptedException
    {
        Ch22obj = new Ch22_Page(AlyDriver);

        Ch22obj.Calendar.sendKeys("10");
        Thread.sleep(1000);
        Ch22obj.Calendar.sendKeys("26");
        Thread.sleep(1000);
        Ch22obj.Calendar.sendKeys("2023");

    }




}
