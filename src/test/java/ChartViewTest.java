import org.junit.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.ChartViewPage;


public class ChartViewTest extends TestBase {

    @Test(groups = "loginRequired")
    public void chartViewPositiveTest() {
        ChartViewPage chartViewPagePositiveTest = new ChartViewPage(driver);
        chartViewPagePositiveTest.clickChartButton();
        Assert.assertNotNull("One chart found", chartViewPagePositiveTest.findCanvas());
        chartViewPagePositiveTest.clickSingleTableButton();
        chartViewPagePositiveTest.clickSingleChartButton();
        Assert.assertNotNull("Chart after changed to table view", chartViewPagePositiveTest.findCanvas());
        chartViewPagePositiveTest.clickChangeTimeButton();
        Assert.assertNotNull("Chart after changed time view", chartViewPagePositiveTest.findCanvas());
    }

}