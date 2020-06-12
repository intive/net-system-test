package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccountPage {
    private WebDriver driver;
    private By createButton = By.cssSelector("a[href*='register']");
    private By enterUsername = By.id("inputUsername");
    private By enterDisplayName = By.id("inputDisplayName");
    private By email = By.id("inputEmail");
    private By password = By.id("inputPassword");
    private By confirmPassword = By.id("inputPasswordConfirm");
    private By createAccountButton = By.cssSelector(".btn.btn-lg.btn-block.login_btn");
    private By check =By.cssSelector(".card-title.text-center");

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
    public void setEnterDisplayName(String strEnterDisplayUsername){
        driver.findElement(enterDisplayName).clear();
        driver.findElement(enterDisplayName).sendKeys(strEnterDisplayUsername);
    }
    public void setEmail(String strEmail){
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys(strEmail);
    }
    public void setPassword(String strPassword){
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(strPassword);
    }
    public void setConfirmPassword(String strConfirmPassword){
        driver.findElement(confirmPassword).clear();
        driver.findElement(confirmPassword).sendKeys(strConfirmPassword);
    }
    public void clickCreateAccount() {
        driver.findElement(createAccountButton).click();
    }
    public void createAccount (String strEnterUsername,String strEnterDisplayName,String strEmail,String strPassword, String strConfirmPassword) {
        this.clickCreate();
        this.setEnterUsername(strEnterUsername);
        this.setEnterDisplayName(strEnterDisplayName);
        this.setEmail(strEmail);
        this.setPassword(strPassword);
        this.setConfirmPassword(strConfirmPassword);
    }
    public String getMessage() {
        WebDriverWait element = new WebDriverWait(driver,10);
        element.until(ExpectedConditions.urlToBe("https://qa-patronage-btb.azurewebsites.net/login"));
        return driver.findElement(check).getText();
    }
}
