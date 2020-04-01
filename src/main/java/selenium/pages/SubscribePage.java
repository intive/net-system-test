package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.base.TestCommons;

public class SubscribePage extends TestCommons {

    @FindBy( id = "inputUsername")
    public WebElement usernameInput;

    @FindBy( id = "inputPassword")
    public WebElement passwordInput;

    @FindBy( css = ".btn")
    public WebElement submitButton;

    @FindBy( css = ".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(4) > button:nth-child(1)")
    public WebElement subscribeButton;

    @FindBy( id = "condition")
    public WebElement conditionInput;

    @FindBy( id = "valueType")
    public WebElement valueTypeInput;

    @FindBy( id = "value")
    public WebElement valueInput;

    @FindBy( id = "sendEmail")
    public WebElement sendEmailInput;

    @FindBy( id = "eEmail")
    public WebElement eEmailInput;

    @FindBy( id = "message")
    public WebElement messageInput;

    public SubscribePage (WebDriver driver) {
        initElements(driver);
    }

    public void sendKeysToLoginInput(String text){
        sendKeysToElement(usernameInput, text);
        sendKeysToElement(passwordInput, text);
    }

    public void clickSubmitButton() {
        clickElement(submitButton);
        clickElement(subscribeButton);
    }

    public void login(String text) {
        sendKeysToLoginInput(text);
        clickSubmitButton();
    }

    public void sendKeysToSubscribeWindow(String text){
        sendKeysToElement(valueInput, text);
        sendKeysToElement(eEmailInput, text);
        sendKeysToElement(messageInput, text);
    }

    public void clickOptionsSubscribeWindow(){
        clickElement(conditionInput);
        clickElement(valueTypeInput);
        clickElement(sendEmailInput);
    }
    public void subscribePageSet(String text){
        sendKeysToSubscribeWindow(text);
        clickOptionsSubscribeWindow();
    }

}

