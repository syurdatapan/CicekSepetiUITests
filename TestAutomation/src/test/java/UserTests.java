import Base.BaseTest;
import Pages.AccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SearchPage;
import org.testng.annotations.Test;

public class UserTests extends BaseTest {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    AccountPage accountPage = new AccountPage();
    SearchPage searchPage = new SearchPage();

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
                .clickOneTrustBtn()
                .closePopup();
        loginPage
                .goToPage()
                .clickCloudflare()
                .fillEmail()
                .fillPassword()
                .clickLogin();
        accountPage
                .seeMyAccount();
    }

    @Test(description = "Ürün arama çalışıyor mu?")
    public void searchProduct() throws InterruptedException {
        homePage
                .goToHome()
                .clickOneTrustBtn()
                .closePopup()
                .writeSearchTerm()
                .clickSearchBtn();
        searchPage
                .checkSearchTerm();
    }

}
