package pages;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ChartPage extends TestBase {

    @FindBy(xpath = "//*[@class='minha-sacola' and contains(text(),'Meu Carrinho')]")
    WebElement myChartTitle;

    @FindBy(xpath = "//i[@class='delete-item-pedido fa fa-times']")
    WebElement removeProductChart;

    @FindBy(xpath = "//*[contains(text(),'Seu carrinho está vazio')]")
    WebElement emptyChart;

    @FindBy(xpath = "//*[@class='opt_radio opt_radio_variacao' and @checked]")
    WebElement sizeChecked;

    String emptyChartXPATH = "//*[contains(text(),'Seu carrinho está vazio')]";

    String productOnChartXPATH = "//*[@class='td-resumo']/*[contains(text(),'";

    //Initializing the Page Objects
    public ChartPage(){
        PageFactory.initElements(driver,this);
    }

    //Methods
    public boolean verifyProductOnChart(String product, String size){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(productOnChartXPATH+product+" - "+size+"')]")));
        return getElement(By.xpath(productOnChartXPATH+product+" - "+size+"')]")).isDisplayed();
    }

    public void removeProductFromChart(){
        clickButton(removeProductChart);
    }

    public boolean isChartEmpty(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(emptyChartXPATH)));
        return emptyChart.isDisplayed();
    }

}
