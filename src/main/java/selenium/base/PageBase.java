package selenium.base;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class PageBase {
    public WebDriver driver;
    public WebDriverWait wait;
    static final int duration = 60;
    public PageBase(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, duration);
        PageFactory.initElements((driver), this);
    }
    protected void clickWhenReady(By locator) {
        WebElement element;
        WebDriverWait wait = new WebDriverWait(driver, duration);
        element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        wait.ignoring(NoSuchElementException.class);
        element.click();
    }
    protected void getWhenVisible(By locator) {
        WebElement element;
        WebDriverWait wait = new WebDriverWait(driver, duration);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.getText();
    }
}

