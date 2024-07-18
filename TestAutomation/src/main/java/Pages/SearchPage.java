package Pages;

import Base.BaseLibrary;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SearchPage extends BaseLibrary {

    @Step("Arama terimi kontrol edilir")
    public SearchPage checkSearchTerm() throws InterruptedException {
        sleep(2000);
        WebElement searchElementText = driver.findElement(By.xpath("//h1"));
        Assert.assertEquals(searchElementText.getText(),searchTerm);
        return this;
    }
}
