package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOutPage {
    private WebDriver driver;
    private By logoutButton = By.cssSelector(".btn-md");
    private By check = By.cssSelector(".card-title.text-center");

    public LogOutPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickLogout() {
        driver.findElement(logoutButton).click();
    }
    public String getMessage() {
        return driver.findElement(check).getText();
    }
}
