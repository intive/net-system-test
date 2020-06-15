import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.SubscribePage;


public class NegativeSubscribePageTest extends TestBase {

    @Test(priority = 0, groups = "loginRequired")
    public void negativeSubscribePageTestVolume1() {
        SubscribePage negSubPageValIn = new SubscribePage(driver);
        negSubPageValIn.setSubscribeButton();
        negSubPageValIn.setConditionInput("Crossing");
        negSubPageValIn.setValueType("Volume");
        negSubPageValIn.setValueInput("aaa");
        negSubPageValIn.setConfirmButton();
        Assert.assertEquals(negSubPageValIn.getValidationMessage(), "The Value field must be a number.", "Invalid Value - letters - checked");
    }

    @Test(priority = 1)
    public void negativeSubscribePageTestVolume2() {
        SubscribePage negSubPageVolume = new SubscribePage(driver);
        negSubPageVolume.setConditionInput("Crossing");
        negSubPageVolume.setValueType("Volume");
        negSubPageVolume.setValueInput("0");
        negSubPageVolume.setConfirmButton();
        Assert.assertEquals(negSubPageVolume.getValidationMessage(), "Please enter a number greater than zero.", "Invalid Value - zero - checked");
    }

    @Test(priority = 2)
    public void negativeSubscribePageTestVolume3() {
        SubscribePage negSubPageMaxVolume = new SubscribePage(driver);
        negSubPageMaxVolume.setConditionInput("Crossing");
        negSubPageMaxVolume.setValueType("Volume");
        negSubPageMaxVolume.setValueInput("999999999,999999999");
        negSubPageMaxVolume.setConfirmButton();
        Assert.assertEquals(negSubPageMaxVolume.getValidationMessage(), "Value cannot exceed 999,999,999.999999999.", "Invalid Volume - exceed - checked");
    }

    @Test(priority = 3)
    public void negativeSubscribePageTestVolumeNoMail() {
        SubscribePage negSubPageVolumeNoMail = new SubscribePage(driver);
        negSubPageVolumeNoMail.setConditionInput("Crossing");
        negSubPageVolumeNoMail.setValueType("Volume");
        negSubPageVolumeNoMail.setValueInput("100");
        negSubPageVolumeNoMail.setOnlyOnce();
        negSubPageVolumeNoMail.setSendEmail();
        negSubPageVolumeNoMail.setEmailInput("");
        negSubPageVolumeNoMail.setConfirmButton();
        Assert.assertEquals(negSubPageVolumeNoMail.getValidationMessage(), "Email is required.", "Empty Email input checked");
    }

    @Test(priority = 4)
    public void negativeSubscribePageTestPrice1() {
        SubscribePage negSubPageValIn = new SubscribePage(driver);
        negSubPageValIn.setConditionInput("Crossing");
        negSubPageValIn.setValueType("Price");
        negSubPageValIn.setValueInput("aaa");
        negSubPageValIn.setConfirmButton();
        Assert.assertEquals(negSubPageValIn.getValidationMessage(), "The Value field must be a number.", "Invalid Value - letters - checked");
    }

    @Test(priority = 5)
    public void negativeSubscribePageTestPrice2() {
        SubscribePage negSubPagePrice = new SubscribePage(driver);
        negSubPagePrice.setConditionInput("Crossing");
        negSubPagePrice.setValueType("Price");
        negSubPagePrice.setValueInput("0");
        negSubPagePrice.setConfirmButton();
        Assert.assertEquals(negSubPagePrice.getValidationMessage(), "Please enter a number greater than zero.", "Invalid Value - zero - checked");
    }

    @Test(priority = 6)
    public void negativeSubscribePageTestPrice3() {
        SubscribePage negSubPageMaxPrice = new SubscribePage(driver);
        negSubPageMaxPrice.setConditionInput("Crossing");
        negSubPageMaxPrice.setValueType("Price");
        negSubPageMaxPrice.setValueInput("999999999,999999999");
        negSubPageMaxPrice.setConfirmButton();
        Assert.assertEquals(negSubPageMaxPrice.getValidationMessage(), "Value cannot exceed 999,999,999.999999999.", "Invalid Volume - exceed - checked");
    }

    @Test(priority = 7)
    public void negativeSubscribePageTestPriceNoMail() {
        SubscribePage negSubPagePriceNoMail = new SubscribePage(driver);
        negSubPagePriceNoMail.setValueInput("100");
        negSubPagePriceNoMail.setOnlyOnce();
        negSubPagePriceNoMail.setEmailInput(" ");
        negSubPagePriceNoMail.setConfirmButton();
        Assert.assertEquals(negSubPagePriceNoMail.getValidationMessage(), "Email is required.", "Empty Email input checked");
    }
}