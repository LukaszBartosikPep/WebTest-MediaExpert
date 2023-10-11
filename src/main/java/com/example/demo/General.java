package com.example.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import com.example.demo.DriverWeb;


@Component
public class General{


    @Autowired
    DriverWeb driver;


//    public WebDriver driver;

//    public General(){
//        driver=DriverWeb.getDriver();
//    }

//    public void pass (){
//        this.driver=driver;
//
//    }


//
//    public void WD(){
//        System.setProperty("webdriver.chrome.driver", "config/webdrivers/chromedriver.exe");
//        ChromeOptions options = customizeCapabilities(new DesiredCapabilities());
//        options.addArguments("start-maximized");
//        options.addArguments("--disable-gpu");
//        options.addArguments("enable-automation");
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--disable-browser-side-navigation");
//        options.addArguments("--remote-allow-origins=*");
//        this.driver = new ChromeDriver(options);
//    }
//
//    private static ChromeOptions customizeCapabilities(DesiredCapabilities cap) {
//        cap.setJavascriptEnabled(true);
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.merge(cap);
//        return chromeOptions;
//    }

    public void openPage(String url){
//        this.driver = new ChromeDriver();
//        WD();
        driver.getDriver().get(url);  ///Ponizej tez
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

//    public void waitForPageToLoad() {
//        WebDriverWait wait = new WebDriverWait(driver, 10); // Wait for up to 10 seconds
//        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete'"));
//    }
}
