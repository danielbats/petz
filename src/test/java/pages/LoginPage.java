package pages;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginPage extends TestBase {

    @FindBy(xpath ="//*[@id='loginCliente']//*[contains(text(),'Faça seu Login')]")
    WebElement facaSeuLogin;

    String facaSeuLoginXPATH = "//*[@id='loginCliente']//*[contains(text(),'Faça seu Login')]";

    @FindBy (xpath = "//*[@value='Entrar']")
    WebElement signInButton;

    @FindBy (xpath = "//*[@id='label-login-form']/../*[@id='email']")
    WebElement emailField;

    //Initializing the Page Objects
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    //Methods
    public void setText(String id, String value){
        write(id,value);
    }

    public void setEmail(String value){
        write(emailField,value);
    }

    public boolean verifyLoginPageIsDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(facaSeuLoginXPATH)));
        return facaSeuLogin.isDisplayed();
    }

    public HomePage loginAccount(){
        signInButton.click();
        return new HomePage();
    }

}
