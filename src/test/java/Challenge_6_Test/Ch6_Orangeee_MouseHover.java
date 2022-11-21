package Challenge_6_Test;

import Challenge_6_Main.Orangeee_Page;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Ch6_Orangeee_MouseHover extends TestBase_6 {

    Orangeee_Page Orangeee;

    @Test
    public void OpenRecruitmentInNewTab() throws InterruptedException
    {
        Orangeee = new Orangeee_Page(AlyDriver);

        Orangeee.Login();
        Thread.sleep(1000);


        Orangeee.Recruitment.click();


        Actions action = new Actions(AlyDriver);
        action.moveToElement(Orangeee.Vacancies).perform();  // byroo7 yo2af bl mouse mn 3'er ma y3ml click
        Thread.sleep(2000);


        Orangeee.Vacancies.click();

    }




}
