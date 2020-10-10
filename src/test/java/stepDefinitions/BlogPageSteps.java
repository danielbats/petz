package stepDefinitions;

import core.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import pages.BlogPage;
import pages.StorePage;

import static core.DriverFactory.getDriver;


public class BlogPageSteps extends TestBase {

    private BlogPage blogPage;

    public BlogPageSteps(){
        this.blogPage = new BlogPage();
    }

    @Before
    public void openBrowser(){
        initialization();
    }

    @After
    public void killBrowser(){
        closeBrowser();
    }

    @Given("^I access the Petz ecommerce$")
    public StorePage iAccessPetzEcommerce(){
        getDriver().get("https://www.petz.com.br/blog");
        return blogPage.accessEcommerce();
    }
}
