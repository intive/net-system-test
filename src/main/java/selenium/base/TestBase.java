package selenium.base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import selenium.pages.LoginPage;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
public class TestBase {
    protected WebDriver driver;
    private String url;
    @BeforeSuite
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        Properties props = new Properties();
        try {
            props.load(this.getClass().getResourceAsStream("/main.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        url = "https://" + props.getProperty("env") + "-patronage-btb.azurewebsites.net/";
    }
    @BeforeTest
    public void setBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(url);
    }
    @BeforeMethod(onlyForGroups = "loginRequired")
    public void login(){
        LoginPage lp=new LoginPage(driver);
        lp.signIn("admin", "admin");
    }
    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}