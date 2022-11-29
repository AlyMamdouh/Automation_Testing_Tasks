package Challenge_20_Test;

import Challenge_20_Main.Ch20_Page;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ch20_HeadlessMode extends TestBase_20
{
    Ch20_Page Ch20obj ;

    // Run el test mn el XML file w est5dm  <parameter name="Browser" value="Chrome-headless"/> 2abl el test
    @Test
    public void Headless_Without_Browser_Showing() throws InterruptedException
    {
        Ch20obj = new Ch20_Page(AlyDriver);

        Ch20obj.usernamee.sendKeys("Admin");
        Ch20obj.passwordd.sendKeys("admin123");
        Ch20obj.logginn.click();
        Thread.sleep(2000);


        Ch20obj.UserLogo.click();
        Thread.sleep(2000);
        Assert.assertEquals(Ch20obj.Logout.getText(),"Logout");
        System.out.println(Ch20obj.Logout.getText());

    }

}
