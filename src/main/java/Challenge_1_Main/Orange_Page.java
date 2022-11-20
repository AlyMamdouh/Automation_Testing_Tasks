package Challenge_1_Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Orange_Page extends Orange_Base {
    @FindBy(name = "username")
    WebElement username;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    @FindBy(name = "password")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    WebElement loggin;

    public Orange_Page(WebDriver AlyDriver) {

        super(AlyDriver);

    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    /* functions of test cases */

    public void Login_Valid() {
        username.sendKeys("Admin");
        password.sendKeys("admin123");
        ClickButton(loggin);      //or use --> loggin.click();

    }


}
