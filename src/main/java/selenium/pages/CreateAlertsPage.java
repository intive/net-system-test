package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateAlertsPage {
    private WebDriver driver;

    private By alertButton = By.xpath("/html/body/app/div[2]/div/div/table/tbody/tr[1]/td[5]/button");
    private By conditionButton = By.id("condition");
    private By value = By.id("value");
    private By confirmButton = By.xpath("/html/body/app/div[1]/div[2]/div/div/form/div/div[7]/button[2]");
    private By betweenButton = By.xpath("/html/body/app/div[1]/div[2]/div/div/form/div/div[8]/button[2]");
    private By emailAlert = By.xpath("/html/body/app/div[2]/div/div/table/tbody/tr[6]/td[5]/button");
    private By emailValue =By.id("email");
    private By pause=By.xpath("/html/body/app/div[1]/div[2]/div");
    private By check =By.xpath("/html/body/app/div[2]/div/h1");
    private By lowerValue = By.xpath("//*[@id=\"value\"]");
    private By upperValue = By.xpath("//*[@id=\"additionalValue\"]");

    public CreateAlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAlert() {
        driver.findElement(alertButton).click();
    }

    public void setCondition() {
        driver.findElement(conditionButton).click();
    }

    public void setSelectCondition() {
        Select options = new Select(driver.findElement(By.tagName("select")));
        options.selectByVisibleText("Crossing");
    }

    public void setValueType() {
        Select size = new Select(driver.findElement(By.id("valueType")));
        size.selectByVisibleText("Price");
    }

    public void setValue() {
        driver.findElement(value).clear();
        driver.findElement(value).sendKeys("50");
    }

    public void setConfirmButton() {
        driver.findElement(confirmButton).click();
    }
    public void setBetweenButton() {
        driver.findElement(betweenButton).click();
    }

    public void setPause(){
        driver.findElement(pause).click();
    }


  // alerty z adresem e-mail

    public void setEmailAlert(){
        driver.findElement(emailAlert).click();
    }
    public void setValueType2() {
        Select size = new Select(driver.findElement(By.id("valueType")));
        size.selectByVisibleText("Volume");
    }

    public void setValue2() {
        driver.findElement(value).clear();
        driver.findElement(value).sendKeys("3");
    }

    public void setSendEmail(){
        WebElement checkbox = driver.findElement(By.id("sendEmail"));
        checkbox.click();
    }
    public void setOnlyOnce(){
        WebElement checkbox = driver.findElement(By.id("triggerOnce"));
        checkbox.click();
    }

    public void setEmailValue(){
        driver.findElement(emailValue).clear();
        driver.findElement(emailValue).sendKeys("testPATRON20@gmail.com");
    }

    public void setCrossingUp() {
        Select options = new Select(driver.findElement(By.tagName("select")));
        options.selectByVisibleText("Crossing Up");
    }
    public void setCrossingDown() {
        Select options = new Select(driver.findElement(By.tagName("select")));
        options.selectByVisibleText("Crossing Down");
    }
    public void setBetween() {
        Select options = new Select(driver.findElement(By.tagName("select")));
        options.selectByVisibleText("Between");
    }
    public void setLowerValue() {
        driver.findElement(lowerValue).clear();
        driver.findElement(lowerValue).sendKeys("3");
    }
    public void setUpperValue() {
        driver.findElement(upperValue).clear();
        driver.findElement(upperValue).sendKeys("4");
    }

    public String getMessage() {
        return driver.findElement(check).getText();
    }
}

