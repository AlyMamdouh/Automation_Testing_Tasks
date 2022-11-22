package Challenge_9_Main.Challenge_9_Test;

import Challenge_9_Main.Lambada_Page;
import org.testng.annotations.Test;

public class Ch9_Lambada_HandlingMultibleWindows extends TestBase_9

{
    Lambada_Page Lambada;

    @Test
    public void OpeningFollowTwitter() throws InterruptedException {
        Lambada = new Lambada_Page(AlyDriver);

        String CurrentWindowID = AlyDriver.getWindowHandle();     //store WindowHandle of parent window

        Lambada.FollowOnTwitter.click();
        Thread.sleep(2000);

        for (String windowID : AlyDriver.getWindowHandles())
        {
            String title = AlyDriver.switchTo().window(windowID).getTitle();
            if (title.contains("twitter"))
            {
                System.out.println(AlyDriver.getTitle());
                AlyDriver.close();
                break;
            }
            AlyDriver.switchTo().window(CurrentWindowID);
        }


    }

}
