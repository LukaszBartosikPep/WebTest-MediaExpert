package com.example.demo;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.concurrent.TimeUnit;


//@Component
public class General {


    @Autowired
    DriverWeb driver;


//

    public void openPage(String url) {

        driver.getDriver().get(url);
        driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
    public void scrollToData(){
        JavascriptExecutor js=(JavascriptExecutor) driver.getDriver();
        js.executeScript("window.scroll({top:600});");
    }
    public void scrollTop(){
        JavascriptExecutor js=(JavascriptExecutor) driver.getDriver();
        js.executeScript("window.scrollTo(0,0)");
    }
    public void explicitWait(By selector){
        WebDriverWait wait= new WebDriverWait(driver.getDriver(),10);
        WebElement forWait=wait.until(ExpectedConditions.elementToBeClickable(selector));
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
