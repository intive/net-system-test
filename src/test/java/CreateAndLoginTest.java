import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.CreateAccountPage;
import selenium.pages.LoginPage;

public class CreateAndLoginTest extends TestBase {

    @Test
    public void testCreateAndLoginPage()throws InterruptedException{
        CreateAccountPage createAccount = new CreateAccountPage(driver);

        createAccount.createAccount("1243","testPA@21.com","test1234", "test1234");
        Thread.sleep(2000); // bez tego nie przechodzi

        LoginPage login=new LoginPage(driver);
        login.signIn("1243", "test1234");
        login.clickSignIn();

        Assert.assertEquals(login.getMessages(), "Dashboard");
    }
}


