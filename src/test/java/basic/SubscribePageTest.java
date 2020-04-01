package basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SubscribePageTest {
    private WebDriver driver;
    private final String url = "https://dev-patronage-btb.azurewebsites.net";

    @BeforeClass
    protected void setUp() {
        WebDriverManager.chromedriver().version("80.0.3987.16").setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterClass
    private void tearDown() {
        driver.quit();
    }

    @Test
    public void subscribePageTest() throws InterruptedException {

        driver.get(url);
        driver.findElement(By.id("inputUsername")).sendKeys("admin");
        driver.findElement(By.id("inputPassword")).sendKeys("admin");
        driver.findElement(By.cssSelector(".btn")).click();
        driver.findElement(By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(4) > button:nth-child(1)")).click();

        Select condition = new Select(driver.findElement(By.id("condition")));
        condition.selectByVisibleText("Crossing");

        Select valueTypeInput = new Select(driver.findElement(By.id("valueType")));
        valueTypeInput.selectByVisibleText("Volume");

        driver.findElement(By.id("value")).sendKeys("0,25");

        WebElement sendEmail = driver.findElement(By.id("sendEmail"));
        sendEmail.click();

        driver.findElement(By.id("email")).sendKeys("patronagetest01@gmail.com");
        driver.findElement(By.id("message")).sendKeys("Setting Alert.");
        driver.findElement(By.cssSelector(".btn-success")).click(); //confirm

        driver.get(url);
        Assert.assertEquals(driver.getTitle(), "BTB", "Alert was added.");

        Thread.sleep(5000);
        driver.quit();
    }
}
