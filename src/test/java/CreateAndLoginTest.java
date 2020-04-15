import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.CreateAndLoginPage;
public class CreateAndLoginTest extends TestBase {

    CreateAndLoginPage clp;

    @Test(priority = 0)

    public  void testCreateAndLoginPage(){

        clp = new CreateAndLoginPage(driver);

        clp.clickCreateAccount();
        clp.createAccount("alam1234", "qazwsx1", "qazwsx1");
        clp.clickCreate();
        //clp.login("alam1234", "qazwsx1");
        //clp.clickSignIn();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/h1")).getText().equals("Dashboard"));

    }




}


