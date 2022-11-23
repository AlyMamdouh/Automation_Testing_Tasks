package Challenge_10_Test;

import Challenge_10_Main.Coursess_Page;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;

public class Ch10_HandlingTabs extends TestBase_10{

    Coursess_Page Coursess;
    String originalWindow ;

    @Test (priority = 1)
    public void OpenInNewTab() throws InterruptedException {
        Coursess = new Coursess_Page(AlyDriver);

        Coursess.OpenTabBtn.click();

        ArrayList tabs = new ArrayList(AlyDriver.getWindowHandles());    //hy7ot el tabs kolha fe array w hybos 3la tab rkm 1 (counting starts from 0)
        AlyDriver.switchTo().window((String) tabs.get(1));               //hy7ot el tabs kolha fe array w hybos 3la tab rkm 1 (counting starts from 0)

        originalWindow = AlyDriver.getCurrentUrl();
        Thread.sleep(2000);

    }



    @Test (priority = 2)
    public void OpenInNewWindow() throws InterruptedException
    {

        AlyDriver = new ChromeDriver();
        AlyDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        AlyDriver.navigate().to(originalWindow);

    }


}
