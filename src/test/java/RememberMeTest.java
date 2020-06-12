import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.RememberMePage;

public class RememberMeTest extends TestBase {

    @Test
    public void rememberMeTest() {
        RememberMePage rememberMe=new RememberMePage(driver);
        rememberMe.signIn();
        rememberMe.setRememberMe();
        rememberMe.clickSignIn();
        Assert.assertEquals(rememberMe.getMessage(), "Dashboard");
    }
}
