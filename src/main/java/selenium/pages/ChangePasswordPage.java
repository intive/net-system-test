package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangePasswordPage {
    private WebDriver driver;

    private By profileButton = By.xpath("/html/body/app/nav/ul/li[3]/a");
    private By editButton = By.xpath("/html/body/app/div[2]/div/div[1]/div/div[2]/div[3]/a");
    private By changePasswordButton = By.xpath("/html/body/app/div[2]/div/div/div[2]/div/div/a");
    private By currentPassword =By.id("currentPassword");
    private By newPassword = By.id("newPassword");
    private By newPasswordConfirmation  =By.id("newPasswordConfirmation");
    private By confirmButton = By.xpath("/html/body/app/div[2]/div/div/form/div[5]/div/button");
    private By forwardButton = By.xpath("//*[@id=\"innerContainer\"]/div/button");
    private By check =By.xpath("/html/body/app/div/div/div/div/div/h5");


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
}
