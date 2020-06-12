import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.CreateAccountPage;
import selenium.pages.LoginPage;

public class CreateAndLoginTest extends TestBase {

    @Test
    public void testCreateAndLoginPage() {
        CreateAccountPage createAccount = new CreateAccountPage(driver);
        createAccount.createAccount("4111222abc", "4111222abc","testp@4111222abc.pl", "test", "test");
        createAccount.clickCreateAccount();
        Assert.assertEquals(createAccount.getMessage(),"Sign In");
        LoginPage login=new LoginPage(driver);
        login.signIn("4111222abc", "test");
        login.clickSignIn();
        Assert.assertEquals(login.getMessages(), "Dashboard");
    }
}


