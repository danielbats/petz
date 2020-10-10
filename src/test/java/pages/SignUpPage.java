package pages;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignUpPage extends TestBase {

    @FindBy(xpath = "//a[contains(text(),'Entendi')]")
    WebElement entendiButton;

    @FindBy(xpath = "//*[@class='modal-message']/*[contains(text(),'Dados salvos com sucesso')]")
    WebElement accountCreated;

    private String accountCreatedXPATH = "//*[@class='modal-message']/*[contains(text(),'Dados salvos com sucesso')]";

    @FindBy(xpath ="//*[@name='cliente.dddCelular']")
    WebElement dddCell;

    @FindBy(xpath ="//*[@name='cliente.celular']")
    WebElement cellphone;

    @FindBy(xpath = "//*[@id='Sexo']")
    WebElement genderSelect;

    @FindBy(id = "criarContaButton")
    WebElement criarContaButton;

    @FindBy(xpath ="//h1[contains(text(),'Minha Conta')]")
    WebElement minhaConta;

    //Initializing the Page Objects
    public SignUpPage(){
        PageFactory.initElements(driver,this);
    }

    // Methods
    public WebElement getDddCell() {
        return dddCell;
    }

    public void setDddCell(WebElement dddCell) {
        this.dddCell = dddCell;
    }

    public WebElement getCellphone() {
        return cellphone;
    }

    public void setCellphone(WebElement cellphone) {
        this.cellphone = cellphone;
    }

    public WebElement getGenderSelect() {
        return genderSelect;
    }

    public void setGenderSelect(WebElement genderSelect) {
        this.genderSelect = genderSelect;
    }

    public WebElement getEntendiButton() {
        return entendiButton;
    }

    public WebElement getAccountCreated() {
        return accountCreated;
    }

    public boolean verifySignUpPageIsDisplayed(){
        return minhaConta.isDisplayed();
    }

    public void createAccount(){
        clickButton(criarContaButton);
    }

    public boolean isAccountCreated(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(accountCreatedXPATH)));
        return accountCreated.isDisplayed();
    }

    public HomePage clickEntendiButton(){
        entendiButton.click();
        return new HomePage();
    }

}
