package Challenge_1_Test;

import Challenge_1_Main.Orange_Page;
import Stage2.HomePage;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.io.IOException;

public class Ch1_open_url_through_cookies extends TestBase_1 {

    //fe el Testbase .. e3mlhom @BeforeClass w @AfterClass

    Cookies cokObj;

    Orange_Page Orange;

    @Test (priority = 1)
    public void signin_Valid() throws InterruptedException, IOException {
        Orange = new Orange_Page(AlyDriver);
        Orange.Login_Valid();
        Thread.sleep(2000);

    }


    @Test (priority = 2)
    public void loginCookies() throws InterruptedException {
        cokObj = new Cookies();
        AlyDriver.switchTo().newWindow(WindowType.TAB);
        cokObj.writeCookies();
        cokObj.ReadCookies();
    }

}
