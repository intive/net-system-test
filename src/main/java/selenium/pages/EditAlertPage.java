package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import selenium.base.TestCommons;

public class EditAlertPage extends TestCommons {
    private WebDriver driver;

    private By myProfile = By.xpath("/html/body/app/div[2]/div[2]/ul/li[2]/a");
    private By myAlerts = By.xpath("/html/body/app/div[3]/div[2]/div[2]/div/button[1]");
    private By alert = By.xpath("/html/body/app/div[3]/div[2]/div[6]/div[1]/div[2]/button[1]/span");
    private By value = By.id("value");
    private By confirm = By.xpath("//*[@id=\"innerContainer\"]/div[8]/button[2]");
    private By pause=By.xpath("/html/body/app/div[1]/div[2]/div");

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
        driver.findElement(value).sendKeys("70");
    }

    public void setConfirm(){
        driver.findElement(confirm).click();
    }

    public void setPause(){
        driver.findElement(pause).click();
    }




}


