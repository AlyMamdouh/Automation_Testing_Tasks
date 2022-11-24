package Challenge_12_Test;

import Challenge_12_Main.Amazon_Page;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ch12_MouseHoverbyJS extends TestBase_12
{

    Amazon_Page Amazon;

    @Test
    public void MouseHoverWithJS() throws InterruptedException
    {
        Amazon = new Amazon_Page(AlyDriver);
        JavascriptExecutor js = (JavascriptExecutor) AlyDriver;
        String MouseEffect = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false);" +
                             " arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('on mouseover');}";
        ((JavascriptExecutor) AlyDriver).executeScript(MouseEffect,Amazon.Hellobtn);
        js.executeScript("arguments[0].click();", Amazon.Account);

        Thread.sleep(2000);
        Assert.assertEquals(Amazon.YourAccount.getText(),"Your Account");
    }


}