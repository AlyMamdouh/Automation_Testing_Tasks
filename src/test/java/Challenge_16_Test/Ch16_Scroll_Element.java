package Challenge_16_Test;

import Challenge_16_Main.Ch16_Page;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Ch16_Scroll_Element extends TestBase_16
{
    Ch16_Page Ch16obj;

    @Test
    public void scroll_element() throws InterruptedException {
        Ch16obj = new Ch16_Page(AlyDriver);

        AlyDriver.switchTo().frame("courses-iframe");

        JavascriptExecutor js = (JavascriptExecutor) AlyDriver;
        js.executeScript("arguments[0].scrollIntoView();", Ch16obj.SelCourse);

        Thread.sleep(2000);

        Ch16obj.SelCourse.click();
    }
}
