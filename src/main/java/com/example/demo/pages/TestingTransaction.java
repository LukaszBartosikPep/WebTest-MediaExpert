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



      public static final By buttonChild=By.xpath("//div[@class='buttons-wrapper']//button[@class='spark-button add-button add-to-cart is-primary is-primary is-medium icon-left is-new-loading is-hydrated']");
      public static final By goBack=By.xpath("//*[@id=\"spark\"]/div[3]/div[2]/div/div[2]/div[3]/div/button/span/span");
      public static final By cartLocator=By.xpath("//*[@id=\"section_header-desktop\"]/div/div/div[3]/div[4]/div/span");

    public void putToCart(int numberOfItems){


        List<WebElement> items=super.clickList(buttonChild);
        for(int i=0; i<numberOfItems;i++) {
                items.get(i).click();


            driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                super.click(goBack);

            driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }
//
            System.out.println(items);
        }
        public void timeOut(){
            driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        }

        public String numberOfItemsInCart(){
            WebElement cart= super.getElement(cartLocator);
            String cartContainer=cart.getText();
            System.out.println(cartContainer);
            return cartContainer;


        }
    }


