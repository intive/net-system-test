import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.CurrencyButtonsDashboard;

public class CurrencyButtonsTest extends TestBase {

    CurrencyButtonsDashboard cbd;

    @Test(groups = "loginRequired", priority = 0)
    public void testBtc() throws InterruptedException {

        cbd = new CurrencyButtonsDashboard(driver);
        cbd.setPanel();
        cbd.getBtc();
        Thread.sleep(20000);
        cbd.setResultTable();

        Assert.assertTrue(cbd.getResultsTableRowsValueBtc().contains("BTC"),"Contains BTC");
    }

    @Test(groups = "loginRequired", priority = 1)
    public void testBnb() throws InterruptedException {

        cbd = new CurrencyButtonsDashboard(driver);
        cbd.setPanel();
        cbd.getBnb();
        Thread.sleep(20000);
        cbd.setResultTable();

        Assert.assertTrue(cbd.getResultsTableRowsValueBnb().contains("BNB"),"Contains BNB");
    }
    @Test(groups = "loginRequired", priority = 2)
    public void testUsdt() throws InterruptedException {

        cbd = new CurrencyButtonsDashboard(driver);
        cbd.setPanel();
        cbd.getUsdt();
        Thread.sleep(20000);
        cbd.setResultTable();

        Assert.assertTrue(cbd.getResultsTableRowsValueUsdt().contains("USDT"),"Contains USDT");
    }
    @Test(groups = "loginRequired", priority = 3)
    public void testUsdc() throws InterruptedException {

        cbd = new CurrencyButtonsDashboard(driver);
        cbd.setPanel();
        cbd.getUsdc();
        Thread.sleep(20000);
        cbd.setResultTable();

        Assert.assertTrue(cbd.getResultsTableRowsValueUsdc().contains("USDC"),"Contains USDC");
    }
    @Test(groups = "loginRequired", priority = 3)
    public void testEur() throws InterruptedException {

        cbd = new CurrencyButtonsDashboard(driver);
        cbd.setPanel();
        cbd.getEur();
        Thread.sleep(20000);
        cbd.setResultTable();

        Assert.assertTrue(cbd.getResultsTableRowsValueEur().contains("EUR"),"Contains EUR");
    }


}

