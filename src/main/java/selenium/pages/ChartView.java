package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.base.TestCommons;

public class ChartView extends TestCommons {

    @FindBy( xpath = "/html/body/app/div[3]/div[2]/table/tbody/tr[1]/td[2]/a")
    public WebElement btcButton;

    @FindBy( css = "div.btn-group:nth-child(2) > button:nth-child(3)")
    public WebElement chartButton;

    @FindBy( css = "div.btn-group:nth-child(2) > button:nth-child(2)")
    public WebElement tableButton;

    @FindBy( css = "div.btn-toolbar:nth-child(3) > div:nth-child(1) > button:nth-child(2)")
    public WebElement fiveMinButton;

    @FindBy( css = "div.btn-toolbar:nth-child(3) > div:nth-child(1) > button:nth-child(3)")
    public WebElement fifteenMinButton;

    @FindBy( css = "div.btn-toolbar:nth-child(3) > div:nth-child(1) > button:nth-child(4)")
    public WebElement oneHourButton;

    @FindBy( css = "div.btn-toolbar:nth-child(3) > div:nth-child(1) > button:nth-child(5)")
    public WebElement twoHoursButton;

    @FindBy( css = "button.btn:nth-child(6)")
    public WebElement fourHoursButton;

    @FindBy( css = "button.btn:nth-child(7)")
    public WebElement twelveHoursButton;

    @FindBy( css = "button.btn:nth-child(8)")
    public WebElement oneDayButton;


    public ChartView(WebDriver driver) { initElements(driver); }

    public void clickChartButton() {
        clickElement(btcButton);
        clickElement(chartButton);
    }
    public void clickSingleChartButton() { clickElement(chartButton); }

    public void clickSingleTableButton() { clickElement(tableButton); }

    public void clickChangeTimeButton() {
        clickElement(fiveMinButton);
        clickElement(fifteenMinButton);
        clickElement(oneHourButton);
        clickElement(twoHoursButton);
        clickElement(fourHoursButton);
        clickElement(twelveHoursButton);
        clickElement(oneDayButton);
    }

}