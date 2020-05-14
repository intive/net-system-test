import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.LoginPage;

public class LoginPageTest extends TestBase {

    @Test
    public void loginPageTest(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.signIn("test1234", "test1234");
        loginPage.clickSignIn();

        Assert.assertEquals(loginPage.getMessages(), "Dashboard");
    }
}
