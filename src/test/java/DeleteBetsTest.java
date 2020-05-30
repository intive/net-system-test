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
        bets.setOk();

        Assert.assertEquals(bets.getMessage(), "User");
    }
}
