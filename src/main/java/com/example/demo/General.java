package com.example.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class General {


    public WebDriver driver;
    public General (){
        System.setProperty("webdriver.chrome.driver", "C:/Users/lbartosik/OneDrive - PEPCO/Pulpit/chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    public void openPage(String url){
//        this.driver = new ChromeDriver();
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
