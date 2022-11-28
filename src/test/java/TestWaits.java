
import lv.acodemy.constants.Generic;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import org.testng.annotations.AfterMethod;
        import org.testng.annotations.BeforeMethod;
        import org.testng.annotations.Test;

        import java.time.Duration;
        import java.util.List;
        import java.util.Set;

        import static lv.acodemy.constants.Generic.GOOGLE_URL;
        import static lv.acodemy.constants.Generic.SAUCE_URL;

public class TestWaits {

    ChromeDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void before() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testWaiter() {
        driver.get(GOOGLE_URL);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("element_that_is_not_in_place")));
    }

    @AfterMethod
    public void after() {
        driver.close();
        driver.quit();
    }
}