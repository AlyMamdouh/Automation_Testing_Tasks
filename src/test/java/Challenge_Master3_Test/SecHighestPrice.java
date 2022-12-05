package Challenge_Master3_Test;

import Challenge_Master3_Main.Master3_Page;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecHighestPrice extends TestBase_Master3
{
    static Master3_Page sauceobj;

    static void Highest_Price()
    {
        List<Float> N = new ArrayList<>();

        for(int i = 0 ;i < sauceobj.ItemsPrice.size();i++)

        {
            String s = sauceobj.ItemsPrice.get(i).getText();
            s= s.replace("$","");

            Float t = Float.parseFloat(s);
            N.add(t);
        }

        Collections.sort(N);                // by default it sorts ascending-ly "mn el so3'ayar lel kebeer"

        for (int i = 0 ; i < N.size() ; i++)
        {
            System.out.println(N.get(i));
        }
        int x = N.size()-2;             // -2 as we want the "SECOND" highest price, so for the first one it will be -1 (hya5od el tany mn ta7t)

        System.out.println("The Second Highest Price = " + N.get(x));
    }


    @Test
    public void Highest_Sec_Price() throws InterruptedException {
        sauceobj = new Master3_Page(AlyDriver);

        sauceobj.Username.sendKeys("standard_user");
        sauceobj.Pass.sendKeys("secret_sauce");
        sauceobj.loginbtn.click();


        Thread.sleep(3000);

        Highest_Price();

    }
}
