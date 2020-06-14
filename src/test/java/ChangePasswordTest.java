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
        Assert.assertEquals(changePassword.getForm(),"Change Password","Form for change password is not available");
        changePassword.passwordChange();
        Assert.assertNotNull(changePassword.getMonit(),"There is no pop-up redirects to login page");
        changePassword.clickForward();
        Assert.assertEquals(changePassword.getMessage(), "Sign In","Login page is not available");
    }
}
