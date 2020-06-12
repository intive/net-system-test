import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.BetsPage;

public class CreateBetsTest extends TestBase {

    @Test(groups = "loginRequired")
    public void betsTest() {
        BetsPage bets = new BetsPage(driver);
        bets.setBetButton();
        Assert.assertTrue(bets.getBetsForm().contains("Place a bet"), "You can write a bet");
        bets.setPoints();
        bets.setLowerValue();
        Assert.assertTrue(bets.getBetType().contains("Standard"),"Standard option is selected");
        bets.setDuration();
        bets.setOption();
        Assert.assertTrue(bets.getDuration().contains("Two Days"), "Duration option is selected");
        bets.setConfirm();
        bets.setBets();
        bets.setMyBets();
        bets.setResultTable();
        Assert.assertEquals(bets.getResultsTableRowsSize(), 3);
    }
}