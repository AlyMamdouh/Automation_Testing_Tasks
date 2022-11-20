package Challenge_2_Test;


import Challenge_2_Main.Courses_Page;
import org.testng.annotations.Test;
import java.io.IOException;


public class Ch2_iFrame extends TestBase_2
{
    Courses_Page Courses ;


    @Test
    public void TestFrameWithIDorName() throws InterruptedException, IOException
    {

        Courses = new Courses_Page(AlyDriver);
         AlyDriver.switchTo().frame(0);
         Courses.JSOpen.click();

       Thread.sleep(2000);
       AlyDriver.switchTo().defaultContent();

    }


}
