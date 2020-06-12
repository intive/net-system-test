package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EditAlertPage {
    private WebDriver driver;
    private By myProfile = By.cssSelector("a[href*='userprofile']");
    private By myAlerts = By.cssSelector("a[href*='#2b']");
    private By alert = By.cssSelector("#\\32 b > div:nth-child(6) > div.card-header.d-flex.flex-row.justify-content-between > div:nth-child(2) > button:nth-child(1) > span");
    private By value = By.id("value");
    private By confirm= By.cssSelector("body > app > div.blazored-modal-container.blazored-modal-center.blazored-modal-active > div.blazored-modal-wrapper > div > div > form > div > div.text-right > button.btn.btn-success.btn-sm");
    private By pause = By.cssSelector("body > app > div.blazored-modal-container.blazored-modal-center.blazored-modal-active > div.blazored-modal-wrapper > div > div > form > div > div.text-right");
    private By alertList = By.id("2b");
    private By alertsForm = By.cssSelector("body > app > div.blazored-modal-container.blazored-modal-center.blazored-modal-active > div.blazored-modal-wrapper > div > div > form > div > h3:nth-child(1)");
    private By alertExpand = By.cssSelector("#\\32 b > div:nth-child(6) > div.card-header.d-flex.flex-row.justify-content-between");
    private By alertValueCheck = By.cssSelector("#\\32 b > div:nth-child(6) > div:nth-child(2) > div > div:nth-child(3) > p");

    public EditAlertPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setMyProfile() {
        driver.findElement(myProfile).click();
    }
    public void setMyAlerts(){
        driver.findElement(myAlerts).click();
    }
    public void setAlert(){
        driver.findElement(alert).click();
    }
    public void setValueType(){
        Select size = new Select(driver.findElement(By.id("valueType")));
        size.selectByVisibleText("Price");
    }
    public void setValue() {
        driver.findElement(value).clear();
        driver.findElement(value).sendKeys("100");
    }
    public void setAlertExpand() {
        driver.findElement(alertExpand).click();
    }
    public void setConfirm(){
        driver.findElement(confirm).click();
    }
    public void setPause(){
       driver.findElement(pause).click();
    }
    public void setRefresh(){
        driver.navigate().refresh();
    }
    public String getAlertList(){
        return driver.findElement(alertList).getText();
    }
    public String getEditAlerts(){
        return driver.findElement(alertsForm).getText();
    }
    public String getValueCheck(){
        return driver.findElement(alertValueCheck).getText();
    }
}
