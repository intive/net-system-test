import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.FavouritePage;

public class FavouritePairTest extends TestBase {

    @Test(groups = "loginRequired")
    public void favouritePairTest(){
        FavouritePage favourite=new FavouritePage(driver);
        favourite.setMyProfile();
        favourite.setMyFavourite();
        favourite.setDashboard();
        favourite.setFavourite1();
        Assert.assertEquals(favourite.getGoldenStar(),"★","Selected pair has already deleted or not set as a favourite");
        favourite.setFavourite2();
        favourite.setMyProfile();
        Assert.assertEquals(favourite.getMessage(), "✖","No favourite pair was set");
    }
}
