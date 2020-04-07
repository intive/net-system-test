import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import selenium.base.TestBase;

public class ExpandCollapseAlertTest extends TestBase {
    @Test

    public void EditAlertsTest() throws InterruptedException {
        driver.get(url);
        driver.findElement(By.id("inputUsername")).sendKeys("test1234");
        driver.findElement(By.id("inputPassword")).sendKeys("test1234");
        driver.findElement(By.cssSelector(".btn")).click();
        driver.findElement(By.xpath("/html/body/app/div[2]/div[2]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[2]/div/button[1]")).click();

      /* driver.findElement(By.xpath("\"/html/body/app/div[3]/div[2]/div[5]/div[2]/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[3]/div[4]/div[1]/div[2]/button[1]/span")).click();

        Select size = new Select(driver.findElement(By.id("valueType")));
        size.selectByVisibleText("Price");
        driver.findElement(By.id("value")).clear();
        driver.findElement(By.id("value")).sendKeys("200");
        driver.findElement(By.id("innerDiv")).click();
        driver.findElement(By.cssSelector("#innerDiv > div.text-right > button.btn.btn-success.btn-sm")).click();
        Thread.sleep(1000);*/
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[5]/div[2]/button[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[5]/div[2]/button[2]")).click();
        Thread.sleep(1000);
        //driver.findElement(By.cssSelector("#innerDiv > div.text-right > button.btn.btn-success.btn-sm")).click();

    }

}

