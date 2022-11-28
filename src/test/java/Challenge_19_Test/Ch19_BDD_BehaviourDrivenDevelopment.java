package Challenge_19_Test;

import Challenge_19_Main.Ch19_Page;
import org.testng.annotations.Test;

import java.io.IOException;

public class Ch19_BDD_BehaviourDrivenDevelopment extends TestBase_19
{

    Ch19_Page Ch19obj ;

    @Test
    public void signin_Valid() throws InterruptedException {
        Ch19obj = new Ch19_Page(AlyDriver);

        Ch19obj.username.sendKeys("Admin");
        Ch19obj.password.sendKeys("admin123");
        Ch19obj.loggin.click();

        Thread.sleep(2000);

    }
}
