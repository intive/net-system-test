package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By login = By.id("inputUsername");
    private By password = By.id("inputPassword");
    private By submitButton = By.cssSelector(".btn.btn-lg.btn-block.login_btn");
    private By check =By.cssSelector("body > app > div.container > div > h1");

    public LoginPage(WebDriver driver)  {
        this.driver = driver;
    }
    public void setLogin(String strLogin){
        driver.findElement(login).clear();
        driver.findElement(login).sendKeys(strLogin);
    }
    public void setPassword(String strPassword){
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(strPassword);
    }
    public void clickSignIn() {
        driver.findElement(submitButton).click();
    }
    public void signIn(String strLogin, String strPassword) {
        this.setLogin(strLogin);
        this.setPassword(strPassword);
        this.clickSignIn();
    }
    public String getMessages() {
        return driver.findElement(check).getText();
    }
}

