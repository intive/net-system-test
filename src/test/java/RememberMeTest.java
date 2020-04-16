import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.RememberMePage;

public class RememberMeTest extends TestBase {

    @Test
    public void rememberMeTest() throws InterruptedException {

        RememberMePage rememberMe=new RememberMePage(driver);
        rememberMe.signIn("test1234", "test1234");
        rememberMe.setRememberMe();
        rememberMe.clickSignIn();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/h1")).getText().equals("Dashboard"));
    }
}
