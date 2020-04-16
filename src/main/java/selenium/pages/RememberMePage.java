package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.base.TestCommons;

public class RememberMePage extends TestCommons {
    private WebDriver driver;

    private By login = By.id("inputUsername");
    private By password = By.id("inputPassword");
    private By submitButton = By.xpath("/html/body/app/div/div/div/div/div[2]/form/button");

    public RememberMePage(WebDriver driver)  {
        this.driver = driver;
    }

    public void setLogin(String strLogin){

        driver.findElement(login).clear();
        driver.findElement(login).sendKeys(strLogin);
    }

    public void setPassword(String strPassword){
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(strPassword);
    }

    public void clickSignIn() {
        driver.findElement(submitButton).click();
    }

    public void setRememberMe(){
        WebElement checkbox = driver.findElement(By.id("inputRememberMe"));
        checkbox.click();
    }

    public void signIn(String strLogin, String strPassword) {
        this.setLogin(strLogin);
        this.setPassword(strPassword);


    }

}

