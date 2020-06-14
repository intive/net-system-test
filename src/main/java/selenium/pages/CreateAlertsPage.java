package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAlertsPage {
    private WebDriver driver;
    private By alertButton = By.cssSelector("body > app > div.container > div > div > table > tbody > tr:nth-child(1) > td:nth-child(5) > button");
    private By conditionButton = By.id("condition");
    private By value = By.id("value");
    private By valueType = By.id("valueType");
    private By select = By.tagName("select");
    private By confirmButton = By.cssSelector(".btn-success");
    private By emailAlert = By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(5) > button:nth-child(1)");
    private By emailValue = By.id("email");
    private By sendEmail = By.id("sendEmail");
    private By triggerOnce = By.id("triggerOnce");
    private By pause = By.cssSelector("body > app > div.blazored-modal-container.blazored-modal-center.blazored-modal-active > div.blazored-modal-wrapper > div > div > form > div > div.text-right");
    private By check = By.cssSelector("body > app > div.container > div > h1");
    private By lowerValue = By.id("value");
    private By upperValue = By.id("additionalValue");
    private By alertForm = By.cssSelector("body > app > div.blazored-modal-container.blazored-modal-center.blazored-modal-active > div.blazored-modal-wrapper > div > div > form > div > h3:nth-child(1)");

    public CreateAlertsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickAlert() {
        WebDriverWait element = new WebDriverWait(driver, 60);
        element.until(ExpectedConditions.elementToBeClickable(alertButton));
        driver.findElement(alertButton).click();
    }
    public void setCondition() {
        driver.findElement(conditionButton).click();
    }
    public void setSelectCondition() {
        Select options = new Select(driver.findElement(select));
        options.selectByVisibleText("Crossing");
    }
    public void setValueType() {
        Select size = new Select(driver.findElement(valueType));
        size.selectByVisibleText("Price");
    }
    public void setValue() {
        driver.findElement(value).clear();
        driver.findElement(value).sendKeys("60");
    }
    public void setConfirmButton() {
        driver.findElement(confirmButton).click();
    }
    public void setPause(){
        driver.findElement(pause).click();
    }
    public void setEmailAlert(){
        WebDriverWait element = new WebDriverWait(driver, 60);
        element.until(ExpectedConditions.elementToBeClickable(emailAlert));
        driver.findElement(emailAlert).click();
    }
    public void setValueType2() {
        Select size = new Select(driver.findElement(valueType));
        size.selectByVisibleText("Volume");
    }
    public void setValue2() {
        driver.findElement(value).clear();
        driver.findElement(value).sendKeys("39000");
    }
    public void setSendEmail(){
        WebElement checkbox = driver.findElement(sendEmail);
        checkbox.click();
    }
    public void setOnlyOnce(){
        WebElement checkbox = driver.findElement(triggerOnce);
        checkbox.click();
    }
    public void setCrossingUp() {
        Select options = new Select(driver.findElement(select));
        options.selectByVisibleText("Crossing Up");
    }
    public void setCrossingDown() {
        Select options = new Select(driver.findElement(select));
        options.selectByVisibleText("Crossing Down");
    }
    public void setBetween() {
        Select options = new Select(driver.findElement(select));
        options.selectByVisibleText("Between");
    }
    public void setLowerValue() {
        driver.findElement(lowerValue).clear();
        driver.findElement(lowerValue).sendKeys("3");
    }
    public void setUpperValue() {
        driver.findElement(upperValue).clear();
        driver.findElement(upperValue).sendKeys("4");
    }
    public String getMessage() {
        return driver.findElement(check).getText();
    }
    public String getAlertForm() {
        return driver.findElement(alertForm).getText();
    }
    public String getEmail(){return driver.findElement(emailValue).getText();}
    public String getCrossingUp(){return driver.findElement(conditionButton).getText();}
    public String getCrossingDown(){return driver.findElement(conditionButton).getText();}
    public String getBetween(){return driver.findElement(conditionButton).getText();}
}


