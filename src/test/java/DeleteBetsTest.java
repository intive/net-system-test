import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.BetsPage;

public class DeleteBetsTest extends TestBase {
    @Test(groups = "loginRequired")
    public void betsDeleteTest() {
        BetsPage bets = new BetsPage(driver);
        bets.setBets();
        bets.setMyBets();
        bets.setDeleteBets();
        Assert.assertEquals(bets.getMonit(),"Are you sure want to delete this bet?");
        bets.setOk();
        bets.setRefresh();
        bets.setMyBets();
        bets.setResult();
        Assert.assertEquals(bets.getTableSize(), 2);
    }
}
