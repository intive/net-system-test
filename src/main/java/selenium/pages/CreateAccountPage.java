package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {
    private WebDriver driver;

    private By createButton = By.xpath("/html/body/app/div/div/div/div/div/form/div[5]/a");
    private By enterUsername = By.id("inputUsername");
    private By email = By.id("inputEmail");
    private By password = By.id("inputPassword");
    private By confirmPassword = By.id("inputPasswordConfirm");
    private By createAccountButton = By.cssSelector("body > app > div > div > div > div > div > form > div:nth-child(5) > input");
    private By check =By.xpath("/html/body/app/div/div/div/div/div/h5");


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

    public void createAccount (String strEnterUsername,String strEmail,String strPassword, String strConfirmPassword) {
        this.clickCreate();
        this.setEnterUsername(strEnterUsername);
        this.setEmail(strEmail);
        this.setPassword(strPassword);
        this.setConfirmPassword(strConfirmPassword);
        this.clickCreateAccount();
    }

    public String getMessage() {
        return driver.findElement(check).getText();
    }

}
