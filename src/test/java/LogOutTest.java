import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.LogOutPage;

public class LogOutTest extends TestBase {

    @Test(groups = "loginRequired")
    public void logoutPageTest() throws InterruptedException {
        LogOutPage logOut=new LogOutPage(driver);

        Thread.sleep(3000);
        logOut.clickLogout();

        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app/div/div/div/div/div[2]/h1")).getText().equals("Intive Patronage 2020"));
    }

}

