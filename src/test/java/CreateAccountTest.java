import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.CreateAccountPage;

public class CreateAccountTest extends TestBase{

      @Test

    public  void testCreateAccountPage() throws InterruptedException {
          CreateAccountPage createAccount = new CreateAccountPage(driver);
        createAccount.clickCreateAccount();
        createAccount.createAccount("qaz12345", "qazwsx", "qazwsx");
        createAccount.clickCreate();
    }

}
