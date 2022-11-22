package Challenge_7_Main;

import Base_of_Main.Base_All_Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class JQueryy_Page extends Base_All_Main
{
    public JQueryy_Page(WebDriver AlyDriver)
    {
        super(AlyDriver);
    }

    @FindBy (xpath = "//*[@id=\"draggable\"]")
    public  WebElement DragMe;

    @FindBy (xpath = "//*[@id=\"droppable\"]")
    public  WebElement DropHere;



//    public void ZeftDragAndDrop ()
//            throws InterruptedException
//    {
//
//
//        Actions actions =new Actions(AlyDriver);
//        actions.clickAndHold(DragMe).build().perform();
//        Thread.sleep(1000);
//
//        actions.moveToElement(DropHere).build().perform();
//        Thread.sleep(1000);
//
//        actions.release(DropHere).build().perform();
//        Thread.sleep(1000);
//
//    }


}
