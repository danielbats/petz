package pages;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends TestBase {

    @FindBy(xpath ="//*[contains(text(),'Buscar')]")
    WebElement searchButton;

    @FindBy(xpath ="//*[@id='search']")
    WebElement searchField;

    String loggedUser = "//*[@class='log-in logado']//*[contains(text(),";

    //Initializing the Page Objects
    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    //Methods
    public boolean checkLoggedUser(String userName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loggedUser+userName+")]")));
        return getElement(By.xpath(loggedUser+userName+")]")).isDisplayed();
    }

    public ProductPage submitSearch(){
        searchButton.click();
        return new ProductPage();
    }

    public void typeSearch(String searchText){
        searchField.clear();
        searchField.sendKeys(searchText);
    }

}
