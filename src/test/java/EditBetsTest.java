import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.BetsPage;

public class EditBetsTest extends TestBase {
    @Test(groups = "loginRequired")
    public void betsDeleteTest() throws InterruptedException{
        BetsPage bets = new BetsPage(driver);

        bets.setBets();
        bets.setMyBets();
        bets.setEditBets();
        bets.setEditPoints();
        Thread.sleep(2000);
        bets.setChangeButton();

        Assert.assertEquals(bets.getMessage(), "User");
    }
}
