package Pages;

import Base.BaseLibrary;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;


public class LoginPage extends BaseLibrary {

    @Step("Giriş sayfasına gidilir")
    public LoginPage goToPage() {
        driver.findElement(By.xpath("(//div[@class='header__user-menu-desktop__popover-link'])[2]")).click();
        return this;
    }

    @Step("Cludflare varsa tıklanır")
    public LoginPage clickCloudflare() throws InterruptedException {
        try {
            sleep(60000);
            WebElement cfElement = driver.findElement(By.cssSelector(".cb-lb input"));
            if (cfElement.isDisplayed()) {
                cfElement.click();
            }
        } catch (NoSuchElementException e) {
        }
        return this;
    }

    @Step("Email alanı doldurulur")
    public LoginPage fillEmail() {
        WebElement inputEmail = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
        inputEmail.sendKeys(email);
        return this;
    }

    @Step("Şifre alanı doldurulur")
    public LoginPage fillPassword() {
        WebElement inputPassword = driver.findElement(By.xpath("(//input[@name='password'])[1]"));
        inputPassword.sendKeys(password);
        return this;
    }

    @Step("Giriş yap butonuna tıklanır")
    public LoginPage clickLogin() {
        screenshot();
        driver.findElement(By.xpath("//button[@class=' login-form_submitButton']")).click();
        return this;
    }

}
