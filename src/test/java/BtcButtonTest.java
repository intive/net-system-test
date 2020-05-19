import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.CurrencyButtonDashboard;

public class BtcButtonTest extends TestBase {

    CurrencyButtonDashboard cbd;

    @Test(groups = "loginRequired")
    public void testTable() throws InterruptedException {

        cbd = new CurrencyButtonDashboard(driver);
        cbd.setPanel();
        cbd.getBtc();

        Thread.sleep(20000);
        cbd.setResultTable();
        cbd.getResultsTableRowsValue();
        Assert.assertTrue(cbd.getResultsTableRowsValue().contains("BTC"),"Contains BTC");
    }
}

