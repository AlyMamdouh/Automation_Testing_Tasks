package Challenge_20_Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class TestBase_20 {

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

        //Headless Browser Testing
        else if (BrowserName.equalsIgnoreCase("Chrome-headless"))
        {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            options.addArguments("--window-size=1920,1080");

            WebDriverManager.chromedriver().setup();
            AlyDriver = new ChromeDriver (options);
        }


        AlyDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        AlyDriver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
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