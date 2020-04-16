import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.SortAlertsPage;

public class SortAlertsTest extends TestBase {

    @Test(groups = "loginRequired")
    public void loginPageTest() throws InterruptedException {
        SortAlertsPage sortAlert = new SortAlertsPage(driver);

        sortAlert.setMyProfile();
        sortAlert.setMyAlerts();
        sortAlert.setDropDownButton();
        sortAlert.setOption();
        sortAlert.setExpand();
        sortAlert.setSort1();
        sortAlert.setSort2();
        sortAlert.setCollapse();

        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[3]/h1")).getText().equals("My Alerts"));

    }
    }
