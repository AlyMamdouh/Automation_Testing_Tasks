package project;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class open_url_through_cookies extends TestBase {

    Cookies cokObj;
    @Test(priority = 1)
    public void loginCookies()
    {
        cokObj = new Cookies();
        AlyDriver.switchTo().newWindow(WindowType.TAB);
        cokObj.writeCookies();
        cokObj.ReadCookies();
    }

}
