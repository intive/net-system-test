package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.base.TestCommons;
public class FilterDashboardPage extends TestCommons {
    private WebDriver driver;
    private By filterField = By.id("inputvalue");
    private By dashboard =By.cssSelector("body > app > div.container > div > div");
    private By panel = By.cssSelector("body > app > div.container > div > div > form > div");
    private By button = By.cssSelector("body > app > div.container > div > div > form > div");
    private By filter = By.cssSelector("body > app > div.container > div > div > form > div > button.btn.btn-primary.btn-sm.mr-2:not([style=\"pointer-events: none;\"])");
    private By pairValues = By.cssSelector("body > app > div.container > div > div > table > tbody > tr > td:nth-child(2) > a");
    private By pairValuesTwo = By.cssSelector("body > app > div.container > div > div > table > tbody > tr:nth-child(1) > td:nth-child(2) > a");
    private By validationMessage = By.cssSelector("body > app > div.container > div > div > form > div > div.validation-message");
    public FilterDashboardPage(WebDriver driver) {this.driver = driver; }
    public void getFilterField(String strFilter) { driver.findElement(filterField).sendKeys(strFilter); }
    public void getDashboard(){driver.findElement(dashboard);}
    public void getPanel() { driver.findElement(panel); }
    public void clickButton(){driver.findElement(button);}
    public void clickFilter() { driver.findElement(filter).click(); }
    public void searchFilter(String strFilter) {
        this.getFilterField(strFilter);
        this.getDashboard();
        this.getPanel();
        this.clickButton();
        this.clickFilter(); }
    public String checkResultPairValues() {
        return driver.findElement(pairValues).getText();
    }
    public String checkResultPairValuesTwo() {
        return driver.findElement(pairValuesTwo).getText();
    }
    public String getValidation(){
        return driver.findElement(validationMessage).getText();
    }
}
