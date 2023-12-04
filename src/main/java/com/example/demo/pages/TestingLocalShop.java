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
//    public static final By searchButton=By.xpath("//div[@id='accordion']//button[@id='btn-search-shop']");
    public static final By shopDetailsLocator=By.xpath("//div[@id='shopList']/div/div[2]");
//    public static final By clickForClear =By.xpath("//h2[text()='Znajdź elektromarket w pobliżu:']");
    public static final By liveResult=By.xpath("//div[@class='live-results show']/div[1]");
    public static final By shopDataAddress=By.xpath("//div[@class='tree']//ul[1]/li[2]");
    public static final By shopDataPostalCode=By.xpath("//div[@class='tree']//ul[1]/li[3]");
   public static final By closePopup=By.xpath("//div[@class='modal-body']/button[@aria-label='Zamknij' and @data-dismiss='modal']");


   public void clickSearchShop(){
        click(findShop);
    }

    public void setAddress(){
        setField(giveShopLocation, "Poznań");
//        WebElement shopField=getElement(giveShopLocation);

        click(liveResult);

    }


    public void clickSpecificShop(){


        explicitWait(shopDetailsLocator);
        click(shopDetailsLocator);
        scrollToData();
        click(closePopup);
    }
    public String returnShopAddress(){
        String shopAddress= getElement(shopDataAddress).getText();
        return shopAddress;
    }
    public String returnShopPostalCode(){
        String shopPostal= getElement(shopDataPostalCode).getText();
        return shopPostal;
    }
}
