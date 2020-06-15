package selenium.base;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageBase {

    public WebDriver driver;
    public WebDriverWait wait;
    static final int duration = 90;

    public PageBase(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, duration);
    }

    protected void findElementWhenVisible(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void clearElement(By locator) {
        WebElement element;
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
    }

    protected void clickWhenReady(By locator) {
        WebElement element;
        element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        wait.ignoring(NoSuchElementException.class);
        element.click();
    }

    protected String getElementText(By locator) {
        WebElement element;
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element.getText();
    }

    protected Dimension getSizeOfElement(By locator) {
        WebElement element;
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element.getSize();
    }
}