package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.base.TestCommons;
import java.util.List;
public class QuantityButtonsDashboardPage extends TestCommons {
    private WebDriver driver;
    private By buttonsPanel = By.cssSelector("body > app > div.container > div > div > div");
    private By buttons = By.cssSelector("body > app > div.container > div > div > div > div");
    private By buttonsQuantity = By.cssSelector("body > app > div.container > div > div > div > div > div");
    private By ten = By.cssSelector("body > app > div.container > div > div > div > div > div > button:nth-child(1)");
    private By twenty = By.cssSelector("body > app > div.container > div > div > div > div > div > button:nth-child(2)");
    private By fifty = By.cssSelector("body > app > div.container > div > div > div > div > div > button:nth-child(3):not([style=\"pointer-events: none;\"])");
    private By hundred = By.cssSelector("body > app > div.container > div > div > div > div > div > button:nth-child(4):not([style=\"pointer-events: none;\"])");
    private By table = By.cssSelector("body > app > div.container > div > div > table");
    private By thead = By.cssSelector("body > app > div.container > div > div > table > thead");
    private By tbody= By.cssSelector("body > app > div.container > div > div > table > tbody");
    private By row = By.cssSelector("body > app > div.container > div > div > table > tbody > tr:nth-child(1)");
    private WebElement resultsTable;
    public QuantityButtonsDashboardPage(WebDriver driver) { this.driver = driver; }
    public void clickButtonsPanel() {driver.findElement(buttonsPanel);}
    public void clickButtons(){driver.findElement(buttons);}
    public void clickButtonsQuantity() {
        driver.findElement(buttonsQuantity);
    }
    public void clickButton10() {
        driver.findElement(ten).click();
    }
    public void clickButton20() {
            driver.findElement(twenty).click();
    }
    public void clickButton50() {
        driver.findElement(fifty).click();
    }
    public void clickButton100(){
        driver.findElement(hundred).click();
    }
    public void getThead() {
        driver.findElement(thead);
    }
    public void getTbody(){driver.findElement(tbody);}
    public void setResultTable() {
        resultsTable = driver.findElement(table);
    }
    public int getResultsTableRowsSize() {
        List<WebElement> tableRows = resultsTable.findElements(row);
        return tableRows.size();
    }
    public void searchTable(){
        this.clickButtonsPanel();
        this.clickButtons();
        this.clickButtonsQuantity();
        this.clickButton10();
        this.clickButton20();
        this.clickButton50();
        this.clickButton100();
        this.getThead();
        this.getTbody();
        this.setResultTable();
        this.getResultsTableRowsSize();
    }
}




