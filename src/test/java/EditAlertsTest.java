import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.EditAlertPage;


public class EditAlertsTest extends TestBase {

    @Test(groups = "loginRequired")

    public void editAlertsTest() throws InterruptedException {
        EditAlertPage editAlert=new EditAlertPage(driver);

        editAlert.setMyProfile();
        editAlert.setMyAlerts();
        editAlert.setAlert();
        editAlert.setValueType();
        editAlert.setValue();
        editAlert.setPause();
        editAlert.setConfirm();

        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[3]/h1")).getText().equals("My Alerts"));
    }
}

