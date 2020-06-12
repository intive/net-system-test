import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.CreateAlertsPage;

public class CrossingTest extends TestBase {

    @Test(priority = 0,groups = "loginRequired")
    public void crossingUpTest(){
        CreateAlertsPage createAlerts = new CreateAlertsPage(driver);
        createAlerts.clickAlert();
        Assert.assertTrue(createAlerts.getAlertForm().contains("Create an alert"), "You can write an alert");
        createAlerts.setCondition();
        createAlerts.setCrossingUp();
        Assert.assertTrue(createAlerts.getCrossingUp().contains("Crossing Up"), "Crossing Up condition is selected");
        createAlerts.setValueType();
        createAlerts.setValue();
        createAlerts.setPause();
        createAlerts.setOnlyOnce();
        createAlerts.setSendEmail();
        Assert.assertNotNull((createAlerts.getEmail().contains("testPATRON20@gmail.com")), "Email has been set");
        createAlerts.setPause();
        createAlerts.setConfirmButton();
        Assert.assertEquals(createAlerts.getMessage(), "Dashboard");
    }
    @Test(priority = 1)
    public void crossingDownTest(){
        CreateAlertsPage createAlerts = new CreateAlertsPage(driver);
        createAlerts.clickAlert();
        Assert.assertTrue(createAlerts.getAlertForm().contains("Create an alert"), "You can write an alert");
        createAlerts.setCondition();
        createAlerts.setCrossingDown();
        Assert.assertTrue(createAlerts.getCrossingDown().contains("Crossing Down"), "Crossing Down condition is selected");
        createAlerts.setValueType();
        createAlerts.setValue();
        createAlerts.setPause();
        createAlerts.setOnlyOnce();
        createAlerts.setSendEmail();
        Assert.assertNotNull((createAlerts.getEmail().contains("testPATRON20@gmail.com")), "Email has been set");
        createAlerts.setPause();
        createAlerts.setConfirmButton();
        Assert.assertEquals(createAlerts.getMessage(), "Dashboard");
    }
    @Test(priority = 2)
    public void betweenTest(){
        CreateAlertsPage createAlerts = new CreateAlertsPage(driver);
        createAlerts.clickAlert();
        Assert.assertTrue(createAlerts.getAlertForm().contains("Create an alert"), "You can write an alert");
        createAlerts.setCondition();
        createAlerts.setBetween();
        Assert.assertTrue(createAlerts.getBetween().contains("Between"), "Between condition is selected");
        createAlerts.setValueType();
        createAlerts.setLowerValue();
        createAlerts.setUpperValue();
        createAlerts.setPause();
        createAlerts.setOnlyOnce();
        createAlerts.setSendEmail();
        Assert.assertNotNull((createAlerts.getEmail().contains("testPATRON20@gmail.com")), "Email has been set");
        createAlerts.setPause();
        createAlerts.setConfirmButton();
        Assert.assertEquals(createAlerts.getMessage(), "Dashboard");
    }
}
