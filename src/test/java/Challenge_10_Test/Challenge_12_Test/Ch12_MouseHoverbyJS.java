package Challenge_10_Test.Challenge_12_Test;

import Challenge_12_Main.Amazon_page;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ch12_MouseHoverbyJS extends TestBase_12
{

    Amazon_page Amazon;

    @Test
    public void MouseHoverWithJS() throws InterruptedException {
        Amazon = new Amazon_page(AlyDriver);
        JavascriptExecutor js = (JavascriptExecutor) AlyDriver;
        String MouseEffect = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false);" +
                             " arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('on mouseover');}";
        ((JavascriptExecutor) AlyDriver).executeScript(MouseEffect,Amazon.Hellobtn);
        js.executeScript("arguments[0].click();", Amazon.Account);

        Thread.sleep(2000);
        Assert.assertEquals(Amazon.YourAccount.getText(),"Your Account");
    }


}