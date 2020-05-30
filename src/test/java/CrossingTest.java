import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.CreateAlertsPage;

public class CrossingTest extends TestBase {

    @Test(groups = "loginRequired")
    public void crossingTest() {
        CreateAlertsPage createAlerts = new CreateAlertsPage(driver);

        createAlerts.clickAlert();
        createAlerts.setCondition();
        createAlerts.setCrossingUp();
        createAlerts.setValueType();
        createAlerts.setValue();
        createAlerts.setPause();
        createAlerts.setOnlyOnce();
        createAlerts.setSendEmail();
        createAlerts.setPause();
        createAlerts.setEmailValue();
        createAlerts.setPause();
        createAlerts.setConfirmButton();

        createAlerts.clickAlert();
        createAlerts.setCondition();
        createAlerts.setCrossingDown();
        createAlerts.setValueType();
        createAlerts.setValue();
        createAlerts.setPause();
        createAlerts.setOnlyOnce();
        createAlerts.setSendEmail();
        createAlerts.setPause();
        createAlerts.setEmailValue();
        createAlerts.setPause();
        createAlerts.setConfirmButton();

        createAlerts.clickAlert();
        createAlerts.setCondition();
        createAlerts.setBetween();
        createAlerts.setValueType();
        createAlerts.setLowerValue();
        createAlerts.setUpperValue();
        createAlerts.setPause();
        createAlerts.setOnlyOnce();
        createAlerts.setSendEmail();
        createAlerts.setPause();
        createAlerts.setEmailValue();
        createAlerts.setPause();
        createAlerts.setBetweenButton();

        Assert.assertEquals(createAlerts.getMessage(), "Dashboard");
    }}
