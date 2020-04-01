package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.base.TestCommons;

public class ChartView extends TestCommons {

    @FindBy( id = "inputUsername")
    public WebElement usernameInput;

    @FindBy( id = "inputPassword")
    public WebElement passwordInput;

    @FindBy( css = ".btn")
    public WebElement submitButton;

    @FindBy( css = ".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(1) > a:nth-child(1)")
    public WebElement btcButton;

    @FindBy( css = "div.btn-group:nth-child(4) > button:nth-child(2)")
    public WebElement chartButton;

    @FindBy( css = "div.btn-group:nth-child(4) > button:nth-child(1)")
    public WebElement tableButton;

    @FindBy( tagName = "canvas")
    public WebElement chartCheckButton;

    public ChartView(WebDriver driver) {
        initElements(driver);
    }

    public void sendKeysToChartInput(String text){
        sendKeysToElement(usernameInput, text);
        sendKeysToElement(passwordInput, text);
    }

    public void clickChartButton() {
        clickElement(submitButton);
        clickElement(btcButton);
        clickElement(chartButton);
        clickElement(tableButton);
        //clickElement(chartCheckButton);
    }

    public void chart(String text) {
        sendKeysToChartInput(text);
        clickChartButton();
    }
}