package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RememberMePage {
    private WebDriver driver;
    private By login = By.id("inputUsername");
    private By password = By.id("inputPassword");
    private By submitButton = By.cssSelector(".login_btn");
    private By inputRememberMe = By.id("inputRememberMe");
    private By check = By.cssSelector("body > app > div.container > div > h1");

    public RememberMePage(WebDriver driver)  {
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
    public void setRememberMe(){
        WebElement checkbox = driver.findElement(inputRememberMe);
        checkbox.click();
    }
    public void signIn() {
        this.setLogin("test1234");
        this.setPassword("test1234");
    }
    public String getMessage() {
        return driver.findElement(check).getText();
    }
}

