import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.EditAlertPage;

public class EditAlertsTest extends TestBase {

    @Test(groups = "loginRequired")
    public void editAlertsTest(){
        EditAlertPage editAlert=new EditAlertPage(driver);
        editAlert.setMyProfile();
        editAlert.setMyAlerts();
        Assert.assertNotNull(editAlert.getAlertList());
        editAlert.setAlert();
        Assert.assertTrue(editAlert.getEditAlerts().contains("Update an alert"));
        editAlert.setValueType();
        editAlert.setValue();
        editAlert.setPause();
        editAlert.setConfirm();
        editAlert.setRefresh();
        editAlert.setMyAlerts();
        editAlert.setAlertExpand();
        Assert.assertEquals(editAlert.getValueCheck(), "100,000000000");
    }
}

