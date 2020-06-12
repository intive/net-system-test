package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangePasswordPage {
    private WebDriver driver;
    private By profileButton = By.cssSelector("a[href*='userprofile']");
    private By editButton = By.cssSelector("a[href*='editprofile']");
    private By changePasswordButton = By.cssSelector("a[href*='changepassword']");
    private By currentPassword =By.id("currentPassword");
    private By newPassword = By.id("newPassword");
    private By newPasswordConfirmation  =By.id("newPasswordConfirmation");
    private By confirmButton = By.cssSelector(".btn.btn-primary");
    private By forwardButton = By.cssSelector(".btn.btn-success");
    private By check =By.cssSelector("body > app > div > div > div > div > div > h5");
    private By passwordForm = By.cssSelector(".text-center");
    private By monit = By.id("innerContainer");

    public ChangePasswordPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickProfile() {
        driver.findElement(profileButton).click();
    }
    public void clickEdit() {
        driver.findElement(editButton).click();
    }
    public void clickChange() {
        driver.findElement(changePasswordButton).click();
    }
    public void setCurrentPassword(String strCurrentPassword) {
        driver.findElement(currentPassword).clear();
        driver.findElement(currentPassword).sendKeys(strCurrentPassword);
    }
    public void setNewPassword(String strNewPassword) {
        driver.findElement(newPassword).clear();
        driver.findElement(newPassword).sendKeys(strNewPassword);
    }
    public void setNewPasswordConfirmation(String strNewPasswordConfirmation){
        driver.findElement(newPasswordConfirmation).clear();
        driver.findElement(newPasswordConfirmation).sendKeys(strNewPasswordConfirmation);
    }
    public void clickConfirm() {
        driver.findElement(confirmButton).click();
    }
    public void clickForward() {
        driver.findElement(forwardButton).click();
    }
    public void passwordChange() {
        this.setCurrentPassword("test1234");
        this.setNewPassword("Ala1");
        this.setNewPasswordConfirmation("Ala1");
        this.clickConfirm();
    }
    public String getMessage() {
        return driver.findElement(check).getText();
    }
    public String getForm() {
        return driver.findElement(passwordForm).getText();
    }
    public String getMonit() {
        return driver.findElement(monit).getText();
    }
}
