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
    private By confirmButton = By.xpath("//*[@id=\"innerContainer\"]/div[8]/button[2]");
    private By emailAlert = By.xpath("/html/body/app/div[2]/div/div/table/tbody/tr[6]/td[5]/button");
    private By emailValue =By.id("email");
    private By textEmail=By.id("message");
    private By pause=By.xpath("//*[@id=\"innerContainer\"]");
    private By check =By.xpath("/html/body/app/div[2]/div/h1");

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

    public void setEmailValue(){
        driver.findElement(emailValue).clear();
        driver.findElement(emailValue).sendKeys("testPATRON20@gmail.com");
    }

    public void setMessage(){
        driver.findElement(textEmail).clear();
        driver.findElement(textEmail).sendKeys("testowanie");
    }

    public String getMessage() {
        return driver.findElement(check).getText();
    }
}

