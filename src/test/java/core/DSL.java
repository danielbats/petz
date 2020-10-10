package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static core.DriverFactory.getDriver;

public class DSL {

    public WebElement getElement(By by){
        return getDriver().findElement(by);
    }

    public WebElement getElement(String id){
        return getElement(By.id(id));
    }

    public void write(String id, String text){
        write(By.id(id),text);
    }

    public void write(WebElement element, String text){
        element.sendKeys(text);
    }

    public void write(By by, String text){
        getElement(by).clear();
        getElement(by).sendKeys(text);
    }

    public String getTextValue(String id){
        return getTextValue(By.id(id));
    }

    public String getTextValue(By by){
       return getElement(by).getText();
    }

    public void clickButton(String id){
        clickButton(By.id(id));
    }

    public void clickButton(By by){
        getElement(by).click();
    }

    public void clickButton(WebElement element){
        element.click();
    }

    public void clickLink (String id){
        clickLink(By.id(id));
    }

    public void clickLink (By by){
        getElement(by).click();
    }

    public void clickWebElement (WebElement element){
        element.click();
    }
    public void clickRadio(String id){
        clickRadio(By.id(id));
    }

    public void clickRadio (By by){
        getElement(by).click();
    }

    public void selectComboOption (WebElement element, String text){
        Select combo = new Select(element);
        combo.selectByVisibleText(text);
    }

}
