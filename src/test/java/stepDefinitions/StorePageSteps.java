package stepDefinitions;

import core.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.StorePage;


public class StorePageSteps extends TestBase {

    private StorePage storePage;

    public StorePageSteps(){
        this.storePage = new StorePage();
    }

    @Then("^I verify the log in or sign up link$")
    public void iVerifyTheLogInOrSignUpLink() throws Throwable{
        Assert.assertTrue(storePage.verifyLoginLinkIsDisplayed());
    }

    @When("^I click on Login or Sign Up link$")
    public void iClickOnLoginOrSignUpLink() throws Throwable{
        storePage.clickLogin();
    }

    @And("^I select the Cadastre-se option$")
    public void iSelectTheCadastreSeOption() throws Throwable{
        storePage.clickSignUpOption();
    }

    @And("^I select the Login option$")
    public void iSelectTheLoginOption() throws Throwable{
        storePage.clickLoginOption();
    }

}
