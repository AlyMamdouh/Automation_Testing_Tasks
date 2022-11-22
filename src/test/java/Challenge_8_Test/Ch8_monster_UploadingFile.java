package Challenge_8_Test;

import Challenge_8_Main.monster_Page;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ch8_monster_UploadingFile extends TestBase_8
{
    monster_Page monster ;

    @Test
    public void UploadingFile()
    {
        monster = new monster_Page(AlyDriver);


        monster.ChooseCV.sendKeys("C:\\Users\\aabdelhamid\\Desktop\\Automation\\Automation.docx");

    }


}
