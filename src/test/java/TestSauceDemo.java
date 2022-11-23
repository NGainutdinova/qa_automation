import lv.acodemy.constants.Generic;
import lv.acodemy.page_objects.InventoryPage;
import lv.acodemy.page_objects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSauceDemo {

    ChromeDriver driver;
    LoginPage loginPage;
    InventoryPage inventoryPage;

    @BeforeMethod
    public void initializeDriver() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
    }

    @Test
    public void authorizeTest() {
        driver.get(Generic.SAUCE_URL);
        loginPage.authorize("standard_user", "secret_sauce");
        Assert.assertEquals(inventoryPage.getTitleElement().getText(),"PRODUCTS");
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
