import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import selenium.base.TestBase;

import java.util.concurrent.TimeUnit;

public class EditAlertsTest extends TestBase {

    @Test

    public void EditAlertsTest() throws InterruptedException {
        driver.get(url);
        driver.findElement(By.id("inputUsername")).sendKeys("test1234");
        driver.findElement(By.id("inputPassword")).sendKeys("test1234");
        driver.findElement(By.cssSelector(".btn")).click();
        driver.findElement(By.xpath("/html/body/app/div[2]/div[2]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[2]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[6]/div[1]/div[2]/button[1]/span")).click();

        Select size = new Select(driver.findElement(By.id("valueType")));
        size.selectByVisibleText("Trade Count");
        driver.findElement(By.id("value")).clear();
        driver.findElement(By.id("value")).sendKeys("600");
        driver.findElement(By.id("innerDiv")).click();
        driver.findElement(By.cssSelector("#innerDiv > div.text-right > button.btn.btn-success.btn-sm")).click();
        driver.findElement(By.xpath("/html/body/app/div[2]/div[2]/ul/li[1]/a")).click();
        Thread.sleep(6000);
        //driver.findElement(By.cssSelector("#innerDiv > div.text-right > button.btn.btn-success.btn-sm")).click();

    }

}

