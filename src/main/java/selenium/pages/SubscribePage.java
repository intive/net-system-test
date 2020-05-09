package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SubscribePage {

    private WebDriver driver;
    private By subscribeButton = By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(5) > button:nth-child(1)");
    private By conditionInput = By.id("condition");
    private By valueType = By.id("valueType");
    private By valueInput = By.id("value");
    private By onlyOnce = By.id("triggerOnce");
    private By sendEmailInput = By.id("sendEmail");
    private By emailInput = By.id("email");
    private By messageInput = By.id("message");
    private By confirmButton = By.cssSelector(".btn-success");
    private By cancelButton = By.cssSelector("button.btn-danger:nth-child(1)");
    private By heading = By.cssSelector("#innerContainer > h3:nth-child(1)");
    private By validationMessage = By.className("validation-message");
    private By dashboardView = By.cssSelector(".content > h1:nth-child(1)");
    private By myProfileButton = By.cssSelector("li.nav-item:nth-child(3) > a:nth-child(1)");
    public By alertsButton = By.cssSelector(".rounded-right > a:nth-child(1)");

    public SubscribePage(WebDriver driver) {
        this.driver = driver;
    }

    public void setSubscribeButton() {
        driver.findElement(subscribeButton).click();
    }

    public void setConditionInput(String condition_input) {
        Select condition = new Select(driver.findElement(conditionInput));
        condition.selectByVisibleText(condition_input);
    }

    public void setValueType(String value_type) {
        Select value = new Select(driver.findElement(valueType));
        value.selectByVisibleText(value_type);
    }

    public void setValueInput(String value_input) {
        driver.findElement(valueInput).clear();
        driver.findElement(valueInput).sendKeys(value_input);
    }

    public void goToMyAlerts() {
        driver.findElement(myProfileButton).click();
        driver.findElement(alertsButton).click();
    }

    public void setOnlyOnce() {
        driver.findElement(onlyOnce).click();
    }

    public void setSendEmail() {
        driver.findElement(sendEmailInput).click();
    }

    public void setEmailInput(String mail_input) {
        driver.findElement(emailInput).sendKeys(mail_input);
    }

    public void setMessageInput(String message_input) {
        driver.findElement(messageInput).sendKeys(message_input);
    }

    public void setConfirmButton() {
        driver.findElement(confirmButton).click();
    }

    public void setCancelButton() {
        driver.findElement(cancelButton).click();
    }

    public String isSubscribePageOpen() {
        return driver.findElement(heading).getText();
    }

    public String getValidationMessage() { return driver.findElement(validationMessage).getText(); }

    public String getDashboardMessage() {
        return driver.findElement(dashboardView).getText();
    }
}