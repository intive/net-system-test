import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.SortAlertsPage;

public class SortAlertsTest extends TestBase {

    @Test(groups = "loginRequired")
    public void loginPageTest(){
        SortAlertsPage sortAlert = new SortAlertsPage(driver);

        sortAlert.setMyProfile();
        sortAlert.setMyAlerts();
        sortAlert.setDropDownButton();
        sortAlert.setOption();
        sortAlert.setExpand();
        sortAlert.setSort1();
        sortAlert.setSort2();
        sortAlert.setCollapse();

        Assert.assertEquals(sortAlert.getMessage(), "Alerts");
    }
}
