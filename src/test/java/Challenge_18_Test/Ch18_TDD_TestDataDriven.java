package Challenge_18_Test;

import Challenge_18_Main.Ch18_Page;
import Challenge_18_Main.Excel_Data_Reader;
import org.testng.annotations.Test;

public class Ch18_TDD_TestDataDriven extends TestBase_18
{
    Ch18_Page Ch18obj ;


    @Test(dataProvider = "test_data" , dataProviderClass = Excel_Data_Reader.class)
    public void Signin_InValid_DD(String Username , String Password) throws InterruptedException
    {
        Ch18obj = new Ch18_Page(AlyDriver);

        Ch18obj.usernamee.clear();
        Ch18obj.usernamee.sendKeys(Username);

        Ch18obj.passwordd.clear();
        Ch18obj.passwordd.sendKeys(Password);

        Ch18obj.logginn.click();

        Thread.sleep(1000);

    }

}

