import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.QuantityDashboard;

public class QuantityTwentyTest extends TestBase {

    QuantityDashboard qd;

    @Test(groups = "loginRequired")
    public void testTwenty() throws InterruptedException {

        qd = new QuantityDashboard(driver);
        qd.getButtonsQuantity();
        qd.clickButton20();
        Thread.sleep(20000);
        qd.setResultTable();
        int resultsTableSize = qd.getResultsTableRowsSize();

        Assert.assertEquals(resultsTableSize, 20, "Invalid table size, expected: 10, got: " + resultsTableSize);
    }
}

