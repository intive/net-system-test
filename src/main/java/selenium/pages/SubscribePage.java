package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import selenium.base.PageBase;


public class SubscribePage extends PageBase {

    private By subscribeButton = By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(5) > button:nth-child(1)");
    private By conditionInput = By.id("condition");
    private By valueType = By.id("valueType");
    private By valueInput = By.id("value");
    private By onlyOnce = By.id("triggerOnce");
    private By sendEmailInput = By.id("sendEmail");
    private By emailInput = By.id("email");
    private By confirmButton = By.cssSelector(".btn-success");
    private By cancelButton = By.cssSelector(".btn-danger");
    private By heading = By.cssSelector(".modal-container > h3:nth-child(1)");
    private By validationMessage = By.className("validation-message");
    private By dashboardView = By.cssSelector(".content > h1:nth-child(1)");
    private By myProfileButton = By.xpath("/html/body/app/nav/ul/li[4]/a");
    public By alertsButton = By.className("rounded-right");
    private By alertSingleButton = By.cssSelector(".card-header");
    private By pencilButton = By.cssSelector(".oi-pencil");
    private By triggerOnce = By.id("triggerOnce");
    private By onlyOnceText = By.cssSelector("div.card:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > p:nth-child(2)");

    public SubscribePage(WebDriver driver) { super(driver); }

    public void WebDriver(WebDriver driver) { this.driver = driver; }

    public void setSubscribeButton() { clickWhenReady(subscribeButton); }

    public void setConditionInput(String condition_input) {
        Select condition = new Select(driver.findElement(conditionInput));
        condition.selectByVisibleText(condition_input);
    }

    public void setValueType(String value_type) {
        Select value = new Select(driver.findElement(valueType));
        value.selectByVisibleText(value_type);
    }

    public void setValueInput(String value_input) {
        clearElement(valueInput);
        driver.findElement(valueInput).sendKeys(value_input);
    }

    public void setOnlyOnce() {
        clickWhenReady(onlyOnce);
        clickWhenReady(onlyOnce);
    }

    public void setSendEmail() { clickWhenReady(sendEmailInput); }

    public void setEmailInput(String mail_input) {
        clearElement(emailInput);
        clickWhenReady(emailInput);
        driver.findElement(emailInput).sendKeys(mail_input);
    }

    public void goToMyAlerts() {
        clickWhenReady(myProfileButton);
        clickWhenReady(alertsButton);
    }

    public void checkAlert() {
        clickWhenReady(alertSingleButton);
        clickWhenReady(pencilButton);
        clickWhenReady(triggerOnce);
        clickWhenReady(confirmButton);
    }

    public String getConfirmOnlyOnce() {
        clickWhenReady(alertSingleButton);
        return getElementText(onlyOnceText);
    }

    public void setConfirmButton() { clickWhenReady(confirmButton); }

    public void setCancelButton() { clickWhenReady(cancelButton); }

    public String isSubscribePageOpen() { return getElementText(heading); }

    public String getValidationMessage() { return getElementText(validationMessage); }

    public String getDashboardMessage() { return getElementText(dashboardView); }
}