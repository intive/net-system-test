import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import selenium.pages.CreateAccountPage;
import selenium.pages.CreateAndLoginPage;

import java.util.concurrent.TimeUnit;

public class CreateAndLoginTest {
    private WebDriver driver;


    CreateAndLoginPage clp;

    @BeforeTest

    public void setup() {
        System.setProperty("webdriver.chrome.driver","C:\\Windows\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.get("https://dev-patronage-btb.azurewebsites.net/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

    }



    @Test(priority = 0)

    public  void testCreateAndLoginPage(){

        clp = new CreateAndLoginPage(driver);

        clp.clickCreateAccount();
        clp.createAccount("alam1234", "qazwsx1", "qazwsx1");
        clp.clickCreate();
        clp.login("alam1234", "qazwsx1");
        clp.clickSignIn();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/h1")).getText().equals("Dashboard"));

    }




}


