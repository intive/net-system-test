package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.base.TestCommons;

public class IndicatorsView extends TestCommons {

    private WebDriver driver;

    @FindBy( css = ".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > a:nth-child(1)")
    public WebElement btcButton;

    @FindBy( css = "div.btn-group:nth-child(2) > button:nth-child(4)")
    public WebElement indicatorsButton;

    @FindBy( css = "div.btn-toolbar:nth-child(8) > div:nth-child(1) > button:nth-child(2)")
    public WebElement rsiButton;

    @FindBy( css = "div.btn-toolbar:nth-child(8) > div:nth-child(1) > button:nth-child(3)")
    public WebElement smaButton;

    @FindBy( css = "div.btn-toolbar:nth-child(8) > div:nth-child(2) > button:nth-child(2)")
    public WebElement smaHighPriceButton;

    @FindBy( css = "div.btn-toolbar:nth-child(8) > div:nth-child(2) > button:nth-child(3)")
    public WebElement smaLowPriceButton;

    @FindBy( css = "div.btn-toolbar:nth-child(8) > div:nth-child(2) > button:nth-child(4)")
    public WebElement smaOpenPriceButton;

    @FindBy( css = "div.btn-toolbar:nth-child(8) > div:nth-child(2) > button:nth-child(5)")
    public WebElement smaClosePriceButton;

    @FindBy(css = "div.btn-toolbar:nth-child(8) > div:nth-child(2) > button:nth-child(2)")
    public WebElement twoTimeframe;

    @FindBy(css = "div.btn-toolbar:nth-child(8) > div:nth-child(2) > button:nth-child(3)")
    public WebElement threeTimeframe;

    @FindBy(css = "div.btn-toolbar:nth-child(8) > div:nth-child(2) > button:nth-child(4)")
    public WebElement fourTimeframe;

    @FindBy(css = "div.btn-toolbar:nth-child(8) > div:nth-child(2) > button:nth-child(5)")
    public WebElement fiveTimeframe;

    @FindBy(css = "div.btn-toolbar:nth-child(8) > div:nth-child(2) > button:nth-child(6)")
    public WebElement sixTimeframe;

    @FindBy(css = "div.btn-toolbar:nth-child(8) > div:nth-child(2) > button:nth-child(7)")
    public WebElement fourteenTimeframe;

    @FindBy(css = "div.btn-toolbar:nth-child(8) > div:nth-child(2) > button:nth-child(8)")
    public WebElement twentyTimeframe;

    @FindBy(css = "div.btn-toolbar:nth-child(8) > div:nth-child(2) > button:nth-child(9)")
    public WebElement thirtyTimeframe;


    @FindBy( id = "rsi_chart_div")
    public WebElement rsiChart;

    @FindBy( id = "sma_chart_div")
    public WebElement smaChart;

    public IndicatorsView(WebDriver driver) {
        initElements(driver);
    }


    public void clickIndicatorsButton() {
        clickElement(btcButton);
        clickElement(indicatorsButton);
    }

    public void checkRsiButton(){
        clickElement(rsiButton);
    }

    public void checkSmaButton(){
        clickElement(smaButton);
    }

    public void checkSmaKlinePrice(String text) {
        clickElement(smaButton);
        clickElement(smaHighPriceButton);
        clickElement(smaLowPriceButton);
        clickElement(smaOpenPriceButton);
        clickElement(smaClosePriceButton);
        getElementsAttribute(smaChart, text);
    }

    public void checkRsiTimeframe(String text) {
        clickElement(rsiButton);
        clickElement(twoTimeframe);
        clickElement(threeTimeframe);
        clickElement(fourTimeframe);
        clickElement(fiveTimeframe);
        clickElement(sixTimeframe);
        clickElement(fourteenTimeframe);
        clickElement(twentyTimeframe);
        clickElement(thirtyTimeframe);
        getElementsAttribute(rsiChart, text);
    }

}
