package Challenge_21_Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class TestBase_21
{

    public static ThreadLocal <WebDriver> AlyDriver = new ThreadLocal<>();

    public WebDriver GET_Driver()
    {
        return AlyDriver.get();
    }


    @BeforeMethod
    @Parameters("Browser")
    public void startDriver(@Optional("Chrome") String BrowserName) {
        if (BrowserName.equalsIgnoreCase("Chrome"))
        {
            WebDriverManager.chromedriver().setup();
            AlyDriver.set(new ChromeDriver());

        }
        else if (BrowserName.equalsIgnoreCase("Firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            AlyDriver.set(new FirefoxDriver());

        }
        else if (BrowserName.equalsIgnoreCase("IE"))
        {
            WebDriverManager.iedriver().setup();
            AlyDriver.set(new InternetExplorerDriver());

        }
        else if (BrowserName.equalsIgnoreCase("Safari"))
        {
            WebDriverManager.safaridriver().setup();
            AlyDriver.set(new SafariDriver());

        }

        //Headless Browser Testing
        else if (BrowserName.equalsIgnoreCase("Chrome-headless"))
        {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            options.addArguments("--window-size=1920,1080");

            WebDriverManager.chromedriver().setup();
            AlyDriver.set(new ChromeDriver(options));
        }


        GET_Driver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        GET_Driver().navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        GET_Driver().manage().window().maximize();

    }

    /////**************************************************************************************************************/////
//
//    @AfterMethod
//
//    public void logout()
//    {
//        AlyDriver.quit();      // law 3ayez te2fel el browser 5ales.
//
//        // AlyDriver.close();     // law 3ayez te2fel tab wa7da bs mn el tabs almafto7a.
//    }


}