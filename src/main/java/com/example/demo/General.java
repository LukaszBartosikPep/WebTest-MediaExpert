package com.example.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


//@Component
public class General {


    @Autowired
    DriverWeb driver;


//

    public void openPage(String url) {

        driver.getDriver().get(url);
    }

    public void click(By clickSelector){

        driver.getDriver().findElement(clickSelector).click();
    }

    public WebElement getElement(By selector){
        return driver.getDriver().findElement(selector);
    }

    public List<WebElement> ifVisible(By visibleSelector){
        List <WebElement> elementList= driver.getDriver().findElements(visibleSelector);
        return elementList;
    }

    public void setField(By fieldName, String value){

        driver.getDriver().findElement(fieldName).sendKeys(value);
    }
    public String getURL(){
       String url= driver.getDriver().getCurrentUrl();

       return url;
    }
    public void Close(){
        driver.getDriver().close();
    }
}
