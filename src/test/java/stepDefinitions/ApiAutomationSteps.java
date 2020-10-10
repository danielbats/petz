package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import org.junit.Assert;
import utilities.RestAssuredExtension;

public class ApiAutomationSteps {

    private static ResponseOptions<Response> response;

    @Given("^I send a GET request for (.*) (.*)")
    public void iSendAGetRequestForXCity(String city, String country){
        String endpoint = "http://api.openweathermap.org/data/2.5/weather?q="+city+","+country+"&appid=129d67de4256bc27633d5bc9606a85f2&units=metric";
        response = RestAssuredExtension.GetOps(endpoint);
        assert response != null;
        response.getStatusCode();
    }

    @Then("^I verify the response code is (.*)$")
    public void iVerifyTheResponseCodeIsX(int code){
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,code);
        System.out.println("-----------------------------------------------");
        System.out.println("Response Status Code: "+response.getStatusCode());
    }

    @Then("^I should see the current weather for (.*)$")
    public void iShouldSeeTheCurrentWeatherForX(String city){
        Assert.assertEquals(response.getBody().jsonPath().get("name"),city);
        System.out.println("The current temperature in "+city+" is "+response.getBody().jsonPath().get("main.temp")+"ºC.");
        System.out.println("The thermal sensation (feels like) is "+response.getBody().jsonPath().get("main.feels_like")+"ºC.");
        System.out.println("The relative air humidity is about "+response.getBody().jsonPath().get("main.humidity")+"%.");
    }
}
