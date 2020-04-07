import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import selenium.base.TestBase;

public class SortAlertsTest extends TestBase {

    @Test
    public void loginPageTest() throws InterruptedException {
        driver.get(url);
        driver.findElement(By.id("inputUsername")).sendKeys("test1234");
        driver.findElement(By.id("inputPassword")).sendKeys("test1234");
        driver.findElement(By.cssSelector(".btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app/div[2]/div[2]/ul/li[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[2]/div/button[1]")).click();
        Thread.sleep(2000);
        WebElement dropdownButton = driver.findElement(By.id("dropdownButton"));
        dropdownButton.click();
        Thread.sleep(2000);
        WebElement emailOption = driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[5]/div[1]/div/div/a[5]"));
        emailOption.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[5]/div[2]/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[5]/div[1]/button/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[5]/div[1]/button/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[5]/div[2]/button[2]")).click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[3]/h1")).getText().equals("My Alerts"));

    }
}
