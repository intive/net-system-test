import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.HistoryViewPage;

public class HistoryViewTest extends TestBase {

    @Test(priority=0, groups = "loginRequired")
    public void historyDisplayedElements() {
        HistoryViewPage histDisplElTest = new HistoryViewPage(driver);
        histDisplElTest.clickHistoryButton();
        Assert.assertTrue(histDisplElTest.getDetailsMessage().contains("Details"), "Details");
        System.out.println("Start to verify number of displayed elements in history view.");
        histDisplElTest.clickDisplayedElements();
        System.out.println("Verify number of displayed elements one by one in history view.");
        histDisplElTest.tenDisplayedElements();
        Assert.assertNotNull(histDisplElTest.tenDisplayElement, "Ten elements");
        histDisplElTest.getHistoryList();
        histDisplElTest.twentyDisplayedElements();
        Assert.assertNotNull(histDisplElTest.twentyDisplayElement, "Twenty elements");
        histDisplElTest.getHistoryList();
        histDisplElTest.fiftyDisplayedElements();
        Assert.assertNotNull(histDisplElTest.fiftyDisplayElement, "Fifty elements");
        histDisplElTest.getHistoryList();
        histDisplElTest.hundredDisplayedElements();
        Assert.assertNotNull(histDisplElTest.hundredDisplayElement, "Hundred elements");
        histDisplElTest.getHistoryList();
    }

    @Test(priority=1)
    public void historyTimeElements() {
        HistoryViewPage histTimeElTest = new HistoryViewPage(driver);
        Assert.assertTrue(histTimeElTest.getDetailsMessage().contains("Details"), "Details");
        histTimeElTest.clickTimeElements();
        System.out.println("Every kline interval checked.");
    }

}