package stepDefinitions;

import core.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ProductPage;

public class ProductsPageSteps extends TestBase {

    private ProductPage productPage;

    public ProductsPageSteps(){
        this.productPage = new ProductPage();
    }

    @When("^I select the (.*) for the product$")
    public void iSelectTheXForTheProduct(String size){
        Assert.assertTrue(productPage.selectSizeOption(size));
    }

    @And("^I verify it's available on the stock$")
    public void iVerifyItsAvailableOnTheStock(){
        productPage.isProductOnStock();
    }

    @And("^I add the product to my chart$")
    public void iAddTheProductToMyChart(){
        productPage.addProductToChart();
    }

}
