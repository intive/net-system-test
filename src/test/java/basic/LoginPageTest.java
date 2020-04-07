package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginPageTest {

    private WebDriver driver;
    private final String url = "https://dev-patronage-btb.azurewebsites.net";

    @BeforeClass
    private void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\Patronage 2020\\Repo\\BitCoiny\\patronage-qa-bitcoiny\\bitcoiny\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    }

    @Test
    public void loginPageTest() throws InterruptedException {
        driver.get(url);
        driver.findElement(By.id("inputUsername")).sendKeys("test1234");
        driver.findElement(By.id("inputPassword")).sendKeys("test1234");
        driver.findElement(By.cssSelector(".btn")).click();
        Thread.sleep(6000);
        driver.quit();
    }

}