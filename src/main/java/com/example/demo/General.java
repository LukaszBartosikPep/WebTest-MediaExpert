package com.example.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Component
public class General {
    public WebDriver driver;
    public General(){
        System.setProperty("webdriver.ie.driver", "C:/Users/lbartosik/OneDrive - PEPCO/Pulpit/IEDriverServer.exe");
        this.driver = new InternetExplorerDriver();
    }
    public void openPage(String url){
        driver.get(url);
    }



    public void setupField(By valueSelector, String value){
        driver.findElement(valueSelector).sendKeys(value);

    }
    public String retrieveText(By retSelector){
      WebElement  TextValue= driver.findElement(retSelector);
      return TextValue.getText();
    }
    public int retrieveNumber(By retIntSelector){
        WebElement  TextValue= driver.findElement(retIntSelector);
        int number=Integer.parseInt(TextValue.getText());
        return number;
    }
    public void clickBySelector(By selector){
        driver.findElement(selector).click();
    }
    public String currentURL(){

        return driver.getCurrentUrl(); //lepiej bez zmiennej
    }
}
