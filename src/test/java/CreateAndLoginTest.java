import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.CreateAccountPage;
import selenium.pages.LoginPage;

public class CreateAndLoginTest extends TestBase {

    @Test(priority = 0)

    public  void testCreateAndLoginPage(){
        CreateAccountPage createAccount = new CreateAccountPage(driver);
        createAccount.clickCreateAccount();
        createAccount.createAccount("alam1234","testpatron2020@o2.pl","qazwsx1", "qazwsx1");
        createAccount.clickCreate();

        LoginPage login=new LoginPage(driver);
        login.signIn("alam1234", "qazwsx1");
        login.clickSignIn();
        
    }

}


