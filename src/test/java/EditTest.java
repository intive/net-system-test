import io.github.bonigarcia.wdm.WebDriverManager;
import selenium.base.TestBase;
import selenium.pages.EditPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class EditTest extends TestBase {
    //private WebDriver driver;

    EditPage ep;

   /* @BeforeTest

    public void setup() {
        WebDriverManager.chromedriver().version("80.0.3987.16").setup();
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.get("https://dev-patronage-btb.azurewebsites.net/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

    }*/



    @Test()

    public  void testEditPage(){
        ep = new EditPage(driver);

        ep.signIn("test1234","test1234");
        ep.clickSignIn();
        ep.clickProfile();
       ep.clickEdit();
        ep.editProfile("ala123", "test no2", "GASBTC");
        ep.clickChanges();


    }



}

