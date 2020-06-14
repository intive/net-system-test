import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.BetsPage;

public class CreateBetsTest extends TestBase {

    @Test(groups = "loginRequired")
    public void betsTest() {
        BetsPage bets = new BetsPage(driver);
        bets.setBetButton();
        Assert.assertTrue(bets.getBetsForm().contains("Place a bet"), "There is not a bets form");
        bets.setPoints();
        bets.setLowerValue();
        Assert.assertTrue(bets.getBetType().contains("Standard"),"Bet type is not available");
        bets.setDuration();
        bets.setOption();
        Assert.assertTrue(bets.getDuration().contains("Two Days"), "Duration selection is not available");
        bets.setConfirm();
        bets.setBets();
        bets.setMyBets();
        bets.setResult();
        Assert.assertEquals(bets.getTableSize(), 5, "Table size is different than expected");
    }
}