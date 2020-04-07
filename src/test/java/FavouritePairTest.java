import org.openqa.selenium.By;
import org.testng.annotations.Test;
import selenium.base.TestBase;

public class FavouritePairTest extends TestBase {
    @Test
    public void FavouritePairTest() throws InterruptedException {
        driver.get(url);
        driver.findElement(By.id("inputUsername")).sendKeys("test1234");
        driver.findElement(By.id("inputPassword")).sendKeys("test1234");
        driver.findElement(By.cssSelector(".btn")).click();
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/table/tbody/tr[3]/td[1]/a/span")).click();
        driver.findElement(By.xpath("/html/body/app/div[2]/div[2]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[2]/div/button[2]")).click();

    }
}
