package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.base.PageBase;
import java.util.List;


public class HistoryViewPage extends PageBase {

    private By btcButton = By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > a:nth-child(1)");
    private By detailsMessageBtc = By.cssSelector(".content > h1:nth-child(1)");
    private By tableView = By.cssSelector(".rounded-left > a:nth-child(1)");
    public By tenDisplayElement = By.cssSelector("button.btn-primary:nth-child(1)");
    public By twentyDisplayElement = By.cssSelector(".d-inline-block > div:nth-child(1) > button:nth-child(2)");
    public By fiftyDisplayElement = By.cssSelector(".d-inline-block > div:nth-child(1) > button:nth-child(3)");
    public By hundredDisplayElement = By.cssSelector(".d-inline-block > div:nth-child(1) > button:nth-child(4)");
    private By fiveMinInterval = By.cssSelector("div.mr-2:nth-child(1) > button:nth-child(2)");
    private By fifteenMinInterval = By.cssSelector("div.mr-2:nth-child(1) > button:nth-child(3)");
    private By oneHourInterval = By.cssSelector("div.mr-2:nth-child(1) > button:nth-child(4)");
    private By twoHoursInterval = By.cssSelector("button.btn:nth-child(5)");
    private By fourHoursInterval = By.cssSelector("button.btn:nth-child(6)");
    private By twelveHoursInterval = By.cssSelector("button.btn:nth-child(7)");
    private By oneDayInterval = By.cssSelector("button.btn:nth-child(8)");

    public HistoryViewPage(WebDriver driver) { super(driver); }

    public void WebDriver(WebDriver driver) { this.driver = driver; }

    public void clickHistoryButton() {
        clickWhenReady(btcButton);
        clickWhenReady(tableView);
    }

    public void clickDisplayedElements() {
        clickWhenReady(tenDisplayElement);
        clickWhenReady(twentyDisplayElement);
        clickWhenReady(fiftyDisplayElement);
        clickWhenReady(hundredDisplayElement);
    }

    public void tenDisplayedElements() {
        clickWhenReady(tenDisplayElement);
    }
    public void twentyDisplayedElements() {
        clickWhenReady(twentyDisplayElement);
    }
    public void fiftyDisplayedElements() {
        clickWhenReady(fiftyDisplayElement);
    }
    public void hundredDisplayedElements() {
        clickWhenReady(hundredDisplayElement);
    }

    public void clickTimeElements() {
        clickWhenReady(fiveMinInterval);
        clickWhenReady(fifteenMinInterval);
        clickWhenReady(oneHourInterval);
        clickWhenReady(twoHoursInterval);
        clickWhenReady(fourHoursInterval);
        clickWhenReady(twelveHoursInterval);
        clickWhenReady(oneDayInterval);
    }

    public void getHistoryList() {
        getElementText(By.tagName("tr"));
        List<WebElement> rows = driver.findElements(By.tagName("tr"));
        System.out.println("Number of checked rows: " + (rows.size()-1));
    }

    public String getDetailsMessage() { return getElementText(detailsMessageBtc); }
}