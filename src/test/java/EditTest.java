import org.testng.Assert;
import selenium.base.TestBase;
import selenium.pages.EditPage;
import org.testng.annotations.Test;

public class EditTest extends TestBase {

    @Test(groups = "loginRequired")
    public  void testEditPage() throws InterruptedException{
        EditPage editProfile = new EditPage(driver);

        Thread.sleep(4000);
        editProfile.clickProfile();
        editProfile.clickEdit();
        editProfile.editProfile();
        editProfile.clickChanges();

        Assert.assertEquals(editProfile.getMessage(), "Dashboard");
    }



}

