package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.base.PageBase;


public class ChartViewPage extends PageBase {

    private By symbolButton = By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > a:nth-child(1)");
    private By chartButton = By.cssSelector(".nav > li:nth-child(2) > a:nth-child(1)");
    private By tableButton = By.cssSelector(".rounded-left > a:nth-child(1)");
    private By fiveMinButton = By.cssSelector("div.mr-2:nth-child(1) > button:nth-child(2)");
    private By fifteenMinButton = By.cssSelector("div.mr-2:nth-child(1) > button:nth-child(3)");
    private By oneHourButton = By.cssSelector("div.mr-2:nth-child(1) > button:nth-child(4)");
    private By twoHoursButton = By.cssSelector("button.btn:nth-child(5)");
    private By fourHoursButton = By.cssSelector("button.btn:nth-child(6)");
    private By twelveHoursButton = By.cssSelector("button.btn:nth-child(7)");
    private By oneDayButton = By.cssSelector("button.btn:nth-child(8)");
    private By canvasView = By.tagName("canvas");

    public ChartViewPage(WebDriver driver) { super(driver); }

    public void WebDriver(WebDriver driver) { this.driver = driver; }

    public void clickChartButton() { clickWhenReady(symbolButton); }

    public void clickSingleChartButton() { clickWhenReady(chartButton); }

    public void clickSingleTableButton() { clickWhenReady(tableButton); }

    public Object findCanvas() { return getElementText(canvasView);}

    public void clickChangeTimeButton() {
        clickWhenReady(fiveMinButton);
        clickWhenReady(fifteenMinButton);
        clickWhenReady(oneHourButton);
        clickWhenReady(twoHoursButton);
        clickWhenReady(fourHoursButton);
        clickWhenReady(twelveHoursButton);
        clickWhenReady(oneDayButton);
    }

}