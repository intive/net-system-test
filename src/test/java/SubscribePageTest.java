import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.SubscribePage;

public class SubscribePageTest extends TestBase {

    @Test(priority = 0, groups = "loginRequired")
    public void subscribePageTestPositiveVolume () {
        SubscribePage posSubPageVolume = new SubscribePage(driver);
        posSubPageVolume.setSubscribeButton();
        Assert.assertTrue(posSubPageVolume.isSubscribePageOpen().contains("Create an alert"), "Subscribe page is open");
        posSubPageVolume.setConditionInput("Crossing");
        posSubPageVolume.setValueType("Volume");
        posSubPageVolume.setValueInput("0,01");
        posSubPageVolume.setOnlyOnce();
        posSubPageVolume.setSendEmail();
        posSubPageVolume.setEmailInput("patronagetest01@gmail.com");
        posSubPageVolume.setMessageInput("Test message - SubscribePageTestPositiveVolume");
        posSubPageVolume.setConfirmButton();
        Assert.assertEquals(posSubPageVolume.getDashboardMessage(), "Dashboard", "Volume in Subscribe checked");
    }

    @Test(priority = 1)
    public void subscribePageTestPositivePrice () {
        SubscribePage posSubPagePrice = new SubscribePage(driver);
        posSubPagePrice.setSubscribeButton();
        Assert.assertTrue(posSubPagePrice.isSubscribePageOpen().contains("Create"), "Subscribe page is open");
        posSubPagePrice.setConditionInput("Crossing");
        posSubPagePrice.setValueType("Price");
        posSubPagePrice.setValueInput("999999999");
        posSubPagePrice.setOnlyOnce();
        posSubPagePrice.setSendEmail();
        posSubPagePrice.setEmailInput("patronagetest01@gmail.com");
        posSubPagePrice.setMessageInput("Test message - subscribePageTestPositivePrice");
        posSubPagePrice.setConfirmButton();
        Assert.assertEquals(posSubPagePrice.getDashboardMessage(), "Dashboard", "Price in Subscribe checked");
    }

    @Test(priority = 2)
    public void subscribePageTestMailMessage () {
        SubscribePage posSubPageMailMessage = new SubscribePage(driver);
        posSubPageMailMessage.setSubscribeButton();
        Assert.assertTrue(posSubPageMailMessage.isSubscribePageOpen().contains("Create"), "Subscribe page is open");
        posSubPageMailMessage.setConditionInput("Crossing");
        posSubPageMailMessage.setValueType("Volume");
        posSubPageMailMessage.setValueInput("0,1");
        posSubPageMailMessage.setOnlyOnce();
        posSubPageMailMessage.setSendEmail();
        posSubPageMailMessage.setEmailInput("patronagetest01@gmail.com");
        posSubPageMailMessage.setMessageInput("Test message - subscribePageTestMailMessage");
        posSubPageMailMessage.setConfirmButton();
        Assert.assertEquals(posSubPageMailMessage.getDashboardMessage(), "Dashboard", "Mail Message in Subscribe checked");
    }

    @Test(priority = 3)
    public void subscribePageTestCancel () {
        SubscribePage posSubPageCancel = new SubscribePage(driver);
        posSubPageCancel.setSubscribeButton();
        Assert.assertTrue(posSubPageCancel.isSubscribePageOpen().contains("Create"), "Subscribe page is open");
        posSubPageCancel.setConditionInput("Crossing");
        posSubPageCancel.setValueType("Volume");
        posSubPageCancel.setValueInput("0,1");
        posSubPageCancel.setOnlyOnce();
        posSubPageCancel.setSendEmail();
        posSubPageCancel.setEmailInput("patronagetest01@gmail.com");
        posSubPageCancel.setMessageInput("Test message - subscribePageTestCancel");
        posSubPageCancel.setCancelButton();
        Assert.assertEquals(posSubPageCancel.getDashboardMessage(), "Dashboard", "Cancel Button checked");
    }

    @Test(priority = 4)
    public void subscribePageCheckAlerts () {
        SubscribePage posSubCheckAlerts = new SubscribePage(driver);
        posSubCheckAlerts.goToMyAlerts();
        Assert.assertNotNull(posSubCheckAlerts.alertsButton, "MyProfile Alerts Page");
    }

}