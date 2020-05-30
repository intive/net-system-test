package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteAlertPage {
    private WebDriver driver;

    private By myProfile = By.xpath("/html/body/app/nav/ul/li[3]/a");
    private By myAlerts = By.xpath("//*[@id=\"exTab3\"]/ul/li[2]/a");
    private By delete = By.xpath("//*[@id=\"2b\"]/div[3]/div[1]/div[2]/button[2]/span"); //ścieżka do wybranego alertu
    private By check =By.xpath("//*[@id=\"exTab3\"]/ul/li[2]/a");


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

    public String getMessage() {
        return driver.findElement(check).getText();
    }
}
