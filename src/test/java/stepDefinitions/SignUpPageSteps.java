package stepDefinitions;

import core.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SignUpPage;

public class SignUpPageSteps extends TestBase {

    private SignUpPage signUpPage;

    public SignUpPageSteps(){
        this.signUpPage = new SignUpPage();
    }

    @Then("^I can see the new customer page$")
    public void iCanSeeTheNewCustomerPage(){
        Assert.assertTrue(signUpPage.verifySignUpPageIsDisplayed());
    }

    @And("^I select the (.*) gender option$")
    public void iSelectTheXGenderOption(String gender){
        selectComboOption(signUpPage.getGenderSelect(), gender);
    }

    @And("^I fill out DDD and Phone with (.*) and (.*) values$")
    public void iFillOutDDDAndCellPhoneWithXAndXValues(String ddd, String number){
        write(signUpPage.getDddCell(),ddd);
        write(signUpPage.getCellphone(),number);
    }

    @And("^I create the account$")
    public void iCreateTheAccount(){
        signUpPage.createAccount();
    }

    @Then("^I verify that the account is created")
    public void iVerifyThatTheAccountIsCreated(){
        Assert.assertTrue(signUpPage.isAccountCreated());
    }

    @When("^I click on Entendi$")
    public void iClickOnEntendiButton(){
        signUpPage.clickEntendiButton();
    }
}
