import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.FavouritePage;

public class DeleteFavouriteTest extends TestBase {

    @Test(groups = "loginRequired")
    public void deleteFavourite() {
        FavouritePage favourite = new FavouritePage(driver);
        favourite.setMyProfile();
        Assert.assertEquals(favourite.getMessage(), "✖","No favourite pair was set");
        favourite.setDeleteFavourite();
        favourite.setRefresh();
        favourite.setDashboard();
        favourite.setDeletePair();
        favourite.setRefresh();
        Assert.assertEquals(favourite.getEmptyStar(),"☆","Selected pair has already set as a favourite");
        favourite.setMyProfile();
        favourite.setMyFavourite();
        favourite.setResult();
        Assert.assertEquals(favourite.getTableSize(), 0,"Table size is not as expected");
    }
}
