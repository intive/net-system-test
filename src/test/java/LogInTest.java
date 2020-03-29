import io.github.bonigarcia.wdm.WebDriverManager;
import selenium.pages.LogowaniePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LogInTest {
    private WebDriver driver;

    LogowaniePage lp;

    @BeforeTest

    public void setup() {
//        System.setProperty("webdriver.chrome.driver","C:\\Windows\\chromedriver.exe");
        WebDriverManager.chromedriver().version("80.0.3987.16").setup();
        ChromeOptions options = new ChromeOptions();
       // options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.get("https://dev-patronage-btb.azurewebsites.net/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

    }



    @Test (priority = 0)

    public  void testLoginPage(){
        lp = new LogowaniePage(driver);

        lp.signIn("admin","admin");

        // lp.clickRememberMe();
        lp.clickSignIn();


    }



}
