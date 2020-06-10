import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.SubscribePage;


public class SubscribePageTest extends TestBase {

    @Test(priority = 0, groups = "loginRequired")
    public void subscribePageTestPositiveVolume() {
        SubscribePage posSubPageVolume = new SubscribePage(driver);
        posSubPageVolume.setSubscribeButton();
        Assert.assertTrue(posSubPageVolume.isSubscribePageOpen().contains("Create an alert"), "Subscribe page is open");
        posSubPageVolume.setConditionInput("Crossing");
        posSubPageVolume.setValueType("Volume");
        posSubPageVolume.setValueInput("0,000001");
        posSubPageVolume.setOnlyOnce();
        posSubPageVolume.setSendEmail();
        posSubPageVolume.setConfirmButton();
        Assert.assertEquals(posSubPageVolume.getDashboardMessage(), "Dashboard", "Volume in Subscribe checked");
    }

    @Test(priority = 1)
    public void subscribePageTestPositivePrice() {
        SubscribePage posSubPagePrice = new SubscribePage(driver);
        posSubPagePrice.setSubscribeButton();
        Assert.assertTrue(posSubPagePrice.isSubscribePageOpen().contains("Create"), "Subscribe page is open");
        posSubPagePrice.setConditionInput("Crossing");
        posSubPagePrice.setValueType("Volume");
        posSubPagePrice.setValueInput("999999999,99999999");
        posSubPagePrice.setSendEmail();
        posSubPagePrice.setConfirmButton();
        Assert.assertEquals(posSubPagePrice.getDashboardMessage(), "Dashboard", "Price in Subscribe checked");
    }

    @Test(priority = 2)
    public void subscribePageTestMailMessage() {
        SubscribePage posSubPageMailMessage = new SubscribePage(driver);
        posSubPageMailMessage.setSubscribeButton();
        Assert.assertTrue(posSubPageMailMessage.isSubscribePageOpen().contains("Create"), "Subscribe page is open");
        posSubPageMailMessage.setConditionInput("Crossing");
        posSubPageMailMessage.setValueType("Price");
        posSubPageMailMessage.setValueInput("999999999,99999999");
        posSubPageMailMessage.setOnlyOnce();
        posSubPageMailMessage.setSendEmail();
        posSubPageMailMessage.setConfirmButton();
        Assert.assertEquals(posSubPageMailMessage.getDashboardMessage(), "Dashboard", "Mail Message in Subscribe checked");
    }

    @Test(priority = 3)
    public void subscribePageTestCancel() {
        SubscribePage posSubPageCancel = new SubscribePage(driver);
        posSubPageCancel.setSubscribeButton();
        Assert.assertTrue(posSubPageCancel.isSubscribePageOpen().contains("Create"), "Subscribe page is open");
        posSubPageCancel.setConditionInput("Crossing");
        posSubPageCancel.setValueType("Price");
        posSubPageCancel.setValueInput("0,000001");
        posSubPageCancel.setSendEmail();
        posSubPageCancel.setCancelButton();
        Assert.assertEquals(posSubPageCancel.getDashboardMessage(), "Dashboard", "Cancel Button checked");
    }

    @Test(priority = 4)
    public void subscribePageCheckAlerts() {
        SubscribePage posSubCheckAlerts = new SubscribePage(driver);
        posSubCheckAlerts.goToMyAlerts();
        Assert.assertNotNull(posSubCheckAlerts.alertsButton, "MyProfile Alerts Page");
        posSubCheckAlerts.checkAlert();
        try {
            Assert.assertEquals(posSubCheckAlerts.getConfirmOnlyOnce(), "Yes", "Changed to Only Once option");
        } catch (Exception a) {
            Assert.fail("Back to Dashboard Page");
        }
    }
}