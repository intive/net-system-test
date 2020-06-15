import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicFirefoxTest {

    public WebDriver driver;
    private final String url = "https://qa-patronage-btb.azurewebsites.net";

    @AfterClass
    public void tearDown() { driver.quit(); }

    @Test
    public void openFirefoxBrowser() {
        System.setProperty("webdriver.gecko.driver", "D:\\Patronage 2020\\Repo\\BitCoiny\\patronage-qa-bitcoiny\\bitcoiny\\geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        FirefoxProfile firefoxProfile = new FirefoxProfile();
        firefoxProfile.setPreference("browser.privatebrowsing.autostart", true);

        WebDriver driver = new FirefoxDriver(options);
        driver.manage().window().maximize();
        driver.get("https://dev-patronage-btb.azurewebsites.net");
        driver.get(url);
        Assert.assertEquals(driver.getTitle(), "BTB", "Valid page title. Edge browser open.");
        driver.quit();
    }
}