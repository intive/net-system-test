package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.base.PageBase;


public class IndicatorsViewPage extends PageBase {

    private By btcButton = By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > a:nth-child(1)");
    private By indicatorsButton = By.cssSelector(".rounded-right > a:nth-child(1)");
    private By rsiButton = By.cssSelector("#\\33 b > div:nth-child(1) > div:nth-child(1) > button:nth-child(2)");
    private By rsiLabel = By.cssSelector("#\\33 b > div:nth-child(1) > div:nth-child(2) > a:nth-child(1)");
    private By smaButton = By.cssSelector("#\\33 b > div:nth-child(1) > div:nth-child(1) > button:nth-child(3)");
    private By smaHighPriceButton = By.cssSelector("#\\33 b > div:nth-child(1) > div:nth-child(2) > button:nth-child(2)");
    private By smaLowPriceButton = By.cssSelector("#\\33 b > div:nth-child(1) > div:nth-child(2) > button:nth-child(3)");
    private By smaOpenPriceButton = By.cssSelector("#\\33 b > div:nth-child(1) > div:nth-child(2) > button:nth-child(4)");
    private By smaClosePriceButton = By.cssSelector("#\\33 b > div:nth-child(1) > div:nth-child(2) > button:nth-child(5)");
    private By twoTimeframe = By.cssSelector("#\\33 b > div:nth-child(1) > div:nth-child(2) > button:nth-child(2)");
    private By threeTimeframe = By.cssSelector("#\\33 b > div:nth-child(1) > div:nth-child(2) > button:nth-child(3)");
    private By fourTimeframe = By.cssSelector("#\\33 b > div:nth-child(1) > div:nth-child(2) > button:nth-child(4)");
    private By fiveTimeframe = By.cssSelector("#\\33 b > div:nth-child(1) > div:nth-child(2) > button:nth-child(5)");
    private By sixTimeframe = By.cssSelector("#\\33 b > div:nth-child(1) > div:nth-child(2) > button:nth-child(6)");
    private By fourteenTimeframe = By.cssSelector("#\\33 b > div:nth-child(1) > div:nth-child(2) > button:nth-child(7)");
    private By twentyTimeframe = By.cssSelector("#\\33 b > div:nth-child(1) > div:nth-child(2) > button:nth-child(8)");
    private By thirtyTimeframe = By.cssSelector("button.btn:nth-child(9)");
    public By rsiChart = By.id("rsi_chart_div");
    public By smaChart = By.id("sma_chart_div");

    public IndicatorsViewPage(WebDriver driver) { super(driver); }

    public void WebDriver(WebDriver driver) { this.driver = driver; }

    public void clickIndicatorsButton() {
        clickWhenReady(btcButton);
        clickWhenReady(indicatorsButton);
    }

    public void checkRsiButton() { clickWhenReady(rsiButton); }

    public void checkSmaButton() { clickWhenReady(smaButton); }

    public void checkSmaKlinePrice() {
        clickWhenReady(smaButton);
        clickWhenReady(smaHighPriceButton);
        clickWhenReady(indicatorsButton);
        clickWhenReady(smaOpenPriceButton);
        clickWhenReady(smaClosePriceButton);
        getElementText(smaChart);
    }

    public void checkRsiTimeframe() {
        clickWhenReady(rsiButton);
        clickWhenReady(twoTimeframe);
        clickWhenReady(threeTimeframe);
        clickWhenReady(fourTimeframe);
        clickWhenReady(fiveTimeframe);
        clickWhenReady(sixTimeframe);
        clickWhenReady(fourteenTimeframe);
        clickWhenReady(twentyTimeframe);
        clickWhenReady(thirtyTimeframe);
        getElementText(rsiChart);
    }

    public String checkRsiText() { return getElementText(rsiLabel); }
}