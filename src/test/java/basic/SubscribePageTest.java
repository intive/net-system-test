package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SubscribePageTest {
    private WebDriver driver;
    private final String url = "https://dev-patronage-btb.azurewebsites.net";

    @BeforeClass
    private void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\Patronage 2020\\Repo\\BitCoiny\\patronage-qa-bitcoiny\\bitcoiny\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }

    @Test
    public void subscribePageTest() throws InterruptedException {
        driver.get(url);
        driver.findElement(By.id("inputUsername")).sendKeys("testqa");
        driver.findElement(By.id("inputPassword")).sendKeys("1234");
        driver.findElement(By.xpath("/html/body/app/div/div/div/div/div[2]/form/button")).click();
        driver.findElement(By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(4) > button:nth-child(1)")).click();
        Thread.sleep(8000);
        driver.quit();
    }
}