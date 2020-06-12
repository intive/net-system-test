package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.base.TestCommons;

import java.util.List;

public class CurrencyButtonsDashboardPage extends TestCommons {
    private WebDriver driver;
    private By panel = By.cssSelector("body > app > div.container > div > div > form");
    private By buttons = By.cssSelector("body > app > div.container > div > div > form > div > div");
    private By btc = By.cssSelector("body > app > div.container > div > div > form > div > div > button:nth-child(1):not([style=\"pointer-events: none;\"])");
    private By bnb = By.cssSelector("body > app > div.container > div > div > form > div > div > button:nth-child(2):not([style=\"pointer-events: none;\"])");
    private By usdt = By.cssSelector("body > app > div.container > div > div > form > div > div > button:nth-child(3):not([style=\"pointer-events: none;\"])");
    private By usdc = By.cssSelector("body > app > div.container > div > div > form > div > div > button:nth-child(4):not([style=\"pointer-events: none;\"])");
    private By eur = By.cssSelector("body > app > div.container > div > div > form > div > div > button:nth-child(5):not([style=\"pointer-events: none;\"])");
    private By all = By.cssSelector("body > app > div.container > div > div > form > div > div > button:nth-child(6):not([style=\"pointer-events: none;\"])");
    private By table = By.cssSelector("body > app > div.container > div > div > table");
    private By thead = By.cssSelector("body > app > div.container > div > div > table > thead");
    private By row = By.cssSelector("body > app > div.container > div > div > table > tbody > tr:nth-child(1)");
    private By value = By.cssSelector("body > app > div.container > div > div > table > tbody > tr:nth-child(1) > td:nth-child(2) > a");
    private WebElement resultsTable;
    public CurrencyButtonsDashboardPage(WebDriver driver){this.driver = driver; }
    public void clickPanel() { driver.findElement(panel); }
    public void clickButtons(){driver.findElement(buttons);}
    public void clickBtc(){
        driver.findElement(btc).click();
    }
    public void clickBnb(){
        driver.findElement(bnb).click();
    }
    public void clickUsdt(){
        driver.findElement(usdt).click();
    }
    public void clickUsdc(){
        driver.findElement(usdc).click();
    }
    public void clickEur(){
        driver.findElement(eur).click();
    }
    public void clickAll(){
        driver.findElement(all).click();
    }
    public void getThead() {
        driver.findElement(thead);
    }
    public void getResultTable() {
        resultsTable = driver.findElement(table);
    }
    public void getCurrency(){
        this.clickPanel();
        this.clickButtons();
        this.clickBtc();
        this.clickBnb();
        this.clickUsdt();
        this.clickUsdc();
        this.clickEur();
        this.clickAll();
        this.getThead();
        this.getResultTable();
    }
    public String getResultsTableRowsValue() {
        List<WebElement> tableRows = resultsTable.findElements(row);
        return driver.findElement(value).getText();
    }
}

