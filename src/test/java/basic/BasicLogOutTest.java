package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BasicLogOutTest {
    private WebDriver driver;
    private final String url = "https://dev-patronage-btb.azurewebsites.net";

    @BeforeClass
    private void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    @Test
    public void LogoutPageTest() throws InterruptedException {
        driver.get(url);
        driver.findElement(By.id("inputUsername")).sendKeys("testqa");
        driver.findElement(By.id("inputPassword")).sendKeys("1234");
        driver.findElement(By.cssSelector(".btn")).click();
        driver.findElement(By.cssSelector("body > app > div.main > div.top-row.px-4 > button")).click();
        Thread.sleep(6000);
        driver.quit();
    }

}

