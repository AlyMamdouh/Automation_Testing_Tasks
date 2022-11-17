package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Selecting_From_CheckBoxs extends TestBase
{
    @Test
    public void TestCheckBox() throws InterruptedException {
        WebElement check1 = AlyDriver.findElement(By.xpath(" el Xpath bta3 el box nfso"));           //ba2ollo yshof el box
        check1.click();                                                                                          // click 3al box yasta (law kan unchecked hy3ml check wl 3aks)
        Thread.sleep(2000);


        /* or

        WebElement check2 = AlyDriver.findElement(By.xpath(" el Xpath bta3 el box nfso"));
        if (check2.isSelected())                                                                                // law kan el box m3mollo check
        {
            check2.click();                                                                                     // e3mello uncheck
        }

         */


    }
}
