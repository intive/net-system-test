package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.base.TestCommons;

public class LoginPage extends TestCommons {

    @FindBy( id = "inputUsername")
    public WebElement usernameInput;
    @FindBy( id = "inputPassword")
    public WebElement passwordInput;
    @FindBy( css = ".btn")
    public WebElement submitButton;

    public LoginPage(WebDriver driver) {
        initElements(driver);
    }


    /*public void signIn (String strLogin, String strPassword) {
      /this.setLogin(strLogin);
       this.setPassword(strPassword);
        this.clickRememberMe();
       this.clickSignIn();*/
    public void signIn (String text){
            sendKeysToElement(usernameInput, text);
            sendKeysToElement(passwordInput, text);
            clickElement(submitButton);
        }
}

