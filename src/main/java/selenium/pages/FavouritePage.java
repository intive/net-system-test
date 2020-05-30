package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FavouritePage {
    private WebDriver driver;

    private By myProfile = By.xpath("/html/body/app/nav/ul/li[4]/a");
    private By favourite1 = By.xpath("/html/body/app/div[2]/div/div/table/tbody/tr[2]/td[1]/a/span");//pierwsza para
    private By favourite2=By.xpath("/html/body/app/div[2]/div/div/table/tbody/tr[5]/td[1]/a/span");//druga para
    private By myFavourite = By.xpath("//*[@id=\"exTab3\"]/ul/li[1]/a");
    private By deleteFavourite=By.xpath("//*[@id=\"1b\"]/table/tbody/tr[1]/td[1]/a/span"); //usunięcie z listy
    private By deletePair = By.xpath("/html/body/app/div[2]/div/div/table/tbody/tr[5]/td[1]/a/span"); //usunięcie z dashboard
    private By dashboard = By.xpath("/html/body/app/nav/ul/li[1]/a");
    private By checkFavourite =By.xpath("/html/body/app/nav/ul/li[2]/a");
    private By delete = By.xpath("//*[@id=\"1b\"]/div/nav/ul/li[1]");


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

    public String getMessage(){
            return driver.findElement(checkFavourite).getText();
    }

    public String getMessageDelete(){
        return driver.findElement(delete).getText();
    }
}
