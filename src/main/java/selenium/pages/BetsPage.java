package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class BetsPage {
    private WebDriver driver;
    private WebElement results;
    private By betButton = By.cssSelector("body > app > div.container > div > div > table > tbody > tr:nth-child(1) > td:nth-child(6) > button");
    private By points = By.id("points");
    private By lowerValue = By.id("lowerValue");
    private By duration = By.id("timeInterval");
    private By betType = By.id("rateType");
    private By confirm = By.cssSelector("body > app > div.blazored-modal-container.blazored-modal-center.blazored-modal-active > div.blazored-modal-wrapper > div > div > div > form > div.text-right > button.btn.btn-success.btn-sm");
    private By bets = By.cssSelector("a[href*='bets']");
    private By myBets = By.cssSelector("body > app > div.container > div > div > div > button");
    private By editBets = By.cssSelector("#bets-table > tbody > tr:nth-child(1) > td:nth-child(9) > button:nth-child(1) > span");
    private By deleteBets = By.cssSelector("#bets-table > tbody > tr:nth-child(2) > td:nth-child(9) > button:nth-child(2) > span");
    private By change = By.cssSelector("#points"); //points
    private By changeButton = By.cssSelector(".btn.btn-success");
    private By betsForm = By.cssSelector("body > app > div.blazored-modal-container.blazored-modal-center.blazored-modal-active > div.blazored-modal-wrapper > div > div > div > h3");
    private By userBets = By.cssSelector("#bets-table > tbody > tr > td:nth-child(2)");
    private By changePoints = By.cssSelector("#bets-table > tbody > tr:nth-child(1) > td:nth-child(3)");
    private By type = By.cssSelector("#rateType");
    private By editForm = By.cssSelector("body > app > div.blazored-modal-container.blazored-modal-center.blazored-modal-active > div.blazored-modal-wrapper > div > div > div > h3");
    private By visibilityElement = By.cssSelector("body > app > div.blazored-modal-container.blazored-modal-center.blazored-modal-active > div.blazored-modal-wrapper > div > div > div > h6:nth-child(3)");
    private By table = By.id("bets-table");
    private By list = By.cssSelector("tbody > tr");

    public BetsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setBetButton(){
        WebDriverWait element= new WebDriverWait(driver, 60);
        element.until(ExpectedConditions.elementToBeClickable(betButton));
        driver.findElement(betButton).click(); }
    public void setPoints(){
        driver.findElement(points).sendKeys("20");
    }
    public void setEditPoints(){
        WebDriverWait element= new WebDriverWait(driver, 60);
        element.until(ExpectedConditions.visibilityOfElementLocated(visibilityElement));
        driver.findElement(change).clear();
        driver.findElement(change).sendKeys("60"); }
    public void setLowerValue(){
        driver.findElement(lowerValue).sendKeys("3");
    }
    public void setDuration(){
        WebElement dropdownButton = driver.findElement(duration);
        dropdownButton.click(); }
    public void setOption(){
       new Select(driver.findElement(duration)).selectByVisibleText("Two Days");
    }
    public void setConfirm(){
        driver.findElement(confirm).click();
    }
    public void setType(){
        driver.findElement(type).click();
    }
    public void setChangeButton(){
        WebDriverWait element= new WebDriverWait(driver, 60);
        element.until(ExpectedConditions.elementToBeClickable(changeButton));
        driver.findElement(changeButton).click(); }
    public void setBets(){
        driver.findElement(bets).click();
    }
    public void setMyBets(){
        WebDriverWait element= new WebDriverWait(driver, 60);
        element.until(ExpectedConditions.elementToBeClickable(myBets));
        driver.findElement(myBets).click(); }
    public void setEditBets(){
        driver.findElement(editBets).click();
    }
    public void setDeleteBets(){
        driver.findElement(deleteBets).click();
    }
    public void setRefresh(){ driver.navigate().refresh(); }
    public void setOk(){
        driver.switchTo().alert().accept();
    }
    public String getBetsForm(){return driver.findElement(betsForm).getText();}
    public String getBetType(){return driver.findElement(betType).getText();}
    public String getDuration(){return driver.findElement(duration).getText();}
    public String getUserBets(){return driver.findElement(userBets).getText();}
    public String getEditBets(){return driver.findElement(editForm).getText();}
    public String getMonit() {
        return driver.switchTo().alert().getText();
    }
    public String getChangePoints() {
        driver.findElements(myBets);
        return driver.findElement(changePoints).getText(); }
    public void setResult() {
        results = driver.findElement(table);
    }
    public int getTableSize() {
        List<WebElement> tableRows = results.findElements(list);
        return tableRows.size(); }
  }

