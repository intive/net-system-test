import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BasicChromeTest {

    public WebDriver driver;
    private final String url = "https://qa-patronage-btb.azurewebsites.net";

    @BeforeClass
    private void setUp() { WebDriverManager.chromedriver().setup(); }
    @AfterClass
    public void tearDown() { driver.quit(); }

    @Test
    public void openChromeBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://dev-patronage-btb.azurewebsites.net");
        driver.get(url);
        Assert.assertEquals(driver.getTitle(), "BTB", "Valid page title. Chrome browser open.");
    }
}