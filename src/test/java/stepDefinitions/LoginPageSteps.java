package stepDefinitions;

import core.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;


public class LoginPageSteps extends TestBase {

    private LoginPage loginPage;

    public LoginPageSteps(){
        this.loginPage = new LoginPage();
    }

    @Then("^I can see the Login Page$")
    public void iCanSeeTheLoginPage(){
        Assert.assertTrue(loginPage.verifyLoginPageIsDisplayed());
    }

    @And("^I click on (.*) button$")
    public void iClickOnXButton(String buttonID){
        clickButton(buttonID);
    }

    @And("^I sign into my Petz account$")
    public void iSignIntoMyPetzAccount(){
        loginPage.loginAccount();
    }

    @And("^I fill out (.*) field with (.*) value$")
    public void iFillOutXFieldWithXValue(String field, String value){
        loginPage.setText(field,value);
    }

    @Then("^I remove the product from the chart$")
    public void iRemoveTheProductFromThChart(){
    }

    @When("^I fill out email field with (.*)$")
    public void iFillOutEmailFieldWithValue(String email){
        loginPage.setEmail(email);
    }

}
