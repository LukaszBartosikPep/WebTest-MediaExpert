package com.example.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class General {


    public WebDriver driver;

    public General (){
        System.setProperty("webdriver.chrome.driver", "config/webdrivers/chromedriver.exe");
        ChromeOptions options = customizeCapabilities(new DesiredCapabilities());
        options.addArguments("start-maximized");
        options.addArguments("--disable-gpu");
        options.addArguments("enable-automation");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-browser-side-navigation");
        options.addArguments("--remote-allow-origins=*");
        this.driver = new ChromeDriver(options);
    }

    private static ChromeOptions customizeCapabilities(DesiredCapabilities cap) {
        cap.setJavascriptEnabled(true);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.merge(cap);
        return chromeOptions;
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
