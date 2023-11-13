package com.example.demo.pages;

import com.example.demo.General;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;



@Component
public class TestingProduct extends General {
    public static final By searchLocatorField =By.xpath("//div[@class='search search-element']//div[@class='search-content']//div[@class='spark-input is-empty']//input[@placeholder='Wyszukaj w sklepie']");
    public static final By searchLocatorFieldType =By.xpath("//div[@class='search search-element active']//div[@class='search-content']//input[@placeholder='Wyszukaj w sklepie']");
    public static final By searchButtonLocator =By.xpath("//div[@class='search search-element active']//div[@class='search-content']//button[@class='spark-button search-input-button is-primary is-default icon-left is-icon is-new-loading']");
    public static final By menuButton=By.className("menu-button");

    public static final By searchResult=By.xpath("//div[@id='section_list-filters']/h1/span/span[2]");
    public static final By produktyButton=By.cssSelector("label[class='menu-button']");

    public static final By gamingSearchResult=By.cssSelector("h1.list-name.is-title");



    public static final By kompTab =By.xpath("//li//a[@href='/komputery-i-tablety']");

    public static final By monitoryGamingowe=By.xpath("//div[@class='group-links']//a[@href='/komputery-i-tablety/monitory-led/monitory-gamingowe']");






//        public void goToMainPage(String url){
//
//            super.openPage(url);
//        }
        public WebElement test(){

                WebElement bar=super.getElement(menuButton);
                return bar;
        }
        public void clickSearchBar(){
            super.click(searchLocatorField);
        }
        public void typeProduct(String productName){
            super.setField(searchLocatorFieldType, productName );
        }
        public void clickSearchButton(){
            super.click(searchButtonLocator);
        }
        public void clickTab(){
            super.click(kompTab);
        }

        public String checkResult(){
            WebElement result=super.getElement(searchResult);
          String resultText=  result.getText();
          System.out.println(resultText);
            return resultText;
        }
        public String checkGamingResult(){
            WebElement gamingResult=super.getElement(gamingSearchResult);
            String gamingGetText=gamingResult.getText();
            return gamingGetText;
        }
        public void clickProdukty(){
            super.click(produktyButton);
        }
        public void hoverOverKompTab(){
            super.Action(kompTab);
        }
        final int breakWidth=1250;
        public void hoverOverProdukty(){
            int width=super.windowSize();
            if(width<breakWidth) {

                super.Action(produktyButton);
            }
        }
        public void clickGamingowe(){
            super.click(monitoryGamingowe);
        }


}
