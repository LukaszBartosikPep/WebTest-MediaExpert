package com.example.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


//@Component
public class General{


    @Autowired
    DriverWeb driver;


//

    public void openPage(String url){

        driver.getDriver().get(url);
    }

    public void setupField(By valueSelector, String value){
        driver.getDriver().findElement(valueSelector).sendKeys(value);

    }


    public void setupInformation(By Selectorn, By Selectorl, By Selectorz, String name, String lastname, String zip){
        driver.getDriver().findElement(Selectorn).sendKeys(name);
        driver.getDriver().findElement(Selectorl).sendKeys(lastname);
        driver.getDriver().findElement(Selectorz).sendKeys(zip);

    }
    public String retrieveText(By retSelector){
      WebElement  TextValue= driver.getDriver().findElement(retSelector);
      return TextValue.getText();
    }
    public int retrieveNumber(By retIntSelector){
        WebElement  TextValue= driver.getDriver().findElement(retIntSelector);
        int number=Integer.parseInt(TextValue.getText());
        return number;
    }
    public void clickBySelector(By selector){
        driver.getDriver().findElement(selector).click();
    }
    public String currentURL(){

        return driver.getDriver().getCurrentUrl(); //lepiej bez zmiennej
    }
    public List<WebElement> retrieveElementList(By visibleSelector){

       List<WebElement> elementsList= driver.getDriver().findElements(visibleSelector);
//          boolean exists=driver.getDriver().findElements(visibleSelector).size() !=0;
        return elementsList;
    }

    public WebElement retrieveSingleElement(By visibleSelector){

        WebElement element= driver.getDriver().findElement(visibleSelector);

        return element;
    }

//    public void waitForPageToLoad() {
//        WebDriverWait wait = new WebDriverWait(driver.getDriver(), 3); // Wait for up to 10 seconds
//        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete'"));
//    }

    public void driverClose(){

        driver.getDriver().close();

    }
}
