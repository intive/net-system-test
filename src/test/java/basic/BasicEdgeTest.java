package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class BasicEdgeTest {

    @Test
    public void openBrowser () throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "D:\\Patronage 2020\\Repo\\BitCoiny\\patronage-qa-bitcoiny\\bitcoiny\\msedgedriver.exe");
        EdgeOptions options = new EdgeOptions();
        options.setCapability("InPrivate", true);

        WebDriver driver = new EdgeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://dev-patronage-btb.azurewebsites.net");
        Thread.sleep(8000);
        driver.quit();
    }
}
