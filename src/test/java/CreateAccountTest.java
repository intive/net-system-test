import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.CreateAccountPage;
import selenium.pages.EditPage;

import java.util.concurrent.TimeUnit;

public class CreateAccountTest extends TestBase{
    //private WebDriver driver;

    CreateAccountPage cap;

   /* @BeforeTest

    public void setup() {
        WebDriverManager.chromedriver().version("80.0.3987.16").setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.get("https://dev-patronage-btb.azurewebsites.net/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

    }*/



    @Test(priority = 0)

    public  void testCreateAccountPage(){
        cap = new CreateAccountPage(driver);

        cap.clickCreateAccount();
       cap.createAccount("alam123", "qazwsx", "qazwsx");
       cap.clickCreate();


    }

}
