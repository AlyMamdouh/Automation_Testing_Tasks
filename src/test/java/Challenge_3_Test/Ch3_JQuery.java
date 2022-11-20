package Challenge_3_Test;

import Challenge_3_Main.JQuery_Page;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Ch3_JQuery extends TestBase_3
{

    JQuery_Page JQuery;

    @Test
    public void DoubleClick() throws InterruptedException {
        JQuery = new JQuery_Page(AlyDriver);
        AlyDriver.switchTo().frame(0);

        Actions clicking = new Actions(AlyDriver);
        clicking.doubleClick(JQuery.button).perform();

    }


}
