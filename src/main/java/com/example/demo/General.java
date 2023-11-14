package com.example.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
    public List<WebElement> clickList(By itemsSelector){
        List <WebElement> items= driver.getDriver().findElements(itemsSelector);
        return items;
    }
    public void scrollDown(){
        JavascriptExecutor js=(JavascriptExecutor) driver.getDriver();
        js.executeScript("window.scroll({top:30000, behavior:'smooth'});");

    }
    public void scrollTop(){
        JavascriptExecutor js=(JavascriptExecutor) driver.getDriver();
        js.executeScript("window.scrollTo(0,0)");
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


    public void Action(By elementName) {
    Actions action=new Actions (driver.getDriver());
    WebElement element=driver.getDriver().findElement(elementName);
    action.moveToElement(element).perform();
    }
    public int windowSize(){
        driver.getDriver().manage().window().maximize();
        Dimension screenSize=driver.getDriver().manage().window().getSize();
        int width=screenSize.getWidth();
        return width;
    }



}
