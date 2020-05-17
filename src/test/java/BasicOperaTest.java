import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicOperaTest {

    public WebDriver driver;
    private static final String url = "https://qa-patronage-btb.azurewebsites.net";

    @AfterClass
    public void tearDown() { driver.quit(); }

    @Test
    public static void openBrowser() {
        System.setProperty("webdriver.opera.driver", "D:\\Patronage 2020\\Repo\\BitCoiny\\patronage-qa-bitcoiny\\bitcoiny\\operadriver.exe");
        OperaOptions options = new OperaOptions();
        options.addArguments("--incognito");
        WebDriver driver = new OperaDriver(options);
        driver.manage().window().maximize();
        driver.get("https://dev-patronage-btb.azurewebsites.net");
        driver.get(url);
        Assert.assertEquals(driver.getTitle(), "BTB", "Valid page title. Opera browser open.");
        driver.quit();
    }

}