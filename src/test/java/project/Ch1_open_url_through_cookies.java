package project;

import Stage2.HomePage;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.io.IOException;

public class Ch1_open_url_through_cookies extends TestBase {

    //fe el Testbase .. e3mlhom @BeforeClass w @AfterClass

    Cookies cokObj;

    HomePage Orange;

    @Test (priority = 1)
    public void signin_Valid() throws InterruptedException, IOException {
        Orange = new HomePage(AlyDriver);
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
