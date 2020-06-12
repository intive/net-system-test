package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DeleteAlertPage {
    private WebDriver driver;
    private By myProfile = By.cssSelector("a[href*='userprofile']");
    private By myAlerts = By.cssSelector("a[href*='#2b']");
    private By delete = By.cssSelector("#\\32 b > div:nth-child(4) > div.card-header.d-flex.flex-row.justify-content-between > div:nth-child(2) > button:nth-child(2) > span"); //ścieżka do wybranego alertu

    public DeleteAlertPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setMyProfile() {
        driver.findElement(myProfile).click();
    }
    public void setMyAlerts(){
        driver.findElement(myAlerts).click();
    }
    public void setDelete(){
        driver.findElement(delete).click();
    }
    public void setAlert(){
        driver.switchTo(). alert(). accept();
    }
    public String getMonit(){
        return driver.switchTo().alert().getText();
    }
    public void setRefresh(){
        driver.navigate().refresh();
    }
}
