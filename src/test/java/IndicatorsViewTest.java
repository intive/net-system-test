import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.IndicatorsViewPage;


public class IndicatorsViewTest extends TestBase {

    @Test(priority=0, groups = "loginRequired")
    public void indicatorsPositiveTest() {

        IndicatorsViewPage indicPositiveTest = new IndicatorsViewPage(driver);
        indicPositiveTest.clickIndicatorsButton();
        Assert.assertNotNull(indicPositiveTest.rsiChart, "RSI is default indicator");
        indicPositiveTest.checkSmaButton();
        Assert.assertNotNull(indicPositiveTest.smaChart, "SMA Chart view");
        indicPositiveTest.checkRsiButton();
        Assert.assertEquals(indicPositiveTest.checkRsiText(), "RSI timeframe");
        indicPositiveTest.checkSmaKlinePrice();
        Assert.assertNotNull(indicPositiveTest.smaChart, "SMA chart");
        indicPositiveTest.checkRsiTimeframe();
        Assert.assertNotNull(indicPositiveTest.rsiChart, "RSI chart");
    }

    @Test(priority = 1)
    public void indicatorsScrollView() {
        IndicatorsViewPage indicatorsScrollView = new IndicatorsViewPage(driver);
        indicatorsScrollView.checkRsiButton();
        WebElement element = driver.findElement(indicatorsScrollView.rsiChart);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
        Assert.assertNotNull(indicatorsScrollView.rsiChart, "Changed view in RSI chart");
    }
}