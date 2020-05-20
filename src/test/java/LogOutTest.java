import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.LogOutPage;

public class LogOutTest extends TestBase {

    @Test(groups = "loginRequired")
    public void logoutPageTest() {
        LogOutPage logOut=new LogOutPage(driver);
        logOut.clickLogout();

        Assert.assertEquals(logOut.getMessage(),"Sign In");
    }
}

