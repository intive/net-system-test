package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

public class HistoryView {
    protected WebDriver driver;
    private final String url = "https://dev-patronage-btb.azurewebsites.net/";

    @BeforeSuite
    public void setChromedriverPath() {
        System.setProperty("webdriver.chrome.driver","D:\\Patronage 2020\\Repo\\BitCoiny\\patronage-qa-bitcoiny\\bitcoiny\\chromedriver.exe");
    }


}
