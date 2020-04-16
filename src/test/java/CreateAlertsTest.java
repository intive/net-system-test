import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.CreateAlertsPage;
public class CreateAlertsTest extends TestBase {

    @Test(groups = "loginRequired")
    public void alertsTest() throws InterruptedException {
        CreateAlertsPage createAlerts = new CreateAlertsPage(driver);

        createAlerts.clickAlert();
        createAlerts.setCondition();
        createAlerts.setSelectCondition();
        createAlerts.setValueType();
        createAlerts.setValue();
        createAlerts.setPause();
        createAlerts.setConfirmButton();

        createAlerts.setEmailAlert();
        createAlerts.setCondition();
        createAlerts.setSelectCondition();
        createAlerts.setValueType2();
        createAlerts.setValue2();
        createAlerts.setPause();
        createAlerts.setSendEmail();
        createAlerts.setPause();
        createAlerts.setEmailValue();
        createAlerts.setMessage();
        createAlerts.setConfirmButton();

    }

}

