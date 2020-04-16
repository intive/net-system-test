import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.CreateAndLoginPage;

public class CreateAndLoginTest extends TestBase {

    @Test(priority = 0)

    public  void testCreateAndLoginPage(){
        CreateAndLoginPage createAndLogin = new CreateAndLoginPage(driver);

        createAndLogin.clickCreateAccount();
        createAndLogin.createAccount("alam1234", "qazwsx1", "qazwsx1");
        createAndLogin.clickCreate();
        createAndLogin.login("alam1234", "qazwsx1");
        createAndLogin.clickSignIn();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/h1")).getText().equals("Dashboard"));
    }

}


