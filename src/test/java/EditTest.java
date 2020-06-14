import org.testng.Assert;
import selenium.base.TestBase;
import selenium.pages.EditPage;
import org.testng.annotations.Test;

public class EditTest extends TestBase {

    @Test(groups = "loginRequired")
    public  void testEditPage() {
        EditPage editProfile = new EditPage(driver);
        editProfile.clickProfile();
        Assert.assertTrue(editProfile.getProfile().contains("Profile Bio"),"Description of user profile is not available");
        editProfile.clickEdit();
        Assert.assertTrue(editProfile.getEdit().contains("Edit Profile"),"Redirection to User Profile page has not been done");
        editProfile.editProfile();
        editProfile.clickChanges();
        Assert.assertEquals(editProfile.getMessage(), "Ala123","User name is not as expected");
    }
}

