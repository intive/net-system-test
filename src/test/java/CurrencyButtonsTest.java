import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.CurrencyButtonsDashboardPage;

public class CurrencyButtonsTest extends TestBase {
    CurrencyButtonsDashboardPage cbd;
    @Test(priority = 0, groups = "loginRequired")
    public void testBtc() throws InterruptedException {
        cbd = new CurrencyButtonsDashboardPage(driver);
        Thread.sleep(20000);
        cbd.clickPanel();
        Thread.sleep(20000);
        cbd.clickButtons();
        Thread.sleep(20000);
        cbd.clickBtc();
        Thread.sleep(20000);
        cbd.getResultTable();
        Thread.sleep(20000);
        cbd.getResultsTableRowsValue();
        Thread.sleep(20000);
        Assert.assertEquals("BTC","BTC");
    }
    @Test(priority = 1)
    public void testBnb() throws InterruptedException {
        cbd = new CurrencyButtonsDashboardPage(driver);
        cbd.clickPanel();
        Thread.sleep(20000);
        cbd.clickButtons();
        Thread.sleep(20000);
        cbd.clickBnb();
        Thread.sleep(20000);
        cbd.getResultTable();
        Thread.sleep(20000);
        cbd.getResultsTableRowsValue();
        Thread.sleep(20000);
        Assert.assertEquals("BNB","BNB");
    }
    @Test(priority = 2)
    public void testUsdt() throws InterruptedException {
        cbd = new CurrencyButtonsDashboardPage(driver);
        cbd.clickPanel();
        Thread.sleep(20000);
        cbd.clickButtons();
        Thread.sleep(20000);
        cbd.clickUsdt();
        Thread.sleep(20000);
        cbd.getResultTable();
        Thread.sleep(20000);
        cbd.getResultsTableRowsValue();
        Thread.sleep(20000);
        Assert.assertEquals("USDT","USDT");
    }
    @Test(priority = 3)
    public void testUsdc() throws InterruptedException {
        cbd = new CurrencyButtonsDashboardPage(driver);
        cbd.clickPanel();
        Thread.sleep(20000);
        cbd.clickButtons();
        Thread.sleep(20000);
        cbd.clickUsdc();
        Thread.sleep(20000);
        cbd.getResultTable();
        Thread.sleep(20000);
        cbd.getResultsTableRowsValue();
        Thread.sleep(20000);
        Assert.assertEquals("USDC","USDC");
    }
    @Test(priority = 4)
    public void testEur() throws InterruptedException {
        cbd = new CurrencyButtonsDashboardPage(driver);
        cbd.clickPanel();
        Thread.sleep(20000);
        cbd.clickButtons();
        Thread.sleep(20000);
        cbd.clickEur();
        Thread.sleep(20000);
        cbd.getResultTable();
        Thread.sleep(20000);
        cbd.getResultsTableRowsValue();
        Thread.sleep(20000);
        Assert.assertEquals("EUR","EUR");
    }
}

