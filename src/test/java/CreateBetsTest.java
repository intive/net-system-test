import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.BetsPage;

public class CreateBetsTest extends TestBase {

    @Test(groups = "loginRequired")
    public void betsTest() {
        BetsPage bets = new BetsPage(driver);

        bets.setBetButton();
        bets.setPoints();
        bets.setLowerValue();
        bets.setDuration();
        bets.setOption();
        bets.setConfirm();
        bets.setBets();

        Assert.assertEquals(bets.getMessage(), "User");
    }
}