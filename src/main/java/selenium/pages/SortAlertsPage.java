package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SortAlertsPage {
    private WebDriver driver;

    private By myProfile = By.xpath("/html/body/app/nav/ul/li[3]/a");
    private By myAlerts = By.xpath("//*[@id=\"exTab3\"]/ul/li[2]/a");
    private By dropDownButton = By.id("dropdownButton");
    private By option = By.xpath("//*[@id=\"2b\"]/div[2]/div[1]/div/div/a[5]"); //wybrany e-mail
    private By expand = By.xpath("//*[@id=\"2b\"]/div[2]/div[2]/button[1]");
    private By sort1 = By.xpath("//*[@id=\"2b\"]/div[2]/div[1]/button/span");
    private By sort2 = By.xpath("//*[@id=\"2b\"]/div[2]/div[1]/button/span");
    private By collapse = By.xpath("//*[@id=\"2b\"]/div[2]/div[2]/button[2]");
    private By check = By.xpath("/html/body/app/nav/ul/li[1]/a");

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

    public String getMessage() {
        return driver.findElement(check).getText();
    }
}
