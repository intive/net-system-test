import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.BetsPage;

public class EditBetsTest extends TestBase {
    @Test(groups = "loginRequired")
    public void betsDeleteTest(){
        BetsPage bets = new BetsPage(driver);
        bets.setBets();
        bets.setMyBets();
        Assert.assertTrue(bets.getUserBets().contains("Ala123"), "There are bets for present user");
        bets.setEditBets();
        Assert.assertTrue(bets.getEditBets().contains("Update a bet"));
        bets.setEditPoints();
        bets.setType();
        bets.setChangeButton();
        bets.setRefresh();
        bets.setMyBets();
        Assert.assertEquals(bets.getChangePoints(),"♢ 80");
    }
}
