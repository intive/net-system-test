import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.base.TestBase;

public class RememberMeTest extends TestBase {
    @Test
    public void loginPageTest() throws InterruptedException {
        driver.get(url);
        driver.findElement(By.id("inputUsername")).sendKeys("test1234");
        driver.findElement(By.id("inputPassword")).sendKeys("test1234");
        WebElement checkbox = driver.findElement(By.id("inputRememberMe"));
        checkbox.click();
        driver.findElement(By.cssSelector(".btn")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/h1")).getText().equals("Dashboard"));
    }
}
