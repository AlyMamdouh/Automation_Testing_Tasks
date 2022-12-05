package Base_of_Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Base_All_Main {
    protected static WebDriver  AlyDriver;
    public Base_All_Main(WebDriver  AlyDriver)
    {
        PageFactory.initElements(AlyDriver, this);
    }

    public static void ClickButton(WebElement button)
    {
        button.click();
    }
}


// for Allure report (video :https://www.youtube.com/watch?v=5b4ZMAjHitw&t=1315s)
// 1- delete the "allure-results" file
// 2- execute the tests you want to make allure report for
// 3- get the path of allure result   (C:\Users\aabdelhamid\IdeaProjects\TCoETraining\allure-results)
// 4- write in CMD --> allure serve C:\Users\aabdelhamid\IdeaProjects\TCoETraining\allure-results

// to check the version of allure you have .. write in CMD --> allure --version
