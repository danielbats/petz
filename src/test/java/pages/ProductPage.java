package pages;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPage extends TestBase {

    @FindBy (xpath = "//*[@class='is_available']")
    WebElement onStock;

    @FindBy (xpath = "//*[@id='adicionarAoCarrinho']")
    WebElement addToChart;

    private String addToChartXPATH = "//*[@id='adicionarAoCarrinho']";

    private String onStockXPATH = "//*[@class='is_available']";

    private String productSize = "//*[@class='opt_radio_variacao']//*[contains(.,'";

    //Initializing the Page Objects
    public ProductPage(){
        PageFactory.initElements(driver,this);
    }

    //Methods
    public Boolean selectSizeOption(String size){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(productSize+size+"')]/../..")));
        clickButton(By.xpath(productSize+size+"')]/../.."));
        return isSizeSelected(wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(productSize+size+"')]/input[@checked]")))));
    }

    public boolean isProductOnStock(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(onStockXPATH)));
        return onStock.isDisplayed();
    }

    public boolean isSizeSelected(WebElement element){
        return element.isSelected();
    }

    public ChartPage addProductToChart(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(addToChartXPATH)));
        clickButton(addToChart);
        return new ChartPage();
    }

}
