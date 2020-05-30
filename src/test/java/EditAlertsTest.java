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
        editAlert.setAlert();
        editAlert.setValueType();
        editAlert.setValue();
        editAlert.setPause();
        editAlert.setConfirm();

        Assert.assertEquals(editAlert.getMessage(), "Alerts");
    }
}

