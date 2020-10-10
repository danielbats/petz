package pages;

import core.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.openqa.selenium.By.xpath;

public class StorePage extends TestBase {

    @FindBy(xpath ="//*[contains(text(),'Faça seu login ou cadastre-se')]")
    WebElement loginLink;

    @FindBy(xpath ="//*[@class='log-in naoLogado']//*[contains(text(),'Cadastre-se')]")
    WebElement cadastreSeOption;

    @FindBy(xpath ="//*[@class='log-in naoLogado']//*[contains(text(),'Login')]")
    WebElement loginOption;

    private String loginLinkXPATH = "//*[contains(text(),'Faça seu login ou cadastre-se')]";

    //Initializing the Page Objects
    public StorePage(){
        PageFactory.initElements(driver,this);
    }

    // Methods
    public boolean verifyLoginLinkIsDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath(loginLinkXPATH)));
        return loginLink.isDisplayed();
    }

    public void clickLogin(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath(loginLinkXPATH)));
        loginLink.click();
    }

    public LoginPage clickLoginOption(){
        loginOption.click();
        return new LoginPage();
    }

    public SignUpPage clickSignUpOption(){
        cadastreSeOption.click();
        return new SignUpPage();
    }

}
