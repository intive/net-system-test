import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginPageTest extends TestBase {

    @Test
    public void loginPageTest() throws InterruptedException {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.signIn("admin", "admin");
        loginPage.clickSignIn();

    }
}
