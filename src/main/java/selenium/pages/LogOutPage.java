package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOutPage {
    private WebDriver driver;

    private By logoutButton = By.xpath("/html/body/app/nav/ul/li[6]/button/p");
    private By check = By.xpath("/html/body/app/div/div/div/div/div/h5");

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
