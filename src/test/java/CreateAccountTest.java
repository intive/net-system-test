import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.CreateAccountPage;

public class CreateAccountTest extends TestBase{

    CreateAccountPage cap;

      @Test

    public  void testCreateAccountPage() throws InterruptedException {
        cap = new CreateAccountPage(driver);
        Thread.sleep(2000);
          cap.clickCreateAccount();
       cap.createAccount("alam1234", "qazwsx", "qazwsx");
          cap.clickCreate();
    }

}
