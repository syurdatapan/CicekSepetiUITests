package Pages;

import Base.BaseLibrary;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
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
    public HomePage clickOneTrustBtn() {
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
        return this;
    }

    @Step("Popup kapatma varsa tıklanır")
    public HomePage closePopup() throws InterruptedException {
        sleep(5000);
        try {
            WebElement popupElement = driver.findElement(By.xpath("//button[@class='ab-close-button']"));
            if (popupElement.isDisplayed()) {
                popupElement.click();
            }
        } catch (NoSuchElementException e) {
        }
        return this;
    }

    @Step("Arama kutusuna ilgili kelime yazılır")
    public HomePage writeSearchTerm(){
        driver.findElement(By.xpath("//input[@data-actual-select-input='true']")).sendKeys(searchTerm);
        return this;
    }

    @Step("Arama butonuna tıklanır")
    public HomePage clickSearchBtn(){
        driver.findElement(By.xpath("//button[@class='header__search__icon']")).click();
        return this;
    }
}
