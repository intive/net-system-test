package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditPage {
    private WebDriver driver;

    private By profileButton = By.xpath("/html/body/app/div[2]/div[2]/ul/li[2]/a");
    private By editButton = By.xpath("/html/body/app/div[3]/div[2]/div[1]/div/div[2]/div[3]/a");
     private By editUsername = By.id("username");
    private By editBio = By.id("profileBio");
    private By editFavourite = By.id("favouritePair");
    private By changesButton =By.cssSelector("body > app > div.main > div.content.px-4 > div.container > form > div.justify-content-around.row > div:nth-child(2) > button");


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


    public void setEditFavourite(String strFavourite){

    driver.findElement(editFavourite).clear();
    driver.findElement(editFavourite).sendKeys(strFavourite);
     }

    public void clickChanges() {
    driver.findElement(changesButton).click();
    }


    public void editProfile() {

        this.setEditUsername("Ala123");
        this.setEditBio("test no.3");
        this.setEditFavourite("GASBTC");
        this.clickChanges();
    }
}



