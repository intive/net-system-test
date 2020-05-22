package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.base.TestCommons;


public class FilterDashboard extends TestCommons {
    private WebDriver driver;
    private By filterField = By.id("inputvalue");
    private By panel = By.cssSelector("body > app > div.container > div > div > form");
    private By filter = By.cssSelector("body > app > div.container > div > div > form > div > button.btn.btn-primary.btn-sm.mr-2:not([style=\"pointer-events: none;\"])");
    private By pairValues = By.cssSelector("body > app > div.container > div > div > table > tbody > tr > td:nth-child(2) > a");
    private By pairValuesTwo = By.cssSelector("body > app > div.container > div > div > table > tbody > tr:nth-child(1) > td:nth-child(2) > a");
    private By validationMessage = By.cssSelector("body > app > div.container > div > div > form > div > div.validation-message");

    public FilterDashboard(WebDriver driver)
    {this.driver = driver;
    }
    public void setFilterField(String strFilter)
    { driver.findElement(filterField).sendKeys(strFilter);
    }
    public void setPanel()
    { driver.findElement(panel);
    }
    public void clickFilter()
    { driver.findElement(filter).click();
    }
    public void searchFilter(String strFilter)
    {
        this.setFilterField(strFilter);
        this.setPanel();
        this.clickFilter();
    }

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
