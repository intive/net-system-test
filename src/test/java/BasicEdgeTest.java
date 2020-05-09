import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicEdgeTest {

    public WebDriver driver;
    private final String url = "https://qa-patronage-btb.azurewebsites.net";

    @AfterClass
    public void tearDown() { driver.quit(); }

    @Test
    public void openBrowser () {
        System.setProperty("webdriver.edge.driver", "D:\\Patronage 2020\\Repo\\BitCoiny\\patronage-qa-bitcoiny\\bitcoiny\\msedgedriver.exe");
        EdgeOptions options = new EdgeOptions();
        options.setCapability("InPrivate", true);

        WebDriver driver = new EdgeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://dev-patronage-btb.azurewebsites.net");
        driver.get(url);
        Assert.assertEquals(driver.getTitle(), "BTB", "Valid page title. Edge browser open.");
        driver.quit();
    }
}