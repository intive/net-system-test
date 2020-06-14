import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.DeleteAlertPage;

public class DeleteAlertsTest extends TestBase {

    @Test(groups = "loginRequired")
    public void deleteAlert(){
        DeleteAlertPage deleteAlert = new DeleteAlertPage(driver);
        deleteAlert.setMyProfile();
        deleteAlert.setMyAlerts();
        deleteAlert.setDelete();
        Assert.assertEquals(deleteAlert.getMonit(), "Are you sure want to delete this alert?","Deleting alert is impossible");
        deleteAlert.setAlert();
        deleteAlert.setRefresh();
        deleteAlert.setMyAlerts();
    }
}
