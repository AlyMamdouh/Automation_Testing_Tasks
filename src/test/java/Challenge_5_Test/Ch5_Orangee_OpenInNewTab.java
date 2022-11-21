package Challenge_5_Test;

import Challenge_5_Main.Orangee_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


public class Ch5_Orangee_OpenInNewTab extends TestBase_5 {

    Orangee_Page Orangee;

    @Test
    public void OpenRecruitmentInNewTab() throws InterruptedException
    {
        Orangee = new Orangee_Page(AlyDriver);

        Orangee.Login();
        Thread.sleep(2000);

        Orangee.OpenInNewTab();
        Thread.sleep(2000);

    }




}
