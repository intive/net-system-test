import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.FilterDashboard;

public class IncorrectValueFilterTest extends TestBase {

    FilterDashboard fd;

    @Test(groups = "loginRequired")
    public void testFilterIncorrectValue() throws InterruptedException{

        fd = new FilterDashboard(driver);
        fd.searchFilter("%");
        fd.setPanel();
        fd.clickFilter();
        Assert.assertEquals(fd.getValidation(),"Use letters only please");
    }
}

