package selenium.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
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
        WebDriverManager.operadriver().setup();
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
        OperaOptions options = new OperaOptions();
        options.addArguments("--incognito");

        driver = new OperaDriver(options);
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
    }
}