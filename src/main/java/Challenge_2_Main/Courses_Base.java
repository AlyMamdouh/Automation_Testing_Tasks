package Challenge_2_Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Courses_Base {
    protected WebDriver AlyDriver;

    public Courses_Base(WebDriver AlyDriver) {
        PageFactory.initElements(AlyDriver, this);
    }


    //Static Method for clicking
    protected static void ClickButton(WebElement button) {
        button.click();
    }
}
