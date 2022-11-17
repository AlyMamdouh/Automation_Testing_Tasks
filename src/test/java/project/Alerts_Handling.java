package project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alerts_Handling extends TestBase {


    @Test
    // ALERT byzhar mn el browser fo2 fl nos w gwah buttons "accept" and "dismiss"


    public void TestAlert1() throws InterruptedException {

        Alert alert = AlyDriver.switchTo().alert();                                 //bt2ollo ybos 3al ALERT


        String alertText = alert.getText();                                        //hat el text elle gwa al ALERT
        Thread.sleep(2000);
        Assert.assertEquals("eltext elle byzhr fe al ALERT", alertText);     //check el text elle gwa al ALERT


        alert.accept();                                                            //hyclick 3la OK or ACCEPT

      /* or
       alert.dismiss();                                                          //hyclick 3la DISMISS or CANCEL
       */

        WebElement messageBack = AlyDriver.findElement(By.id("ID eltext elle byzhr ba3d ma bados 3la al ALERT"));
        Assert.assertEquals("eltext elle byzhr ba3d ma bados 3la al ALERT",messageBack.getText());

    }



    @Test
    // ALERT byzhar w gwah text box wna ad5l feh inputs wb3dha aclick 3la button


    public void TestAlert3() throws InterruptedException {

        Alert alert = AlyDriver.switchTo().alert();


        String alertText = alert.getText();
        Thread.sleep(2000);
        Assert.assertEquals("eltext elle byzhr gwa el ALERT", alertText);


        alert.sendKeys("al 7aga elle hd5lha fl text box elle gwa al ALERT"); //hyda5al klam fl text box elle gwa el ALERT


        alert.accept();

    }


}
