package lv.acodemy.step_definition;

import io.cucumber.java.en.Given;
import lv.acodemy.page_objects.ProductsPage;
import lv.acodemy.utils.DriverManager;
import org.openqa.selenium.WebDriver;

public class ProductsPageSteps {
    private final WebDriver driver = DriverManager.getInstance();
    private final ProductsPage productsPage = new ProductsPage();

    @Given("user selects {string} product from a list")
    public void userSelectsProductFromList(String productName) {
        productsPage.clickOnProductByName(productName);

    }
}
