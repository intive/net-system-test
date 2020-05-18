import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.TestBase;
import selenium.pages.*;

public class BTBTest extends TestBase {

    @Test
    public void BTBTest() throws InterruptedException {
//logowanie
        LoginPage loginPage=new LoginPage(driver);
        loginPage.signIn("test1234", "test1234");
        loginPage.clickSignIn();

//edycja profilu

        EditPage editProfile = new EditPage(driver);
        editProfile.clickProfile();
        editProfile.clickEdit();
        editProfile.editProfile();
        editProfile.clickChanges();

//zmiana hasła

        ChangePasswordPage changePassword = new ChangePasswordPage(driver);

        changePassword.clickProfile();
        changePassword.clickEdit();
        changePassword.clickChange();
        changePassword.passwordChange();
        changePassword.clickForward();


//ustawienie alertu - bez adresu e-mail

        loginPage.signIn("test1234", "Ala1");
        loginPage.clickSignIn();

        CreateAlertsPage createAlerts = new CreateAlertsPage(driver);
        createAlerts.clickAlert();
        createAlerts.setCondition();
        createAlerts.setSelectCondition();
        createAlerts.setValueType();
        createAlerts.setValue();
        createAlerts.setPause();
        createAlerts.setConfirmButton();

        createAlerts.setEmailAlert();
        createAlerts.setCondition();
        createAlerts.setSelectCondition();
        createAlerts.setValueType2();
        createAlerts.setValue2();
        createAlerts.setPause();
        createAlerts.setSendEmail();
        createAlerts.setPause();
        createAlerts.setEmailValue();
        createAlerts.setMessage();
        createAlerts.setConfirmButton();

//edycja alertu

        EditAlertPage editAlert=new EditAlertPage(driver);
        editAlert.setMyProfile();
        editAlert.setMyAlerts();
        editAlert.setAlert();
        editAlert.setValueType();
        editAlert.setValue();
        editAlert.setPause();
        editAlert.setConfirm();

//sortowanie alertów

        SortAlertsPage sortAlert = new SortAlertsPage(driver);
       // sortAlert.setMyProfile();
        sortAlert.setMyAlerts();
        sortAlert.setDropDownButton();
        sortAlert.setOption();
        sortAlert.setExpand();
        sortAlert.setSort1();
        sortAlert.setSort2();
        sortAlert.setCollapse();

//usunięcie alertu

        DeleteAlertPage deleteAlert=new DeleteAlertPage(driver);
       // deleteAlert.setMyProfile();
        //deleteAlert.setMyAlerts();
        deleteAlert.setDelete();
        Thread.sleep(1000); // bez tego test nie przechodzi
        deleteAlert.setAlert();

//ustawienie ulubionych par
        driver.findElement(By.xpath("/html/body/app/nav/ul/li[1]/a")).click();
        Thread.sleep(3000);

        FavouritePage favourite=new FavouritePage(driver);
        favourite.setFavourite1();
        favourite.setFavourite2();
        favourite.setMyProfile();
        favourite.setMyFavourite();

// Delete favourite
        FavouritePage favourite2 = new FavouritePage(driver);

        Thread.sleep(1000); //bez tego test nie przechodzi
        favourite2.setDeleteFavourite();
        favourite2.setDashboard();
        Thread.sleep(1000); //bez tego test nie przechodzi
        favourite2.setDeletePair();
        favourite2.setMyProfile();
        favourite2.setMyFavourite();
//pokaż dashboard
        driver.findElement(By.xpath("/html/body/app/nav/ul/li[1]/a")).click();
        Thread.sleep(3000);
//wyloguj
        LogOutPage logOut=new LogOutPage(driver);
        logOut.clickLogout();


    }

}

