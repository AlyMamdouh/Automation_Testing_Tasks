package Challenge_7_Test;

import Challenge_7_Main.JQueryy_Page;
import org.testng.annotations.Test;

public class Ch7_JQueryy_DragAndDrop extends TestBase_7
{
    JQueryy_Page JQueryy;

    @Test
    public void DraggingAndDropping() throws InterruptedException
    {
        JQueryy = new JQueryy_Page(AlyDriver);

        JQueryy.DragAndDrop();

    }


}
