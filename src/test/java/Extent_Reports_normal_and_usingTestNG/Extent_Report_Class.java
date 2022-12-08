package Extent_Reports_normal_and_usingTestNG;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Extent_Report_Class
{
    static WebDriver ExtentDriver;                                                      // da driver gded 3'er el driver bta3k asln w htst5dmo hna bs

    public static void main (String [] args)
    {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");    // hy3ml file esmo extent.html w hy7oto barra 5ales fl project mn barra
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        ExtentTest ET = extent.createTest("Login Function");                    // bt2ollo esm el test elle 3ayz t3mlo 3shan yzhrholk fl details column


        // el test bta3k mn awl hna
        WebDriverManager.chromedriver().setup();
        ExtentDriver = new ChromeDriver();
        ExtentDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        ExtentDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        ExtentDriver.findElement(By.name("username")).sendKeys("Admin");
        ExtentDriver.findElement(By.name("password")).sendKeys("admin123");
        ExtentDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        ET.pass("User is loggedin");                                               // bt2ollo en el test lma yrun m3nah eno 3ml "user is loggedin"


        extent.flush();                                                                  // bt3ml run lel extent report


    }
}
