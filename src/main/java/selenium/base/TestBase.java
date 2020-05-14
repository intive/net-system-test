package selenium.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import selenium.pages.LoginPage;
import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;
    public final String url = "https://qa-patronage-btb.azurewebsites.net/";

    @BeforeSuite
    public void setChromedriverPath() {
        WebDriverManager.chromedriver().version("81").setup();
    }

    @BeforeTest
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get(url);
    }

     @BeforeMethod(onlyForGroups = "loginRequired")
     public void login(){
     LoginPage lp=new LoginPage(driver);
     lp.signIn("test1234", "test1234");
     }

     @AfterTest
     public void tearDown() {
        driver.quit();
    }}
