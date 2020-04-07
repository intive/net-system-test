import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import selenium.base.TestBase;

import java.util.concurrent.TimeUnit;

public class BasicLoginPageTest extends TestBase {

    @Test
    public void loginPageTest() throws InterruptedException {
        driver.get(url);
        driver.findElement(By.id("inputUsername")).sendKeys("test1234");
        driver.findElement(By.id("inputPassword")).sendKeys("test1234");
        driver.findElement(By.cssSelector(".btn")).click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/h1")).getText().equals("Dashboard"));

    }

}