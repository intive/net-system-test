package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FavouritePage {
    private WebDriver driver;
    private WebElement results;
    private By myProfile = By.cssSelector("a[href*='userprofile']");
    private By favourite1 = By.cssSelector(".table > tbody > tr:nth-child(3) > td:nth-child(1) > a > span");//pierwsza para
    private By favourite2=By.cssSelector(".table > tbody > tr:nth-child(8) > td:nth-child(1) > a > span");//druga para
    private By myFavourite = By.cssSelector("#exTab3 > ul > li.active.rounded-left > a");
    private By deleteFavourite=By.cssSelector(".table > tbody > tr:nth-child(1) > td:nth-child(1) > a > span"); //usunięcie z listy
    private By dashboard = By.cssSelector("body > app > nav > ul > li:nth-child(2) > a");
    private By checkFavourite =By.cssSelector(".delete-x");
    private By goldenStar = By.cssSelector(".golden-star");
    private By table = By.cssSelector("table");
    private By list = By.cssSelector(".tbody > tr");

    public FavouritePage (WebDriver driver) {
        this.driver = driver;
    }
    public void setMyProfile() {
        driver.findElement(myProfile).click();
    }
    public void setFavourite1(){
        WebDriverWait element = (new WebDriverWait(driver, 80));
        element.until(ExpectedConditions.visibilityOfElementLocated(favourite1));
        driver.findElement(favourite1).click();
    }
    public void setFavourite2(){
        driver.findElement(favourite2).click();
    }
    public void setRefresh(){
        driver.navigate().refresh();
    }
    public void setMyFavourite(){
        driver.findElement(myFavourite).click();
    }
    public void setDeleteFavourite() {driver.findElement(deleteFavourite).click();}
    public void setDeletePair() {
        WebDriverWait element= (new WebDriverWait(driver, 80));
        element.until(ExpectedConditions.visibilityOfElementLocated(favourite2));
        driver.findElement(favourite2).click();
    }
    public void setDashboard(){
        driver.findElement(dashboard).click();
    }
    public String getMessage(){
            return driver.findElement(checkFavourite).getText();
    }
    public String getGoldenStar(){
        return driver.findElement(goldenStar).getText();
    }
    public String getEmptyStar(){
        WebDriverWait element = (new WebDriverWait(driver, 80));
        element.until(ExpectedConditions.visibilityOfElementLocated(favourite2));
        return driver.findElement(favourite2).getText();
    }
    public void setResult() {
        results = driver.findElement(table);
    }
    public int getTableSize() {
        List<WebElement> tableRows = results.findElements(list);
        return tableRows.size();
    }
}
