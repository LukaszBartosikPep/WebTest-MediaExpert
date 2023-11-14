package com.example.demo.pages;

import com.example.demo.DriverWeb;
import com.example.demo.General;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.concurrent.TimeUnit;

@Component
public class TestingTransaction extends General {
    @Autowired
    DriverWeb driver;


//    public static final By buttonChild=By.xpath("//button[@class='spark-button add-button add-to-cart is-primary is-primary is-medium icon-left is-new-loading is-hydrated']");
      public static final By buttonChild=By.xpath("//div[@class='buttons-wrapper']//button[@class='spark-button add-button add-to-cart is-primary is-primary is-medium icon-left is-new-loading is-hydrated']");
      public static final By goBack=By.xpath("//*[@id=\"spark\"]/div[3]/div[2]/div/div[2]/div[3]/div/button/span/span");
    public void putToCart(int numberOfItems){





//        for(int i=0; i<numberOfItems;i++) {
////            final By buttonChild = By.xpath("//div[@class='list-items']//div[@class='offers-list']//button[@class='spark-button wishlist wishlist is-desktop is-button-link is-default icon-left is-icon is-new-loading is-show-list'][" + numberOfItems + "]");
//
            List<WebElement> items=super.clickList(buttonChild);
        for(int i=0; i<numberOfItems;i++) {
                items.get(i).click();

            //wait
            driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                super.click(goBack);
            //wait
            driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }
//        items.get(2).click();
            System.out.println(items);
        }
        public void timeOut(){
            driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        }
    }


