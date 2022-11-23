package Challenge_11_Test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ch11_PrintingTitleOfPage_JavaScript extends TestBase_11
{

//    Orangeeee_Page Orangeeee;

    @Test
    public void testJavaScript()
    {
        JavascriptExecutor js = (JavascriptExecutor) AlyDriver ;
        String title = (String) js.executeScript("return document.title");
        Assert.assertEquals("OrangeHRM" , title);
        System.out.println(title);

    }

}
