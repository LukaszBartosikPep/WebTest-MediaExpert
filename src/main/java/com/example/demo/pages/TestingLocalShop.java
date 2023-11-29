package com.example.demo.pages;
import com.example.demo.General;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;


@Component
public class TestingLocalShop extends General{


    public static final By findShop=By.xpath("/html/body/div[1]/div[2]/header[2]/div[1]/div/div/div[3]/a[2]");
    public static final By giveShopLocation=By.xpath("//div[@id='accordion']//input[@id='address']");
    public static final By searchButton=By.xpath("//div[@id='accordion']//button[@id='btn-search-shop']");
    public static final By shopDetailsLocator=By.xpath("//div[@id='shopList']/div/div[2]");
    public static final By clickForClear =By.xpath("//h2[text()='Znajdź elektromarket w pobliżu:']");

    public void clickSearchShop(){
        click(findShop);
    }

    public void setAddress(){
        setField(giveShopLocation, "Poznań");
        WebElement shopField=getElement(giveShopLocation);
        shopField.sendKeys(Keys.ENTER);

    }

//    public void clickSearch(){
//        click(searchButton);
//    }
//    public void clickSpecificShop(){
//        WebElement getElement()
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        click(shopDetailsLocator);
//    }
}
