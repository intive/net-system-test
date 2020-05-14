import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.FavouritePage;

public class DeleteFavourite extends TestBase {

    @Test(groups = "loginRequired")

    public void deleteFavourite() throws InterruptedException {
        FavouritePage favourite = new FavouritePage(driver);

        favourite.setMyProfile();
        favourite.setMyFavourite();
        Thread.sleep(1000); //bez tego test nie przechodzi
        favourite.setDeleteFavourite();
        favourite.setDashboard();
        Thread.sleep(1000); //bez tego test nie przechodzi
        favourite.setDeletePair();

        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app/div[3]/div[2]/h1")).getText().equals("Dashboard"));
    }
}
