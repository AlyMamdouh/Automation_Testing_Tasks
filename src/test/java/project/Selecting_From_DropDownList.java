package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selecting_From_DropDownList extends TestBase
{
    @Test
    public void TestDropDownList() throws InterruptedException {

        WebElement OptionList = AlyDriver.findElement(By.id("ID el box bta3 el DropDownList"));                                 //bt2ollo ybos 3la el DropDownList

        Select SelectOptions = new Select(OptionList);                                                                          // bt2ollo ybos 3al options elle gwa el list


        Assert.assertFalse(SelectOptions.isMultiple());                                                                        // assert eno msh be allow multiple-selections (multible selections is false)
        Assert.assertEquals(3, SelectOptions.getOptions().size());                                                      // assert en el list de feha 3 options (7atta law fehom option disapled) (counting starts from 1)
        Assert.assertEquals("el text bta3 awl option fl list", SelectOptions.getFirstSelectedOption().getText());      // assert en awl option hwa el text elfolany


        SelectOptions.selectByVisibleText("el text bta3 al option elle 3ayz a5taro");                                       //bt5tar option mo3yn mn el list 3an tare2 el text bta3o

        /*
            or
        SelectOptions.selectByIndex("el index bta3 al option elle 3ayz a5taro (counting start from 0) (mn3'eer el douple coats)");   //bt5tar option mo3yn mn el list 3an tare2 el index bta3o (tartebo fl list)
            or
        SelectOptions.selectByValue("el value bta3 al option elle 3ayz a5taro");                                                     //bt5tar option mo3yn mn el list 3an tare2 el value bta3o (mn el inspect)
        */
        Thread.sleep(2000);
    }

}
