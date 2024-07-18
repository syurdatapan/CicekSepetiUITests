package Pages;

import Base.BaseLibrary;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AccountPage extends BaseLibrary {

    @Step("Hesabım elementi görüntülenir")
    public void seeMyAccount() {
        WebElement myAccountText = driver.findElement(By.xpath("//span[contains(text(),'Hesabım')]"));
        Assert.assertTrue(myAccountText.isDisplayed());
    }
}
