import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.FavouritePage;

public class DeleteFavouriteTest extends TestBase {

    @Test(groups = "loginRequired")
    public void deleteFavourite() throws InterruptedException {
        FavouritePage favourite = new FavouritePage(driver);

        Thread.sleep(5000);
        favourite.setMyProfile();
        favourite.setMyFavourite();
        Thread.sleep(1000); //bez tego test nie przechodzi
        favourite.setDeleteFavourite();
        favourite.setDashboard();
        Thread.sleep(1000); //bez tego test nie przechodzi
        favourite.setDeletePair();
        favourite.setMyProfile();
        favourite.setMyFavourite();

        Assert.assertEquals(favourite.getMessageDelete(), "First");

    }
}
