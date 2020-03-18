package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class BasicFirefoxTest {

    @Test
    public void openBrowser() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "D:\\Patronage 2020\\Repo\\BitCoiny\\patronage-qa-bitcoiny\\bitcoiny\\geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        FirefoxProfile firefoxProfile = new FirefoxProfile();
        firefoxProfile.setPreference("browser.privatebrowsing.autostart", true);

        WebDriver driver = new FirefoxDriver(options);
        driver.manage().window().maximize();
        driver.get("https://dev-patronage-btb.azurewebsites.net");
        Thread.sleep(8000);
        driver.quit();
    }

}
