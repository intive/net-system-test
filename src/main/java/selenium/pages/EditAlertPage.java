package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EditAlertPage {
    private WebDriver driver;

    private By myProfile = By.xpath("/html/body/app/nav/ul/li[3]/a");
    private By myAlerts = By.xpath("//*[@id=\"exTab3\"]/ul/li[2]/a");
    private By alert = By.xpath("//*[@id=\"2b\"]/div[3]/div[1]/div[2]/button[1]/span");
    private By value = By.id("value");
    private By confirm= By.xpath("//*[@id=\"innerContainer\"]/div[8]/button[2]");
    private By pause=By.xpath("//*[@id=\"innerContainer\"]/div[8]");
    private By check =By.xpath("/html/body/app/nav/ul/li[1]/a");

    public EditAlertPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setMyProfile() {
        driver.findElement(myProfile).click();
    }

    public void setMyAlerts(){
        driver.findElement(myAlerts).click();
    }

    public void setAlert(){
        driver.findElement(alert).click();
    }

    public void setValueType(){
        Select size = new Select(driver.findElement(By.id("valueType")));
        size.selectByVisibleText("Volume");
    }

    public void setValue() {
        driver.findElement(value).clear();
        driver.findElement(value).sendKeys("86");
    }

    public void setConfirm(){
        driver.findElement(confirm).click();
    }

    public void setPause(){
       driver.findElement(pause).click();
    }

    public String getMessage() {
        return driver.findElement(check).getText();
    }

}


