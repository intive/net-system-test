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
        Assert.assertNotNull(editAlert.getAlertList(),"There are not alert available, alerts list is empty");
        editAlert.setAlert();
        Assert.assertTrue(editAlert.getEditAlerts().contains("Update an alert"),"Form for update an alert is not available");
        editAlert.setValueType();
        editAlert.setValue();
        editAlert.setPause();
        editAlert.setConfirm();
        editAlert.setRefresh();
        editAlert.setMyAlerts();
        editAlert.setAlertExpand();
        Assert.assertEquals(editAlert.getValueCheck(), "120,000000000","Set value is not as expected");
    }
}

