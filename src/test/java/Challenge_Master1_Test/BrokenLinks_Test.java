package Challenge_Master1_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenLinks_Test extends TestBase_Master1
{

    @Test
    public void BrokenLinks() throws IOException, InterruptedException
    {
        List<WebElement> links = AlyDriver.findElements(By.tagName("a"));
        System.out.println(links.size());

        int BrokenCount = 0 ;

        for(int i = 0; i<links.size(); i++ )
        {
            WebElement elements = links.get(i);

            String url= elements.getAttribute("href");
            if ((url== null)|| (url.isEmpty()))
            {
                continue;
            }
            try
            {
                URL link = new URL(url);

                HttpURLConnection http = (HttpURLConnection) link.openConnection();
                http.connect();
                int responseCode = http.getResponseCode();
                if (responseCode >= 400)
                {
                    System.out.println(url + " - " + " is broken link "+ http.getResponseCode());
                    BrokenCount ++;

                }
                else
                {
                    System.out.println(url + " - " + " is Valid link "+ http.getResponseCode());

                }
            }
            catch (MalformedURLException e)
            {
                System.out.println(e.getMessage());
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }


        }

        System.out.println("The number of broken links = " + BrokenCount );

    }
}