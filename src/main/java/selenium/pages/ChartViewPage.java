package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChartViewPage {

    private WebDriver driver;
    private By symbolButton = By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > a:nth-child(1)");
    private By chartButton = By.cssSelector("div.btn-group:nth-child(2) > button:nth-child(3)");
    private By tableButton = By.cssSelector("div.btn-group:nth-child(2) > button:nth-child(2)");
    private By fiveMinButton = By.cssSelector("div.btn-toolbar:nth-child(3) > div:nth-child(1) > button:nth-child(2)");
    private By fifteenMinButton = By.cssSelector("div.btn-toolbar:nth-child(3) > div:nth-child(1) > button:nth-child(3)");
    private By oneHourButton = By.cssSelector("div.btn-toolbar:nth-child(3) > div:nth-child(1) > button:nth-child(4)");
    private By twoHoursButton = By.cssSelector("div.btn-toolbar:nth-child(3) > div:nth-child(1) > button:nth-child(5)");
    private By fourHoursButton = By.cssSelector("button.btn:nth-child(6)");
    private By twelveHoursButton = By.cssSelector("button.btn:nth-child(7)");
    private By oneDayButton = By.cssSelector("button.btn:nth-child(8)");
    private By canvasView = By.tagName("canvas");

    public ChartViewPage(WebDriver driver) { this.driver = driver; }

    public void clickChartButton() {
        driver.findElement(symbolButton).click();
        driver.findElement(chartButton).click();
    }

    public void clickSingleChartButton() { driver.findElement(chartButton).click(); }

    public void clickSingleTableButton() {  driver.findElement(tableButton).click(); }

    public Object findCanvas() { return driver.findElement(canvasView); }

    public void clickChangeTimeButton() {
        driver.findElement(fiveMinButton).click();
        driver.findElement(fifteenMinButton).click();
        driver.findElement(oneHourButton).click();
        driver.findElement(twoHoursButton).click();
        driver.findElement(fourHoursButton).click();
        driver.findElement(twelveHoursButton).click();
        driver.findElement(oneDayButton).click();
    }

}