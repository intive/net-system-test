import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.CreateAccountPage;

public class CreateAccountTest extends TestBase{

      @Test

    public  void testCreateAccountPage() throws InterruptedException {
          CreateAccountPage createAccount = new CreateAccountPage(driver);
        createAccount.clickCreateAccount();
        createAccount.createAccount("test", "testpatron2020@o2.pl", "test", "test");
        createAccount.clickCreate();

    }

}
