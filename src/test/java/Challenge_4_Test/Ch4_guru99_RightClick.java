package Challenge_4_Test;

import Challenge_4_Main.guru99_Page;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ch4_guru99_RightClick extends TestBase_4
{

    guru99_Page guru99;

    @Test
    public void RightClick() throws InterruptedException {
        guru99 = new guru99_Page(AlyDriver);
        Actions action = new Actions(AlyDriver);
        action.contextClick(guru99.RightClickMe).perform();
        Thread.sleep(1500);
        guru99.Edit.click();


        Alert alert = AlyDriver.switchTo().alert();

        String alertText = alert.getText();

        Assert.assertEquals("clicked: edit", alertText);

        alert.accept();


    }
}
