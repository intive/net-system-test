package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountPage {
    private WebDriver driver;

    private By createButton = By.xpath("/html/body/app/div/div/div/div/div[2]/form/a/h6");
    private By enterUsername = By.id("inputUsername");
    private By password = By.id("inputPassword");
    private By confirmPassword = By.id("inputPasswordConfirm");
   // private By rememberButton=By.id("inputRememberMe");
    private By createAccountButton = By.xpath("/html/body/app/div/div/div/div/div[2]/form/button");




    public CreateAccountPage (WebDriver driver) {
        this.driver = driver;
    }

        public void clickCreate() {
        driver.findElement(createButton).click();

    }
    public void setEnterUsername(String strEnterUsername){

        driver.findElement(enterUsername).clear();
        driver.findElement(enterUsername).sendKeys(strEnterUsername);
    }

    public void setPassword(String strPassword){
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(strPassword);
    }

    public void setConfirmPassword(String strConfirmPassword){
        driver.findElement(confirmPassword).clear();
        driver.findElement(confirmPassword).sendKeys(strConfirmPassword);
    }
   // public void clickRememberMe() {
   // driver.findElement(rememberButton).click();

       // WebElement checkbox = driver.findElement(By.id("inputRememberMe"));
       // checkbox.click();
   //  }

    public void clickCreateAccount() {
        driver.findElement(createAccountButton).click();
    }


    public void createAccount (String strEnterUsername, String strPassword, String strConfirmPassword) {
        this.clickCreate();
        this.setEnterUsername(strEnterUsername);
        this.setPassword(strPassword);
        this.setConfirmPassword(strConfirmPassword);
      //  this.clickRememberMe();
        this.clickCreateAccount();

    }

}
