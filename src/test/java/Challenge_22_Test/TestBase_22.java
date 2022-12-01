package Challenge_22_Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class TestBase_22 {

    public static WebDriver AlyDriver;


    @BeforeClass

    @Parameters("Browser")
    public void startDriver(@Optional("Chrome") String BrowserName) {
        if (BrowserName.equalsIgnoreCase("Chrome"))
        {
            WebDriverManager.chromedriver().setup();
            AlyDriver = new ChromeDriver();

        }
        else if (BrowserName.equalsIgnoreCase("Firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            AlyDriver = new FirefoxDriver();
        }
        else if (BrowserName.equalsIgnoreCase("IE"))
        {
            WebDriverManager.iedriver().setup();
            AlyDriver = new InternetExplorerDriver();
        }
        else if (BrowserName.equalsIgnoreCase("Safari"))
        {
            WebDriverManager.safaridriver().setup();
            AlyDriver = new SafariDriver();
        }

        AlyDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        AlyDriver.navigate().to("https://trytestingthis.netlify.app/");
        AlyDriver.manage().window().maximize();

    }

    /////**************************************************************************************************************/////
    @AfterClass

    public void logout()
    {
        AlyDriver.quit();      // law 3ayez te2fel el browser 5ales.

        // AlyDriver.close();     // law 3ayez te2fel tab wa7da bs mn el tabs almafto7a.
    }


}