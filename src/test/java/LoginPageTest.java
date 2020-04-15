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

    @Test(groups = "loginRequired")
    public void loginPageTest() throws InterruptedException {
        Thread.sleep(3000);
      /*  loginP=new LoginPage(driver);
        loginp.signIn("test1234", "test1234");
        loginp.clickSignIn();*/

        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/h1")).getText().equals("Dashboard"));



    }}