import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.DeleteAlertPage;

public class DeleteAlertsTest extends TestBase {

    @Test(groups = "loginRequired")
    public void deleteAlert() throws InterruptedException {
        DeleteAlertPage deleteAlert=new DeleteAlertPage(driver);

       deleteAlert.setMyProfile();
       deleteAlert.setMyAlerts();
       deleteAlert.setDelete();
       Thread.sleep(1000); // bez tego test nie przechodzi
       deleteAlert.setAlert();

        Assert.assertEquals(deleteAlert.getMessage(), "Dashboard");
    }
}
