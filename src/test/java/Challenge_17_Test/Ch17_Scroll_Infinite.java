package Challenge_17_Test;

import Challenge_17_Main.Ch17_Page;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Ch17_Scroll_Infinite extends TestBase_17
{
    @Test
    public void infiniteScroll ()
    {
        JavascriptExecutor js = (JavascriptExecutor) AlyDriver;

        long initialLength = (long) js.executeScript("return document.body.scrollHeight");
        while(true)
        {
            js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            long currentLength = (long) js.executeScript("return document.body.scrollHeight");
            if(initialLength == currentLength) {
                break;
            }
            initialLength = currentLength;
        }
    }
}
