package Challenge_25_Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class TestBase_25 {

    public static WebDriver AlyDriver;


    @BeforeMethod

    @Parameters({"Browser", "lang"})
    public void startDriver(@Optional("Chrome") String BrowserName , String lang)
    {
        if (BrowserName.equalsIgnoreCase("Chrome"))
        {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--lang="+lang);
//            options.addArguments("--window-size=1920,1080");

            WebDriverManager.chromedriver().setup();
            AlyDriver = new ChromeDriver(options);

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

        AlyDriver.navigate().to("https://www.amazon.com/");
        AlyDriver.manage().window().maximize();

    }

    /////**************************************************************************************************************/////
    @AfterMethod

    public void logout()
    {
        AlyDriver.quit();      // law 3ayez te2fel el browser 5ales.

        // AlyDriver.close();     // law 3ayez te2fel tab wa7da bs mn el tabs almafto7a.
    }


}