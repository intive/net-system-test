import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import selenium.pages.CreateAccountPage;
import selenium.pages.EditPage;

import java.util.concurrent.TimeUnit;

public class CreateAccountTest {
    private WebDriver driver;

    CreateAccountPage cap;

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

    public  void testCreateAccountPage(){
        cap = new CreateAccountPage(driver);

        cap.clickCreateAccount();
       cap.createAccount("alam123", "qazwsx", "qazwsx");
       cap.clickCreate();


    }

}