import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.FavouritePage;

public class FavouritePairTest extends TestBase {

    @Test(groups = "loginRequired")

    public void favouritePairTest() throws InterruptedException {
        FavouritePage favourite=new FavouritePage(driver);

        favourite.setFavourite1();
        favourite.setFavourite2();
        favourite.setMyProfile();
        favourite.setMyFavourite();

        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/div[3]/h1")).getText().equals("My Favorites"));
    }
}
