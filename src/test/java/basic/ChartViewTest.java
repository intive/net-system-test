package basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ChartViewTest {

    private WebDriver driver;
    private final String url = "https://dev-patronage-btb.azurewebsites.net";

    @BeforeClass
    private void setUp() {
        WebDriverManager.chromedriver().version("80.0.3987.16").setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }
    @AfterClass
    private void tearDown() {
        driver.quit();
    }

    @Test
    public void chartViewTest() throws InterruptedException {
        driver.get(url);
        driver.findElement(By.id("inputUsername")).sendKeys("admin");
        driver.findElement(By.id("inputPassword")).sendKeys("admin");
        driver.findElement(By.cssSelector(".btn")).click();
        driver.findElement(By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(1) > a:nth-child(1)")).click();
        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("div.btn-group:nth-child(4) > button:nth-child(2)")).click();
        Assert.assertNotNull("One chart found", driver.findElement(By.tagName("canvas")));
        driver.findElement(By.cssSelector("div.btn-group:nth-child(4) > button:nth-child(1)")).click();
        driver.findElement(By.cssSelector("div.btn-group:nth-child(4) > button:nth-child(2)")).click();
        Assert.assertNotNull("Chart after changed view to table", driver.findElement(By.tagName("canvas")));
        Thread.sleep(5000);
        driver.quit();
    }

}
