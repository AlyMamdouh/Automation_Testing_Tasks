package Challenge_14_Test;

import Challenge_12_Main.Amazon_Page;
import Challenge_14_Main.Amazonn_Page;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ch14_JS extends TestBase_14
{
    Amazonn_Page Amazonn;

    @Test
    public void MouseHoverWithJS() throws InterruptedException
    {
        Amazonn = new Amazonn_Page(AlyDriver);
        JavascriptExecutor js = (JavascriptExecutor) AlyDriver;
        String MouseEffect = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false);" +
                " arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('on mouseover');}";
        ((JavascriptExecutor) AlyDriver).executeScript(MouseEffect,Amazonn.Hellobtn);

        Assert.assertEquals(Amazonn.YourAccount.getText(),"Your Account");
    }

}
