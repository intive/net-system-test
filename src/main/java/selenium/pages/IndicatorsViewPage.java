package selenium.pages;
<<<<<<< HEAD
=======

>>>>>>> Branch after changes before demo
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndicatorsViewPage {

<<<<<<< HEAD
    private WebDriver driver;
    private By btcButton = By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > a:nth-child(1)");
    private By indicatorsButton = By.cssSelector("div.btn-group:nth-child(2) > button:nth-child(4)");
    private By rsiButton = By.cssSelector("div.btn-toolbar:nth-child(6) > div:nth-child(1) > button:nth-child(2)");
    private By rsiLabel = By.cssSelector("div.btn-toolbar:nth-child(6) > div:nth-child(2) > a:nth-child(1)");
    private By smaButton = By.cssSelector("div.btn-toolbar:nth-child(6) > div:nth-child(1) > button:nth-child(3)");
    private By smaHighPriceButton = By.cssSelector("div.btn-toolbar:nth-child(6) > div:nth-child(2) > button:nth-child(2)");
    private By smaLowPriceButton = By.cssSelector("div.btn-toolbar:nth-child(6) > div:nth-child(2) > button:nth-child(3)");
    private By smaOpenPriceButton = By.cssSelector("div.btn-toolbar:nth-child(6) > div:nth-child(2) > button:nth-child(4)");
    private By smaClosePriceButton = By.cssSelector("div.btn-toolbar:nth-child(6) > div:nth-child(2) > button:nth-child(5)");
    private By twoTimeframe = By.cssSelector("div.btn-toolbar:nth-child(6) > div:nth-child(2) > button:nth-child(2)");
    private By threeTimeframe = By.cssSelector("div.btn-toolbar:nth-child(6) > div:nth-child(2) > button:nth-child(3)");
    private By fourTimeframe = By.cssSelector("div.btn-toolbar:nth-child(6) > div:nth-child(2) > button:nth-child(4)");
    private By fiveTimeframe = By.cssSelector("div.btn-toolbar:nth-child(6) > div:nth-child(2) > button:nth-child(5)");
    private By sixTimeframe = By.cssSelector("div.btn-toolbar:nth-child(6) > div:nth-child(2) > button:nth-child(6)");
    private By fourteenTimeframe = By.cssSelector("div.btn-toolbar:nth-child(6) > div:nth-child(2) > button:nth-child(7)");
    private By twentyTimeframe = By.cssSelector("div.btn-toolbar:nth-child(6) > div:nth-child(2) > button:nth-child(8)");
    private By thirtyTimeframe = By.cssSelector("button.btn:nth-child(9)");
    public By rsiChart = By.id("rsi_chart_div");
    public By smaChart = By.id("sma_chart_div");
=======
    public WebDriver driver;
    public By btcButton = By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > a:nth-child(1)");
    public By indicatorsButton = By.cssSelector("div.btn-group:nth-child(2) > button:nth-child(4)");
    public By rsiButton = By.cssSelector("div.btn-toolbar:nth-child(6) > div:nth-child(1) > button:nth-child(2)");
    public By rsiLabel = By.cssSelector("div.btn-toolbar:nth-child(6) > div:nth-child(2) > a:nth-child(1)");
    public By smaButton = By.cssSelector("div.btn-toolbar:nth-child(6) > div:nth-child(1) > button:nth-child(3)");
    public By smaHighPriceButton = By.cssSelector("div.btn-toolbar:nth-child(6) > div:nth-child(2) > button:nth-child(2)");
    public By smaLowPriceButton = By.cssSelector("div.btn-toolbar:nth-child(6) > div:nth-child(2) > button:nth-child(3)");
    public By smaOpenPriceButton = By.cssSelector("div.btn-toolbar:nth-child(6) > div:nth-child(2) > button:nth-child(4)");
    public By smaClosePriceButton = By.cssSelector("div.btn-toolbar:nth-child(6) > div:nth-child(2) > button:nth-child(5)");
    public By twoTimeframe = By.cssSelector("div.btn-toolbar:nth-child(6) > div:nth-child(2) > button:nth-child(2)");
    public By threeTimeframe = By.cssSelector("div.btn-toolbar:nth-child(6) > div:nth-child(2) > button:nth-child(3)");
    public By fourTimeframe = By.cssSelector("div.btn-toolbar:nth-child(6) > div:nth-child(2) > button:nth-child(4)");
    public By fiveTimeframe = By.cssSelector("div.btn-toolbar:nth-child(6) > div:nth-child(2) > button:nth-child(5)");
    public By sixTimeframe = By.cssSelector("div.btn-toolbar:nth-child(6) > div:nth-child(2) > button:nth-child(6)");
    public By fourteenTimeframe = By.cssSelector("div.btn-toolbar:nth-child(6) > div:nth-child(2) > button:nth-child(7)");
    public By twentyTimeframe = By.cssSelector("div.btn-toolbar:nth-child(6) > div:nth-child(2) > button:nth-child(8)");
    public By thirtyTimeframe = By.cssSelector("button.btn:nth-child(9)");
    public static By rsiChart = By.id("rsi_chart_div");
    public static By smaChart = By.id("sma_chart_div");
>>>>>>> Branch after changes before demo

    public IndicatorsViewPage(WebDriver driver) { this.driver = driver; }

    public void clickIndicatorsButton() {
        driver.findElement(btcButton).click();
        driver.findElement(indicatorsButton).click();
    }

    public void checkRsiButton(){
        driver.findElement(rsiButton).click();
    }

    public void checkSmaButton(){
        driver.findElement(smaButton).click();
    }

    public void checkSmaKlinePrice(String text) {
        driver.findElement(smaButton).click();
        driver.findElement(smaHighPriceButton).click();
        driver.findElement(smaLowPriceButton).click();
        driver.findElement(smaOpenPriceButton).click();
        driver.findElement(smaClosePriceButton).click();
        driver.findElement(smaChart).getAttribute(text);
    }

    public void checkRsiTimeframe(String text) {
        driver.findElement(rsiButton).click();
        driver.findElement(twoTimeframe).click();
        driver.findElement(threeTimeframe).click();
        driver.findElement(fourTimeframe).click();
        driver.findElement(fiveTimeframe).click();
        driver.findElement(sixTimeframe).click();
        driver.findElement(fourteenTimeframe).click();
        driver.findElement(twentyTimeframe).click();
        driver.findElement(thirtyTimeframe).click();
        driver.findElement(rsiChart).getAttribute(text);
    }

    public String checkRsiText() {
        return driver.findElement(rsiLabel).getText();
    }

<<<<<<< HEAD
}
=======
}
>>>>>>> Branch after changes before demo
