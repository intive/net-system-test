import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.CreateAccountPage;

public class CreateAccountTest extends TestBase {

    @Test
    public void testCreateAccountPage() {
        CreateAccountPage createAccount = new CreateAccountPage(driver);
        createAccount.createAccount("1111333abc", "1111333abc","testp@1111333abc.pl", "test", "test");
        createAccount.clickCreateAccount();
        Assert.assertEquals(createAccount.getMessage(),"Sign In","Login page is not available");
    }
}


