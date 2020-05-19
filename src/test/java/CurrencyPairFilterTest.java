import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.FilterDashboard;

public class CurrencyPairFilterTest extends TestBase {

    FilterDashboard fd;

    @Test(groups = "loginRequired")
    public void testFilterCorrectCurrencyPairs() throws InterruptedException{

        fd = new FilterDashboard(driver);
        fd.searchFilter("USDC");
        fd.setPanel();
        fd.clickFilter();
        Assert.assertTrue(fd.checkResultPairValuesTwo().contains("USDC"),"Contains USDC");
    }
}
