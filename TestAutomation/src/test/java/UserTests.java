import Base.BaseTest;
import Pages.AccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class UserTests extends BaseTest {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    AccountPage accountPage = new AccountPage();

    @Test(description = "Anasayfa yükleniyor mu?")
    public void loadHome() {
        homePage
                .goToHome()
                .clickOneTrustBtn();
    }

    @Test(description = "Kullanıcı giriş yapabiliyor mu?")
    public void login() throws InterruptedException {
        homePage
                .goToHome()
                .clickOneTrustBtn();
        loginPage
                .closePopup()
                .goToPage()
                .clickCloudflare()
                .fillEmail()
                .fillPassword()
                .clickLogin();
        accountPage
                .seeMyAccount();
    }

}
