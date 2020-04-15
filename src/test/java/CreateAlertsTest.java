import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import selenium.base.TestBase;

import java.util.concurrent.TimeUnit;

public class CreateAlertsTest extends TestBase {
    /*private WebDriver driver;
    private final String url = "https://dev-patronage-btb.azurewebsites.net";

    @BeforeClass
    private void setUp() {
        WebDriverManager.chromedriver().version("80.0.3987.16").setup();
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

    }*/

    @Test(groups = "loginRequired")
    public void AlertsTest() throws InterruptedException {
        //driver.get(url);
       // driver.findElement(By.id("inputUsername")).sendKeys("test1234");
       // driver.findElement(By.id("inputPassword")).sendKeys("test1234");
       // driver.findElement(By.cssSelector(".btn")).click();
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/table/tbody/tr[1]/td[5]/button")).click();
        driver.findElement(By.id("condition")).click();
        Select options = new Select(driver.findElement(By.tagName("select")));
        options.selectByVisibleText("Crossing");
        Select size = new Select(driver.findElement(By.id("valueType")));
        size.selectByVisibleText("Price");
        driver.findElement(By.id("value")).clear();
        driver.findElement(By.id("value")).sendKeys("0,4");
        driver.findElement(By.id("innerDiv")).click();
        driver.findElement(By.cssSelector("#innerDiv > div.text-right > button.btn.btn-success.btn-sm")).click();
        driver.findElement(By.cssSelector("body > app > div.sidebar > div.collapse > ul > li:nth-child(1) > a")).click();
        Thread.sleep(6000);

    }

}

