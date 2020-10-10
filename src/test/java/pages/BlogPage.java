package pages;

import core.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.openqa.selenium.By.xpath;

public class BlogPage extends TestBase {

    @FindBy(xpath = "(//a[contains(text(),'Petz.com.br')])[1]")
    WebElement linkStore;

    //Initializing the Page Objects
    public BlogPage(){
        PageFactory.initElements(driver,this);
    }

    //Methods
    public StorePage accessEcommerce(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath("(//a[contains(text(),'Petz.com.br')])[1]")));
        clickWebElement(linkStore);

        return new StorePage();
    }
}
