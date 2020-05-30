package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BetsPage {
    private WebDriver driver;

    private By betButton = By.xpath("/html/body/app/div[2]/div/div/table/tbody/tr[1]/td[6]/button");
    private By points = By.id("points");
    private By lowerValue = By.id("lowerValue");
    private By duration = By.xpath("//*[@id=\"timeInterval\"]");
    private By confirm = By.xpath("/html/body/app/div[1]/div[2]/div/div/div/form/div[6]/button[2]");
    private By bets = By.xpath("/html/body/app/nav/ul/li[5]/a");
    private By myBets = By.xpath("/html/body/app/div[2]/div/div/div/button");
    private By editBets = By.xpath("//*[@id=\"bets-table\"]/tbody/tr[3]/td[9]/button[1]/span");
    private By deleteBets = By.xpath("//*[@id=\"bets-table\"]/tbody/tr[4]/td[9]/button[2]/span");
    private By change = By.xpath("//*[@id=\"points\"]"); //points
    private By changeButton = By.xpath("/html/body/app/div[1]/div[2]/div/div/div/form/div[6]/button[2]");
    private By check = By.xpath("//*[@id=\"bets-table\"]/thead/tr/th[2]");

    public BetsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setBetButton(){
        driver.findElement(betButton).click();
    }
     public void setPoints(){
        driver.findElement(points).sendKeys("20");
    }

    public void setEditPoints(){
        driver.findElement(change).clear();
        driver.findElement(change).sendKeys("15");
    }

    public void setLowerValue(){
        driver.findElement(lowerValue).sendKeys("3");
    }

    public void setDuration(){
        WebElement dropdownButton = driver.findElement(duration);
        dropdownButton.click();
    }
    public void setOption(){
       new Select(driver.findElement(By.id("timeInterval"))).selectByVisibleText("Two Days");
    }
    public void setConfirm(){
        driver.findElement(confirm).click();
    }

    public void setChangeButton(){
        driver.findElement(changeButton).click();
    }

    public void setBets(){
        driver.findElement(bets).click();
    }

    public void setMyBets(){
        driver.findElement(myBets).click();
    }

    public void setEditBets(){
        driver.findElement(editBets).click();
    }

    public void setDeleteBets(){
        driver.findElement(deleteBets).click();
    }

    public void setOk(){
        driver.switchTo(). alert(). accept();
    }

    public String getMessage(){
        return driver.findElement(check).getText();
    }
}
