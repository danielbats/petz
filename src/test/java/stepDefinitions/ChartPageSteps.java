package stepDefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ChartPage;

public class ChartPageSteps {

    private ChartPage chartPage;

    public ChartPageSteps(){
        this.chartPage = new ChartPage();
    }

    @When("^I remove the product from my chart$")
    public void iRemoveTheProductFromMyChart(){
        chartPage.removeProductFromChart();
    }

    @Then("^I verify that I can see my chart and the (.*) with (.*) is added$")
    public void iVerifyThatICanSeeMyChartAndTheProductIsAdded(String product, String size){
        chartPage.verifyProductOnChart(product,size);
    }

    @Then("^I verify that my chart is empty$")
    public void iVerifyThatMyChartIsEmpty(){
        chartPage.isChartEmpty();
    }

}
