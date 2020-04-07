import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;

public class BTBTest extends TestBase {
    @Test

    public void BTBTest() throws InterruptedException {
//logowanie
        driver.get(url);
        driver.findElement(By.id("inputUsername")).sendKeys("test1234");
        Thread.sleep(1000);
        driver.findElement(By.id("inputPassword")).sendKeys("test1234");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".btn")).click();
        Thread.sleep(2000);

//edycja profilu

        driver.findElement(By.xpath("/html/body/app/div[2]/div[2]/ul/li[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[1]/div/div[2]/div[3]/a")).click();
        // Thread.sleep(2000);
        driver.findElement(By.id("username")).clear();
        //Thread.sleep(1000);
        driver.findElement(By.id("username")).sendKeys("DEMO 11.04");
        //Thread.sleep(2000);
        driver.findElement(By.id("profileBio")).clear();
        //Thread.sleep(1000);
        driver.findElement(By.id("profileBio")).sendKeys("Edycja profilu na potrzeby DEMO");
        //Thread.sleep(2000);
        driver.findElement(By.id("favouritePair")).clear();
        //Thread.sleep(1000);
        driver.findElement(By.id("favouritePair")).sendKeys("NEOBTC");
        //Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div/form/div[4]/div[2]/button")).click();
        Thread.sleep(3000);
//ustawienie alertu - bez adresu e-mail
        driver.findElement(By.xpath("/html/body/app/div[2]/div[2]/ul/li[1]/a")).click();
        //Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/table/tbody/tr[10]/td[5]/button")).click();
        driver.findElement(By.id("condition")).click();
        Select options = new Select(driver.findElement(By.tagName("select")));
        Thread.sleep(1000);
        options.selectByVisibleText("Crossing");
        Select size = new Select(driver.findElement(By.id("valueType")));
        Thread.sleep(4000);
        size.selectByVisibleText("Price");
        driver.findElement(By.id("value")).clear();
        driver.findElement(By.id("value")).sendKeys("0,34");
        //Thread.sleep(2000);
        driver.findElement(By.id("innerDiv")).click();
        driver.findElement(By.cssSelector("#innerDiv > div.text-right > button.btn.btn-success.btn-sm")).click();
        //Thread.sleep(2000);
        driver.findElement(By.cssSelector("body > app > div.sidebar > div.collapse > ul > li:nth-child(1) > a")).click();
        Thread.sleep(3000);
//ustawienie alertu - z adresem e-mail
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/table/tbody/tr[8]/td[5]/button")).click();
        driver.findElement(By.id("condition")).click();
        Select options1 = new Select(driver.findElement(By.tagName("select")));
        //Thread.sleep(2000);
        options1.selectByVisibleText("Crossing");
        Select size1 = new Select(driver.findElement(By.id("valueType")));
        //Thread.sleep(2000);
        size1.selectByVisibleText("Price");
        driver.findElement(By.id("value")).clear();
        //Thread.sleep(2000);
        driver.findElement(By.id("value")).sendKeys("12");
        driver.findElement(By.id("innerDiv")).click();
        //Thread.sleep(2000);

        WebElement checkbox = driver.findElement(By.id("sendEmail"));
        checkbox.click();

        driver.findElement(By.id("innerDiv")).click();
        driver.findElement(By.cssSelector("#innerDiv > div.text-right > button.btn.btn-success.btn-sm")).click();
        //Thread.sleep(2000);
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("testPATRON20@gmail.com");
        //Thread.sleep(2000);
        driver.findElement(By.id("message")).clear();
        driver.findElement(By.id("message")).sendKeys("testowanie");
        //Thread.sleep(2000);
        driver.findElement(By.cssSelector("#innerDiv > div.text-right > button.btn.btn-success.btn-sm")).click();
        Thread.sleep(3000);
//edycja alertu
        driver.findElement(By.xpath("/html/body/app/div[2]/div[2]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[2]/div/button[1]")).click();
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[6]/div[1]/div[2]/button[1]/span")).click();
        Thread.sleep(3000);
        Select size2 = new Select(driver.findElement(By.id("valueType")));
        size2.selectByVisibleText("Trade Count");
        //Thread.sleep(2000);
        driver.findElement(By.id("value")).clear();
        driver.findElement(By.id("value")).sendKeys("60");
        //Thread.sleep(2000);
        driver.findElement(By.id("innerDiv")).click();
        driver.findElement(By.cssSelector("#innerDiv > div.text-right > button.btn.btn-success.btn-sm")).click();
        // driver.findElement(By.xpath("/html/body/app/div[2]/div[2]/ul/li[1]/a")).click();
        Thread.sleep(3000);
//sortowanie alertów
        WebElement dropdownButton = driver.findElement(By.id("dropdownButton"));
        dropdownButton.click();
        Thread.sleep(2000);
        WebElement emailOption = driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[5]/div[1]/div/div/a[5]"));
        emailOption.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[5]/div[2]/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[5]/div[1]/button/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[5]/div[1]/button/span")).click();
        Thread.sleep(2000);
//usunięcie alertu
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[7]/div[1]/div[2]/button[2]/span")).click();
        Thread.sleep(2000);
        driver.switchTo(). alert(). accept();
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[2]/div")).click();
        driver.findElement(By.cssSelector("body > app > div.sidebar > div.collapse > ul > li:nth-child(1) > a")).click();
        Thread.sleep(6000);

//ustawienie ulubionych par
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/table/tbody/tr[3]/td[1]/a/span")).click();
        //Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/table/tbody/tr[6]/td[1]/a/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/app/div[2]/div[2]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[2]/div/button[2]")).click();
        Thread.sleep(6000);
//przełącz na alert/ przełącz na favourites
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[2]/div/button[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[2]/div/button[2]")).click();
        Thread.sleep(4000);
//pokaż dashboard
        driver.findElement(By.xpath("/html/body/app/div[2]/div[2]/ul/li[1]/a")).click();
        Thread.sleep(3000);
//wyloguj
        driver.findElement(By.cssSelector("body > app > div.main > div.top-row.px-4 > button")).click();
        Thread.sleep(4000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app/div/div/div/div/div[2]/h1")).getText().equals("Intive Patronage 2020"));

    }

}

