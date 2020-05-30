package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditPage {
    private WebDriver driver;

    private By profileButton = By.xpath("/html/body/app/nav/ul/li[4]/a");
    private By editButton = By.xpath("/html/body/app/div[2]/div/div[1]/div/div[2]/div[3]/a");
    private By editUsername = By.id("username");
    private By editBio = By.id("profileBio");
    private By editFavourite = By.id("favouritePair");
    private By option = By.xpath("//*[@id=\"favouritePair\"]/option[3]"); //NEOBTC
    private By changesButton =By.xpath("/html/body/app/div[2]/div/div/div[1]/form/div[4]/div/div/div[1]/button");
    private By check =By.cssSelector("body > app > nav > ul > li:nth-child(2) > a");


   public EditPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickProfile() {
        driver.findElement(profileButton).click();
    }

    public void clickEdit() {
        driver.findElement(editButton).click();
    }

    public void setEditUsername(String strUsername){
         driver.findElement(editUsername).clear();
         driver.findElement(editUsername).sendKeys(strUsername);
    }

    public void setEditBio(String strBio) {
         driver.findElement(editBio).clear();
         driver.findElement(editBio).sendKeys(strBio);
    }

    public void setEditFavourite (){
        WebElement dropdownButton = driver.findElement(editFavourite);
        dropdownButton.click();
     }
    public void setOption() {
        WebElement emailOption = driver.findElement(option);
        emailOption.click();
    }
    public void clickChanges(){
    driver.findElement(changesButton).click();
    }

    public void editProfile() {
        this.setEditUsername("Ala123");
        this.setEditBio("test no.3");
        this.setEditFavourite();
        this.setOption();
        this.clickChanges();
    }

    public String getMessage() {
        return driver.findElement(check).getText();
    }
}



