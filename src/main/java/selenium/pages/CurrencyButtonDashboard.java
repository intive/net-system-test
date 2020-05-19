package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.base.TestCommons;

import java.util.List;

public class CurrencyButtonDashboard extends TestCommons {
    private WebDriver driver;
    private By panel = By.cssSelector("body > app > div.container > div > div > form");
    private By btc = By.cssSelector("body > app > div.container > div > div > form > div > button:nth-child(1):not([style=\"pointer-events: none;\"])");
    private By bnb = By.cssSelector("body > app > div.container > div > div > form > div > button:nth-child(2):not([style=\"pointer-events: none;\"])");
    private By usdt = By.cssSelector("body > app > div.container > div > div > form > div > button:nth-child(3):not([style=\"pointer-events: none;\"])");
    private By usdc = By.cssSelector("body > app > div.container > div > div > form > div > button:nth-child(4):not([style=\"pointer-events: none;\"])");
    private By eur = By.cssSelector("body > app > div.container > div > div > form > div > button:nth-child(5):not([style=\"pointer-events: none;\"])");
    private By all = By.cssSelector("body > app > div.container > div > div > form > div > button:nth-child(6):not([style=\"pointer-events: none;\"])");
    private By table = By.cssSelector("body > app > div.container > div > div > table");
    private By thead = By.cssSelector("tbody > thead");
    private By row = By.cssSelector("tbody > tr");
    private By value = By.cssSelector("body > app > div.container > div > div > table > tbody > tr:nth-child(1) > td:nth-child(2) > a");
    private WebElement resultsTable;

    public CurrencyButtonDashboard(WebDriver driver){this.driver = driver;
    }
    public void setPanel()
    { driver.findElement(panel);
    }
    public void getBtc(){
        driver.findElement(btc).click();
    }
    public void getBnb(){
        driver.findElement(bnb).click();
    }
    public void getUsdt(){
        driver.findElement(usdt).click();
    }
    public void getUsdc(){
        driver.findElement(usdc).click();
    }
    public void getEur(){
        driver.findElement(eur).click();
    }
    public void getAll(){
        driver.findElement(all).click();
    }
    public void getThead() {
        driver.findElement(thead);
    }
    public void setResultTable() {
        resultsTable = driver.findElement(table);
    }

    public void getCurrency(){
        this.setPanel();
        this.getBtc();
        this.getBnb();
        this.getUsdt();
        this.getUsdc();
        this.getEur();
        this.getAll();
        this.getThead();
        this.setResultTable();
    }
    public String getResultsTableRowsValue() {
       // List<WebElement> tableRows = resultsCurrency.findElements(row);
        return driver.findElement(value).getText();
}
}

