package Challenge_21_Test;

import Challenge_21_Main.Ch21_Page;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ch21_ParallelTesting_Negative extends TestBase_21
{
    Ch21_Page Ch21obj ;

    @Test
    public void Negative_Scenario() throws InterruptedException
    {
        Ch21obj = new Ch21_Page(AlyDriver);

        Ch21obj.usernamee.sendKeys("zzzzz");
        Ch21obj.passwordd.sendKeys("zzzzz2651");
        Ch21obj.logginn.click();

    }

    @Test
    public void Positive_Scenario() throws InterruptedException
    {
        Ch21obj = new Ch21_Page(AlyDriver);

        Ch21obj.usernamee.sendKeys("Admin");
        Ch21obj.passwordd.sendKeys("admin123");
        Ch21obj.logginn.click();
        Thread.sleep(2000);


        Ch21obj.UserLogo.click();
        Thread.sleep(2000);
        Assert.assertEquals(Ch21obj.Logoutt.getText(),"Logout");
        System.out.println(Ch21obj.Logoutt.getText());

    }





}
