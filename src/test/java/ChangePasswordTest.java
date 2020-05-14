import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.ChangePasswordPage;

public class ChangePasswordTest extends TestBase {

    @Test (groups = "loginRequired")
    public void testEditPage(){
        ChangePasswordPage changePassword = new ChangePasswordPage(driver);

        changePassword.clickProfile();
        changePassword.clickEdit();
        changePassword.clickChange();
        changePassword.passwordChange();
        changePassword.clickForward();

        Assert.assertEquals(changePassword.getMessage(), "Sign In");
    }
}
