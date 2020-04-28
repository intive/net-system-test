package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import selenium.base.TestCommons;

public class CreateAlertsPage extends TestCommons {
    private WebDriver driver;

    public By alertButton = By.xpath("/html/body/app/div[3]/div[2]/table/tbody/tr[1]/td[5]/button");
    public By conditionButton = By.id("condition");
    public By value = By.id("value");
    public By confirmButton = By.cssSelector("#innerContainer > div.text-right > button.btn.btn-success.btn-sm");
    private By emailAlert = By.xpath("/html/body/app/div[3]/div[2]/table/tbody/tr[8]/td[5]/button");
    private By emailValue =By.id("email");
    private By textEmail=By.id("message");
    private By pause=By.xpath("/html/body/app/div[1]/div[2]/div");

    public CreateAlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAlert() {
        driver.findElement(alertButton).click();

    }

    public void setCondition() {

        driver.findElement(conditionButton).click();
    }

    public void setSelectCondition()

    {
        Select options = new Select(driver.findElement(By.tagName("select")));
        options.selectByVisibleText("Crossing");

    }

    public void setValueType()

    {
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

}

