package com.example.demo.pages;

import com.example.demo.General;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestingProduct extends General {
    public static final By searchLocator=By.xpath("//input[@placeholder='Wyszukaj w sklepie']");

    public static final By searchClickLocator=By.cssSelector(".spark-button.search-input-button.is-primary.is-default.icon-left.is-icon");






        public void goToMainPage(String url){

            super.openPage(url);
        }
        public void clickSearchBar(){
            super.click(searchLocator);
        }
        public void typeProduct(String productName){
            super.setField(searchLocator, productName );
        }
        public void clickSearch(){
            super.click(searchClickLocator);
        }

}
