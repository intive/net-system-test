import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.CreateAccountPage;

public class CreateAccountTest extends TestBase {

    @Test
    public void testCreateAccountPage() throws InterruptedException{
        CreateAccountPage createAccount = new CreateAccountPage(driver);

        createAccount.createAccount("qazq30", "qazq30","testp@30.pl", "test", "test");
        createAccount.clickCreateAccount();
       Thread.sleep(5000); // bez tego nie przechodzi

        Assert.assertEquals(createAccount.getMessage(),"Sign In");
    }
}


