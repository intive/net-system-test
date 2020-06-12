import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.FilterDashboardPage;

public class FilterTest extends TestBase {
    FilterDashboardPage fd;
    @Test(groups = "loginRequired",priority = 0)
    public void testCurrency() throws InterruptedException{
        fd = new FilterDashboardPage(driver);
        Thread.sleep(20000);
        fd.searchFilter("GASBTC");
        Thread.sleep(30000);
        fd.getDashboard();
        Thread.sleep(30000);
        fd.getPanel();
        Thread.sleep(30000);
        fd.clickButton();
        Thread.sleep(30000);
        fd.clickFilter();
        Thread.sleep(20000);
        Assert.assertTrue(fd.checkResultPairValues().contains("GASBTC"),"Contains USDC");
    }
    @Test(priority = 1)
    public void testPair() throws InterruptedException{
        fd = new FilterDashboardPage(driver);
        Thread.sleep(20000);
        fd.searchFilter("USDC");
        Thread.sleep(20000);
        fd.getPanel();
        Thread.sleep(20000);
        fd.clickFilter();
        Thread.sleep(20000);
        Assert.assertTrue(fd.checkResultPairValuesTwo().contains("USDC"),"Contains USDC");
    }
    @Test(priority = 2)
    public void testIncorrectValue() throws InterruptedException{
        fd = new FilterDashboardPage(driver);
        Thread.sleep(20000);
        fd.searchFilter("%");
        Thread.sleep(20000);
        fd.getPanel();
        Thread.sleep(20000);
        fd.clickFilter();
        Thread.sleep(20000);
        Assert.assertEquals(fd.getValidation(),"Use letters only please");
    }
}


