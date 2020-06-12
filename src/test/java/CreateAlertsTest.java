import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.CreateAlertsPage;

public class CreateAlertsTest extends TestBase {

    @Test(priority = 0,groups = "loginRequired")
    public void alertsTest(){
        CreateAlertsPage createAlerts = new CreateAlertsPage(driver);
        createAlerts.clickAlert();
        Assert.assertTrue(createAlerts.getAlertForm().contains("Create an alert"), "You can write an alert");
        createAlerts.setCondition();
        createAlerts.setSelectCondition();
        createAlerts.setValueType();
        createAlerts.setValue();
        createAlerts.setPause();
        createAlerts.setConfirmButton();
        Assert.assertEquals(createAlerts.getMessage(), "Dashboard");
    }
    @Test(priority = 1)
        public void alertsEmailTest(){
        CreateAlertsPage createAlerts = new CreateAlertsPage(driver);
        createAlerts.setEmailAlert();
        Assert.assertTrue(createAlerts.getAlertForm().contains("Create an alert"), "You can write an alert");
        createAlerts.setCondition();
        createAlerts.setSelectCondition();
        createAlerts.setValueType2();
        createAlerts.setValue2();
        createAlerts.setPause();
        createAlerts.setOnlyOnce();
        createAlerts.setSendEmail();
        createAlerts.setPause();
        Assert.assertNotNull((createAlerts.getEmail().contains("testPATRON20@gmail.com")), "Email has been set");
        createAlerts.setConfirmButton();
        Assert.assertEquals(createAlerts.getMessage(), "Dashboard");
    }
}

