import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;

public class DeleteAlertsTest extends TestBase {
    @Test
    public void DeleteAlert() throws InterruptedException {
        driver.get(url);
        driver.findElement(By.id("inputUsername")).sendKeys("test1234");
       // Thread.sleep(1000);
        driver.findElement(By.id("inputPassword")).sendKeys("test1234");
       // Thread.sleep(1000);
        driver.findElement(By.cssSelector(".btn")).click();
        driver.findElement(By.xpath("/html/body/app/div[2]/div[2]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[2]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[7]/div[1]/div[2]/button[2]/span")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("/html/body/app/div[2]/div[2]/ul/li[1]/a")).click();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/h1")).getText().equals("Dashboard"));
        //driver.findElement(By.cssSelector("body > app > div.sidebar > div.collapse > ul > li:nth-child(1) > a")).click();
        Thread.sleep(6000);
    }
}
