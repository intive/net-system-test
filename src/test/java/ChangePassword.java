import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.ChangePasswordPage;
import selenium.pages.EditPage;

public class ChangePassword extends TestBase{


        @Test(groups = "loginRequired")
        public  void testEditPage() throws InterruptedException {
            ChangePasswordPage changePassword = new ChangePasswordPage(driver);

            changePassword.clickProfile();
            changePassword.clickEdit();
            changePassword.clickChange();
            changePassword.passwordChange();
            changePassword.clickForward();

            Assert.assertTrue(driver.findElement(By.xpath("/html/body/app/div/div/div/div/div[2]/h1")).getText().equals("Intive Patronage 2020"));
        }
}
