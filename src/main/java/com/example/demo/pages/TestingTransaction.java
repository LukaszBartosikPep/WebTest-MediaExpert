package com.example.demo.pages;

import com.example.demo.General;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestingTransaction extends General {

//    public static final By buttonChild=By.xpath("//button[@class='spark-button add-button add-to-cart is-primary is-primary is-medium icon-left is-new-loading is-hydrated']");
      public static final By buttonChild=By.xpath("//div[@class='buttons-wrapper']//button[@class='spark-button add-button add-to-cart is-primary is-primary is-medium icon-left is-new-loading is-hydrated']");
    public void putToCart(int numberOfItems){





//        for(int i=0; i<numberOfItems;i++) {
////            final By buttonChild = By.xpath("//div[@class='list-items']//div[@class='offers-list']//button[@class='spark-button wishlist wishlist is-desktop is-button-link is-default icon-left is-icon is-new-loading is-show-list'][" + numberOfItems + "]");
//
            List<WebElement> items=super.clickList(buttonChild);
////            for(WebElement element: items){
////                element.click();
////            }
            System.out.println("size is"+items.size());
        }
    }


