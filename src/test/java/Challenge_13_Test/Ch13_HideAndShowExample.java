package Challenge_13_Test;

import Challenge_13_Main.Coursesss_Page;
import org.testng.annotations.Test;

public class Ch13_HideAndShowExample extends TestBase_13
{
    Coursesss_Page Coursesss;

    @Test
    public void HideAndShow() throws InterruptedException
    {
        Coursesss = new Coursesss_Page(AlyDriver);
        System.out.println("Text Box Displayed: " + Coursesss.TextBox.isDisplayed());
        Thread.sleep(2000);


        Coursesss.Hidebtn.click();
        System.out.println("Clicked on hide button");
        System.out.println("Text Box Displayed: " + Coursesss.TextBox.isDisplayed());
        Thread.sleep(2000);


        Coursesss.Showbtn.click();
        System.out.println("Clicked on show button");
        System.out.println("Text Box Displayed: " + Coursesss.TextBox.isDisplayed());
        Thread.sleep(2000);

    }

}
