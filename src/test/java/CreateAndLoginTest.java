import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.CreateAccountPage;
import selenium.pages.LoginPage;

public class CreateAndLoginTest extends TestBase {

    @Test
    public void testCreateAndLoginPage()throws InterruptedException{
        CreateAccountPage createAccount = new CreateAccountPage(driver);

        createAccount.createAccount("11111","11111","testPA@23.com","test1234", "test1234");
        createAccount.clickCreateAccount();
        Thread.sleep(2000); // bez tego nie przechodzi

        LoginPage login=new LoginPage(driver);
        login.signIn("11111", "test1234");
        login.clickSignIn();

        Assert.assertEquals(login.getMessages(), "Dashboard");
    }
}


