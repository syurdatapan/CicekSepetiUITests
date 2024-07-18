package Pages;

import Base.BaseLibrary;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends BaseLibrary {

    @Step("Anasayfanın yüklendiği kontrol edilir.")
    public HomePage goToHome() {
        driver.get(siteUrl);
        driver.findElement(By.xpath("(//button[@class='home-page-switch__button'])[1]")).click();
        String url = driver.getCurrentUrl();
        screenshot();
        Assert.assertEquals(url, siteUrl);
        return this;
    }

    @Step("Kabul et butonuna tıklanır")
    public void clickOneTrustBtn() {
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
    }
}
