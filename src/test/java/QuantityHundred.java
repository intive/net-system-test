import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.QuantityDashboard;

public class QuantityHundred extends TestBase {

    QuantityDashboard qd;

    @Test(groups = "loginRequired")
    public void testHundred() throws InterruptedException {

        qd = new QuantityDashboard(driver);
        qd.getButtonsQuantity();
        qd.clickButton100();
        Thread.sleep(20000);
        qd.setResultTable();
        int resultsTableSize = qd.getResultsTableRowsSize();

        Assert.assertEquals(resultsTableSize, 100, "Invalid table size, expected: 10, got: " + resultsTableSize);
    }
}
