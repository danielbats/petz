package stepDefinitions;

import core.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;

public class HomePageSteps extends TestBase {

    private HomePage homePage;

    public HomePageSteps(){
        this.homePage = new HomePage();
    }

    @Then("^I verify that I'm logged in (.*) Petz account$")
    public void iVerifyThatImLoggedInXPetzAccount(String userName){
        Assert.assertTrue(homePage.checkLoggedUser(userName));
    }

    @Given("^I search for (.*) product$")
    public void iSearchForItemProduct(String product){
        homePage.typeSearch(product);
        homePage.submitSearch();
    }

}
