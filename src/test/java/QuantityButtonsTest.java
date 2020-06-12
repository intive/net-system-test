import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.QuantityButtonsDashboardPage;
public class QuantityButtonsTest extends TestBase {
    QuantityButtonsDashboardPage qd;
    @Test(priority = 0,groups = "loginRequired")
    public void testTen() throws InterruptedException {
        qd = new QuantityButtonsDashboardPage(driver);
        Thread.sleep(20000);
        qd.clickButtonsPanel();
        Thread.sleep(20000);
        qd.clickButtons();
        Thread.sleep(20000);
        qd.clickButtonsQuantity();
        Thread.sleep(20000);
        qd.clickButton10();
        Thread.sleep(20000);
        qd.setResultTable();
        Thread.sleep(20000);
        int resultsTableSize = qd.getResultsTableRowsSize();
        Thread.sleep(20000);
        Assert.assertEquals(resultsTableSize, 10, "Invalid table size, expected: 10, got: " + resultsTableSize);
    }
    @Test(priority = 1)
    public void testTwenty() throws InterruptedException {
        qd = new QuantityButtonsDashboardPage(driver);
        Thread.sleep(20000);
        qd.clickButtonsPanel();
        Thread.sleep(20000);
        qd.clickButtons();
        Thread.sleep(20000);
        qd.clickButtonsQuantity();
        Thread.sleep(20000);
        qd.clickButton20();
        Thread.sleep(20000);
        qd.setResultTable();
        Thread.sleep(20000);
        int resultsTableSize = qd.getResultsTableRowsSize();
        Thread.sleep(20000);
        Assert.assertEquals(resultsTableSize, 20, "Invalid table size, expected: 20, got: " + resultsTableSize);
    }
    @Test(priority = 2)
    public void testFifty() throws InterruptedException {
        qd = new QuantityButtonsDashboardPage(driver);
        Thread.sleep(20000);
        qd.clickButtonsPanel();
        Thread.sleep(20000);
        qd.clickButtons();
        Thread.sleep(20000);
        qd.clickButtonsQuantity();
        Thread.sleep(20000);
        qd.clickButton50();
        Thread.sleep(20000);
        qd.setResultTable();
        Thread.sleep(20000);
        int resultsTableSize = qd.getResultsTableRowsSize();
        Thread.sleep(20000);
        Assert.assertEquals(resultsTableSize, 50, "Invalid table size, expected: 50, got: " + resultsTableSize);
    }
    @Test(priority = 3)
    public void testHundred() throws InterruptedException {
        qd = new QuantityButtonsDashboardPage(driver);
        Thread.sleep(20000);
        qd.clickButtonsPanel();
        Thread.sleep(20000);
        qd.clickButtons();
        Thread.sleep(20000);
        qd.clickButtonsQuantity();
        Thread.sleep(20000);
        qd.clickButton100();
        Thread.sleep(20000);
        qd.setResultTable();
        Thread.sleep(20000);
        int resultsTableSize = qd.getResultsTableRowsSize();
        Thread.sleep(20000);
        Assert.assertEquals(resultsTableSize, 100, "Invalid table size, expected: 100, got: " + resultsTableSize);
    }
}


