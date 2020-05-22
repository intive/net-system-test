import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.FilterDashboard;

public class FilterTest extends TestBase {

    FilterDashboard fd;

    @Test(groups = "loginRequired",priority = 0)
    public void testCurrency() throws InterruptedException{

        fd = new FilterDashboard(driver);
        fd.searchFilter("GASBTC");
        fd.setPanel();
        fd.clickFilter();
        Assert.assertTrue(fd.checkResultPairValues().contains("GASBTC"),"Contains GASBTC");
    }
    @Test(groups = "loginRequired", priority = 1)
    public void testPair() throws InterruptedException{

        fd = new FilterDashboard(driver);
        fd.searchFilter("USDC");
        fd.setPanel();
        fd.clickFilter();
        Assert.assertTrue(fd.checkResultPairValuesTwo().contains("USDC"),"Contains USDC");
    }
    @Test(groups = "loginRequired")
    public void testIncorrectValue() throws InterruptedException{

        fd = new FilterDashboard(driver);
        fd.searchFilter("%");
        fd.setPanel();
        fd.clickFilter();
        Assert.assertEquals(fd.getValidation(),"Use letters only please");
    }


}


