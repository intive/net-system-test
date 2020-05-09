package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.base.TestCommons;

public class HistoryView extends TestCommons {

    private WebDriver driver;

    @FindBy( css = ".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > a:nth-child(1)")
    public WebElement btcButton;

    @FindBy( css = ".table > tbody:nth-child(2)")
    public WebElement table;

    @FindBy( css = ".table > tbody:nth-child(2) > tr:nth-child(1)")
    public WebElement firstHistoryElement;

    @FindBy( css = ".table > tbody:nth-child(2) > tr:nth-child(2)")
    public WebElement secondHistoryElement;

    @FindBy( css = ".table > tbody:nth-child(2) > tr:nth-child(3)")
    public WebElement thirdHistoryElement;

    @FindBy( css = ".table > tbody:nth-child(2) > tr:nth-child(4)")
    public WebElement fourthHistoryElement;

    @FindBy( css = ".table > tbody:nth-child(2) > tr:nth-child(5)")
    public WebElement fifthHistoryElement;

    @FindBy( css = ".table > tbody:nth-child(2) > tr:nth-child(6)")
    public WebElement sixthHistoryElement;

    @FindBy( css = ".table > tbody:nth-child(2) > tr:nth-child(7)")
    public WebElement seventhHistoryElement;

    @FindBy( css = ".table > tbody:nth-child(2) > tr:nth-child(8)")
    public WebElement eightHistoryElement;

    @FindBy( css = ".table > tbody:nth-child(2) > tr:nth-child(9)")
    public WebElement nineHistoryElement;

    @FindBy( css = ".table > tbody:nth-child(2) > tr:nth-child(10)")
    public WebElement tenHistoryElement;


    public HistoryView(WebDriver driver) {
        initElements(driver);
    }


    public void clickHistoryButton() { clickElement(btcButton); }

    public void getHistoryElement(String text){
        getElementsAttribute(firstHistoryElement, text);
        getElementsAttribute(secondHistoryElement, text);
        getElementsAttribute(thirdHistoryElement, text);
        getElementsAttribute(fourthHistoryElement, text);
        getElementsAttribute(fifthHistoryElement, text);
        getElementsAttribute(sixthHistoryElement, text);
        getElementsAttribute(seventhHistoryElement, text);
        getElementsAttribute(eightHistoryElement, text);
        getElementsAttribute(nineHistoryElement, text);
        getElementsAttribute(tenHistoryElement, text);

    }

}


