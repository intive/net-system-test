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
        Assert.assertEquals(sortAlert.getSortList(),"Symbol\n" + "Condition\n" + "Value Type\n" + "Value\n" + "Email","No options are available");
        sortAlert.setOption();
        sortAlert.setExpand();
        sortAlert.setSort1();
        Assert.assertEquals(sortAlert.getCrossing(), "Crossing","Crossing option is not visible");
        sortAlert.setSort2();
        Assert.assertEquals(sortAlert.getBetween(), "Between","Between option is not visible");
        sortAlert.setCollapse();
        Assert.assertEquals(sortAlert.getMessage(), "Alerts","Alerts view is not available");
    }
}
