package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditPage {
    private WebDriver driver;
    private By profileButton = By.cssSelector("a[href*='userprofile']");
    private By editButton = By.cssSelector("a[href*='editprofile']");
    private By editUsername = By.id("username");
    private By editBio = By.id("profileBio");
    private By editFavourite = By.id("favouritePair");
    private By option = By.cssSelector("#favouritePair > option:nth-child(4)"); //GASBTC
    private By changesButton =By.cssSelector(".btn.btn-primary");
    private By check =By.cssSelector("body > app > div.container > div > div.jumbotron > div > div.text-center > h1");
    private By profileCheck = By.cssSelector(".col-12.col-lg-3.col-xl-3");
    private By editCheck = By.cssSelector(".text-center");

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
    public String getProfile() {
        return driver.findElement(profileCheck).getText();
    }
    public String getEdit() {
        return driver.findElement(editCheck).getText();
    }
}



