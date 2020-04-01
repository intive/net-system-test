package basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import static org.openqa.selenium.By.id;

public class NegativeLoginPageTest {

    private WebDriver driver;
    private final String url = "https://dev-patronage-btb.azurewebsites.net";

    @BeforeClass
    private void setUp() {
        WebDriverManager.chromedriver().version("80.0.3987.16").setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    }

    @AfterClass
    private void tearDown() {
        driver.quit();
    }

    @Test
    public void negativeLoginPageTest() throws InterruptedException {
        driver.get(url);
        driver.findElement(id("inputUsername")).sendKeys("ad");
        driver.findElement(id("inputPassword")).sendKeys("1");
        driver.findElement(By.cssSelector(".btn")).click();
        final String expectedHref = "Dashboard";
        final String href = driver.findElement(By.className("text-danger text-center")).getAttribute("href");
        Assert.assertEquals(href, expectedHref, "Incorrect username or password.");
        Thread.sleep(6000);
        driver.quit();
        //test failed - przyczyna nieznana? expected...
    }

}