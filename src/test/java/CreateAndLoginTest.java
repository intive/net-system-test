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
        createAndLogin.createAccount("test@","testpatron2020@wp.pl" ,"qazwsx1", "qazwsx1");
        createAndLogin.clickCreate();
        createAndLogin.login("test@", "qazwsx1");
        createAndLogin.clickSignIn();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/h1")).getText().equals("Dashboard"));
    }

}


