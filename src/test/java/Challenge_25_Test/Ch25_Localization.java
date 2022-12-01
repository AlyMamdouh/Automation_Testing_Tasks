package Challenge_25_Test;

import Challenge_25_Main.Ch25_Page;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ch25_Localization extends TestBase_25
{

    // run from XML file "XML_Ch25"

    Ch25_Page Ch25obj;

    @Test(priority = 1)
    public void LocalizationEN()
    {
        Ch25obj = new Ch25_Page(AlyDriver);

//        System.out.println(AlyDriver.getTitle());
        Assert.assertEquals(AlyDriver.getTitle() , "Amazon.com. Spend less. Smile more.");

//        System.out.println(Ch25obj.HelloSignin.getText());
        Assert.assertEquals(Ch25obj.HelloSignin.getText(),"Hello, sign in");
    }


    @Test(priority = 2)
    public void LocalizationDE()
    {
        Ch25obj = new Ch25_Page(AlyDriver);

//        System.out.println(AlyDriver.getTitle());
        Assert.assertEquals(AlyDriver.getTitle() , "Amazon.com. Spend less. Smile more.");

//        System.out.println(Ch25obj.HelloSignin.getText());
        Assert.assertEquals(Ch25obj.HelloSignin.getText(),"Hallo, anmelden");
    }


    @Test(priority = 3)
    public void LocalizationES()
    {
        Ch25obj = new Ch25_Page(AlyDriver);

//        System.out.println(AlyDriver.getTitle());
        Assert.assertEquals(AlyDriver.getTitle() , "Amazon.com. Gasta menos. Sonríe más.");

//        System.out.println(Ch25obj.HelloSignin.getText());
        Assert.assertEquals(Ch25obj.HelloSignin.getText(),"Hola, Identifícate");
    }
}
