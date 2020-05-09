import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.SubscribePage;

public class NegativeSubscribePageTest extends TestBase {

    @Test(priority = 0, groups = "loginRequired")
    public void negativeSubscribePageTestValue() {
        SubscribePage negSubPageValIn = new SubscribePage(driver);
        negSubPageValIn.setSubscribeButton();
        negSubPageValIn.setConditionInput("Crossing");
        negSubPageValIn.setValueType("Volume");
        negSubPageValIn.setValueInput("aaa");
        negSubPageValIn.setConfirmButton();
        Assert.assertEquals(negSubPageValIn.getValidationMessage(), "The Value field must be a number.", "Invalid Value - letters - checked");
    }

    @Test(priority = 1)
    public void negativeSubscribePageTestPrice() {
        SubscribePage negSubPagePrice = new SubscribePage(driver);
        negSubPagePrice.setConditionInput("Crossing");
        negSubPagePrice.setValueType("Price");
        negSubPagePrice.setValueInput("0");
        negSubPagePrice.setConfirmButton();
        Assert.assertEquals(negSubPagePrice.getValidationMessage(), "Please enter a number greater than zero.", "Invalid Value - zero - checked");
    }

    @Test(priority = 2)
    public void negativeSubscribePageTestVolume() {
        SubscribePage negSubPageVolume = new SubscribePage(driver);
        negSubPageVolume.setConditionInput("Crossing");
        negSubPageVolume.setValueType("Volume");
        negSubPageVolume.setValueInput("0");
        negSubPageVolume.setConfirmButton();
        Assert.assertEquals(negSubPageVolume.getValidationMessage(), "Please enter a number greater than zero.", "Invalid Volume - zero - checked");
    }

    @Test(priority = 3)
    public void negativeSubscribePageTestNoMail() {
        SubscribePage negSubPageNoMail = new SubscribePage(driver);
        negSubPageNoMail.setConditionInput("Crossing");
        negSubPageNoMail.setValueType("Volume");
        negSubPageNoMail.setValueInput("100");
        negSubPageNoMail.setOnlyOnce();
        negSubPageNoMail.setSendEmail();
        negSubPageNoMail.setEmailInput("");
        negSubPageNoMail.setMessageInput("");
        negSubPageNoMail.setConfirmButton();
        Assert.assertEquals(negSubPageNoMail.getValidationMessage(), "Email is required.", "Empty Email input checked");
    }

}