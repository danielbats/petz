package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.RestAssuredExtension;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.killDriver;

public class TestBase extends DSL{

    protected WebDriver driver;
    protected WebDriverWait wait = new WebDriverWait(getDriver(), 30);

    public TestBase(){
        this.driver = getDriver();
    }

    public static void initialization(){
        TestApiSetup();
    }
    public static void TestApiSetup(){
        RestAssuredExtension restAssuredExtension = new RestAssuredExtension();
    }

    public static void closeBrowser(){
        killDriver();
    }



}
