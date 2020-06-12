package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SortAlertsPage {
    private WebDriver driver;
    private By myProfile = By.cssSelector("a[href*='userprofile']");
    private By myAlerts = By.cssSelector("a[href*='#2b']");
    private By dropDownButton = By.id("dropdownButton");
    private By option = By.cssSelector("#\\32 b > div:nth-child(3) > div.dropdown.d-flex.show > div > div > a:nth-child(4)"); //wybrany Value
    private By expand = By.cssSelector("#\\32 b > div:nth-child(3) > div:nth-child(2) > button:nth-child(1)");
    private By sort1 = By.cssSelector("#\\32 b > div:nth-child(3) > div.dropdown.d-flex > button");
    private By sort2 = By.cssSelector("#\\32 b > div:nth-child(3) > div.dropdown.d-flex > button");
    private By collapse = By.cssSelector("#\\32 b > div:nth-child(3) > div:nth-child(2) > button:nth-child(2)");
    private By crossing = By.cssSelector("#\\32 b > div:nth-child(4) > div:nth-child(2) > div > div:nth-child(1) > p");
    private By check = By.cssSelector("a[href*='#2b']");
    private By sortList = By.cssSelector("#\\32 b > div:nth-child(3) > div.dropdown.d-flex.show > div > div");

    public SortAlertsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setMyProfile() {
        driver.findElement(myProfile).click();
    }
    public void setMyAlerts(){
        driver.findElement(myAlerts).click();
    }
    public void setDropDownButton(){
        WebElement dropdownButton = driver.findElement(dropDownButton);
        dropdownButton.click();
    }
    public void setOption(){
        WebElement emailOption = driver.findElement(option);
        emailOption.click();
    }
    public void setExpand(){
        driver.findElement(expand).click();
    }
    public void setSort1(){
        driver.findElement(sort1).click();
    }
    public void setSort2(){
        driver.findElement(sort2).click();
    }
    public void setCollapse(){
        driver.findElement(collapse).click();
    }
    public String getSortList() {
        return driver.findElement(sortList).getText();
    }
    public String getCrossing() {
        return driver.findElement(crossing).getText();
    }
    public String getBetween() {
        return driver.findElement(crossing).getText();
    }
    public String getMessage() {
        return driver.findElement(check).getText();
    }
}
