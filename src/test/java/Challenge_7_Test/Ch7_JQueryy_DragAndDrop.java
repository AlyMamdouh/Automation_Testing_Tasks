package Challenge_7_Test;

import Challenge_7_Main.JQueryy_Page;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ch7_JQueryy_DragAndDrop extends TestBase_7
{
    JQueryy_Page JQueryy;

    @Test
    public void Dragging_Dropping() throws InterruptedException
    {

        JQueryy = new JQueryy_Page(AlyDriver);


        AlyDriver.switchTo().frame(0);


        Actions act=new Actions(AlyDriver);
        act.dragAndDrop(JQueryy.DragMe, JQueryy.DropHere).perform();
        Assert.assertEquals("Dropped!", JQueryy.DropHere.getText());


//            JQueryy.ZeftDragAndDrop();




    }


}
