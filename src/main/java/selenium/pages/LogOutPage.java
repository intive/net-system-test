package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOutPage {
    private WebDriver driver;

      private By logoutButton = By.xpath("/html/body/app/div[3]/div[1]/button");

    public LogOutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogout() {
        driver.findElement(logoutButton).click();
    }
}
