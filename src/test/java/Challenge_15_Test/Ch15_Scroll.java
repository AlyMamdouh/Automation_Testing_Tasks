package Challenge_15_Test;

import Challenge_15_Main.Ch15_Page;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Ch15_Scroll extends TestBase_15
{
    Ch15_Page Ch15obj;


    @Test
    public void Scrolling() throws InterruptedException {
        Ch15obj = new Ch15_Page(AlyDriver);

        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor) AlyDriver;

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");       //used to Scroll till the buttom of the webpage in the vertical direction.

        // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");         //used to Scroll till the top of the webpage in the vertical direction.
        // js.executeScript("arguments[0].scrollIntoView();", element);                //used to Scroll till the visibility of a specified element.
        // js.executeScript("window.scrollBy(2000,0)");                                //used to Scroll to the right of the webpage in the horizontal direction.
        // js.executeScript("window.scrollBy(-3000,0)");                               //used to Scroll to the left of the webpage in the horizontal direction.


        Thread.sleep(3000);

    }
}
