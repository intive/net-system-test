package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.base.TestCommons;

public class FavouritePage extends TestCommons {
    private WebDriver driver;

    private By myProfile = By.xpath("/html/body/app/div[2]/div[2]/ul/li[2]/a");
    private By favourite1 = By.xpath("/html/body/app/div[3]/div[2]/table/tbody/tr[3]/td[1]/a/span");//pierwsza para
    private By favourite2=By.xpath("/html/body/app/div[3]/div[2]/table/tbody/tr[6]/td[1]/a/span");//druga para
    private By myFavourite = By.xpath("/html/body/app/div[3]/div[2]/div[2]/div/button[2]");
    private By deleteFavourite=By.xpath("/html/body/app/div[3]/div[2]/table/tbody/tr[1]/td[1]/a/span"); //usunięcie z listy
    private By deletePair = By.xpath("/html/body/app/div[3]/div[2]/table/tbody/tr[6]/td[1]/a/span"); //usunięcie z dashboard
    private By dashboard = By.xpath("/html/body/app/div[2]/div[2]/ul/li[1]/a");

    public FavouritePage (WebDriver driver) {
        this.driver = driver;
    }

    public void setMyProfile() {
        driver.findElement(myProfile).click();
    }

    public void setFavourite1(){
        driver.findElement(favourite1).click();
    }

    public void setFavourite2(){
        driver.findElement(favourite2).click();
    }

    public void setMyFavourite(){
        driver.findElement(myFavourite).click();
    }

    public void setDeleteFavourite() {driver.findElement(deleteFavourite).click();}

    public void setDeletePair() {driver.findElement(deletePair).click();}

    public void setDashboard(){
        driver.findElement(dashboard).click();
    }
}
