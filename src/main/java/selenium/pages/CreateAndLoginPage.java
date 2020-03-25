package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.IAssert;

public class CreateAndLoginPage {
    private WebDriver driver;

    private By createButton = By.xpath("/html/body/app/div/div/div/div/div[2]/form/a/h6");
    private By enterUsername = By.id("inputUsername");
    private By enterPassword = By.id("inputPassword");
    private By confirmPassword = By.id("inputPasswordConfirm");
    //private By rememberButton=By.id("inputRememberMe");
    private By createAccountButton = By.xpath("/html/body/app/div/div/div/div/div[2]/form/button");
    private By username = By.id("inputUsername");
    private By password = By.id("inputPassword");
    //private By rememberButton=By.id("inputRememberMe");
    private By submitButton = By.xpath("/html/body/app/div/div/div/div/div[2]/form/button");



    public CreateAndLoginPage (WebDriver driver) {
        this.driver = driver;
    }

    public void clickCreate() {
        driver.findElement(createButton).click();

    }
    public void setEnterUsername(String strEnterUsername){

        driver.findElement(enterUsername).clear();
        driver.findElement(enterUsername).sendKeys(strEnterUsername);
    }

    public void setEnterPassword(String strEnterPassword){
        driver.findElement(enterPassword).clear();
        driver.findElement(enterPassword).sendKeys(strEnterPassword);
    }

    public void setConfirmPassword(String strConfirmPassword){
        driver.findElement(confirmPassword).clear();
        driver.findElement(confirmPassword).sendKeys(strConfirmPassword);
    }

    public void clickCreateAccount() {
        driver.findElement(createAccountButton).click();
    }


    public void setUsername(String strUsername){

        driver.findElement(username).clear();
        driver.findElement(username).sendKeys(strUsername);
    }

    public void setPassword(String strPassword){
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(strPassword);
    }
    //public void clickRememberMe() {
    //driver.findElement(rememberButton).click();
    // }

    public void clickSignIn() {
        driver.findElement(submitButton).click();
    }


    public void createAccount (String strEnterUsername, String strEnterPassword, String strConfirmPassword) {
        this.clickCreate();
        this.setEnterUsername(strEnterUsername);
        this.setEnterPassword(strEnterPassword);
        this.setConfirmPassword(strConfirmPassword);
        //this.clickRememberMe();
        this.clickCreateAccount();
    }
   public void login (String strUsername, String strPassword)    {
        this.setUsername(strUsername);
        this.setPassword(strPassword);
        this.clickSignIn();
    }

}


