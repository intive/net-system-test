import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.QuantityButtonsDashboard;

public class QuantityButtonsTest extends TestBase {

    QuantityButtonsDashboard qd;

    @Test(groups = "loginRequired", priority = 0)
    public void testTen() throws InterruptedException {

        qd = new QuantityButtonsDashboard(driver);
        qd.getButtonsQuantity();
        qd.clickButton10();
        Thread.sleep(20000);
        qd.setResultTable();
        int resultsTableSize = qd.getResultsTableRowsSize();

        Assert.assertEquals(resultsTableSize, 10, "Invalid table size, expected: 10, got: " + resultsTableSize);
    }
    @Test(groups = "loginRequired",priority = 1)
    public void testTwenty() throws InterruptedException {

        qd = new QuantityButtonsDashboard(driver);
        qd.getButtonsQuantity();
        qd.clickButton20();
        Thread.sleep(20000);
        qd.setResultTable();
        int resultsTableSize = qd.getResultsTableRowsSize();

        Assert.assertEquals(resultsTableSize, 20, "Invalid table size, expected: 10, got: " + resultsTableSize);
    }
    @Test(groups = "loginRequired",priority = 2)
    public void testFifty() throws InterruptedException {

        qd = new QuantityButtonsDashboard(driver);
        qd.getButtonsQuantity();
        qd.clickButton50();
        Thread.sleep(20000);
        qd.setResultTable();
        int resultsTableSize = qd.getResultsTableRowsSize();

        Assert.assertEquals(resultsTableSize, 50, "Invalid table size, expected: 10, got: " + resultsTableSize);
    }
    @Test(groups = "loginRequired",priority = 3)
    public void testHundred() throws InterruptedException {

        qd = new QuantityButtonsDashboard(driver);
        qd.getButtonsQuantity();
        qd.clickButton100();
        Thread.sleep(20000);
        qd.setResultTable();
        int resultsTableSize = qd.getResultsTableRowsSize();

        Assert.assertEquals(resultsTableSize, 100, "Invalid table size, expected: 10, got: " + resultsTableSize);
    }


}


