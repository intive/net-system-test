package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.base.TestCommons;

public class DeleteAlertPage extends TestCommons {
    private WebDriver driver;

    private By myProfile = By.xpath("/html/body/app/div[2]/div[2]/ul/li[2]/a");
    private By myAlerts = By.xpath("/html/body/app/div[3]/div[2]/div[2]/div/button[1]");
    private By delete = By.xpath("/html/body/app/div[3]/div[2]/div[6]/div[1]/div[2]/button[2]/span"); //ścieżka do wybranego alertu
    private By accept = By.xpath("/html/body/app/div[3]/div[2]/div[2]/div");


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

    public void setAccept(){
        driver.findElement(accept);
    }
}
