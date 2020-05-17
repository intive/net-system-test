package selenium.pages;
<<<<<<< HEAD
=======

>>>>>>> Branch after changes before demo
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class HistoryViewPage {

<<<<<<< HEAD
    private WebDriver driver;
    private By btcButton = By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > a:nth-child(1)");
    private By detailsBtc = By.cssSelector(".content > h1:nth-child(1)");
=======
    public WebDriver driver;
    public By btcButton = By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > a:nth-child(1)");
    public By detailsBtc = By.cssSelector(".content > h1:nth-child(1)");
>>>>>>> Branch after changes before demo
    public By tenDisplayElement = By.cssSelector("div.btn-toolbar:nth-child(3) > div:nth-child(1) > button:nth-child(2)");
    public By twentyDisplayElement = By.cssSelector("div.btn-toolbar:nth-child(3) > div:nth-child(1) > button:nth-child(3)");
    public By fiftyDisplayElement = By.cssSelector("div.btn-toolbar:nth-child(3) > div:nth-child(1) > button:nth-child(4)");
    public By hundredDisplayElement = By.cssSelector("div.btn-toolbar:nth-child(3) > div:nth-child(1) > button:nth-child(5)");
<<<<<<< HEAD
    private By fiveMinInterval = By.cssSelector("div.btn-toolbar:nth-child(1) > div:nth-child(1) > button:nth-child(2)");
    private By fifteenMinInterval = By.cssSelector("div.btn-toolbar:nth-child(1) > div:nth-child(1) > button:nth-child(3)");
    private By oneHourInterval = By.cssSelector("div.btn-toolbar:nth-child(1) > div:nth-child(1) > button:nth-child(4)");
    private By twoHoursInterval = By.cssSelector("div.btn-toolbar:nth-child(1) > div:nth-child(1) > button:nth-child(5)");
    private By fourHoursInterval = By.cssSelector("button.btn:nth-child(6)");
    private By twelveHoursInterval = By.cssSelector("button.btn:nth-child(7)");
    private By oneDayInterval = By.cssSelector("button.btn:nth-child(8)");
=======
    public By fiveMinInterval = By.cssSelector("div.btn-toolbar:nth-child(1) > div:nth-child(1) > button:nth-child(2)");
    public By fifteenMinInterval = By.cssSelector("div.btn-toolbar:nth-child(1) > div:nth-child(1) > button:nth-child(3)");
    public By oneHourInterval = By.cssSelector("div.btn-toolbar:nth-child(1) > div:nth-child(1) > button:nth-child(4)");
    public By twoHoursInterval = By.cssSelector("div.btn-toolbar:nth-child(1) > div:nth-child(1) > button:nth-child(5)");
    public By fourHoursInterval = By.cssSelector("button.btn:nth-child(6)");
    public By twelveHoursInterval = By.cssSelector("button.btn:nth-child(7)");
    public By oneDayInterval = By.cssSelector("button.btn:nth-child(8)");
>>>>>>> Branch after changes before demo

    public HistoryViewPage(WebDriver driver) { this.driver = driver; }

    public void clickHistoryButton() { driver.findElement(btcButton).click(); }

    public void clickDisplayedElements() {
        driver.findElement(tenDisplayElement).click();
        driver.findElement(twentyDisplayElement).click();
        driver.findElement(fiftyDisplayElement).click();
        driver.findElement(hundredDisplayElement).click();
    }

    public void tenDisplayedElements() {
        driver.findElement(tenDisplayElement).click();
    }
    public void twentyDisplayedElements() {
        driver.findElement(twentyDisplayElement).click();
    }
    public void fiftyDisplayedElements() {
        driver.findElement(fiftyDisplayElement).click();
    }
    public void hundredDisplayedElements() {
        driver.findElement(hundredDisplayElement).click();
    }

    public void clickTimeElements(){
        driver.findElement(fiveMinInterval).click();
        driver.findElement(fifteenMinInterval).click();
        driver.findElement(oneHourInterval).click();
        driver.findElement(twoHoursInterval).click();
        driver.findElement(fourHoursInterval).click();
        driver.findElement(twelveHoursInterval).click();
        driver.findElement(oneDayInterval).click();
    }

    public void getHistoryList(){
<<<<<<< HEAD
        List<WebElement> rows = driver.findElements(By.tagName("tr"));
=======
        List<WebElement> rows = driver.findElements(By.tagName("tr")); rows.size();
>>>>>>> Branch after changes before demo
        System.out.println("Number of checked rows: " + (rows.size()-1));
    }

    public String getDetailsMessage() {
        return driver.findElement(detailsBtc).getText();
<<<<<<< HEAD
    }
=======
        }
>>>>>>> Branch after changes before demo
}