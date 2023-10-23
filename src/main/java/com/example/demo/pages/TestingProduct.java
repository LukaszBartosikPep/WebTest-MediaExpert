package com.example.demo.pages;

import com.example.demo.General;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestingProduct extends General {
    public static final By LoginNameSelector= By.id("user-name");
    public static final By PasswordSelector= By.id("password"); //Usunac mozna i metody tez

    public static final By ButtonCheckout = By.id("checkout");
    public static final By Finish = By.id("finish");

    public static final By AddButton=By.id("add-to-cart-sauce-labs-backpack");

    public static final By RemoveProduct=By.id("remove-sauce-labs-backpack");
    public static final By CartSelector=By.className("shopping_cart_badge");

    public static final By MenuButton=By.className("bm-menu-wrap");

    public static final By CartBadge=By.className("shopping_cart_badge");
    public static final By CartAccess=By.id("shopping_cart_container");
    public static final By Continue=By.id("continue");
    public static final By NameSel=By.id("first-name");
    public static final By LastNameSel=By.id("last-name");
    public static final By ZipSel=By.id("postal-code");

    public static final By Menu=By.id("react-burger-menu-btn");

    public static final By Title=By.className("title");

    public static final By About=By.id("about_sidebar_link");



//    public void Name(String NAME) {
//        super.setupField(LoginNameSelector, NAME);
//    }
//    //
//    public void Password(String PASSWORD) {
//        super.setupField(PasswordSelector, PASSWORD);
//    }
    public void clickCheckout() {
        super.clickBySelector(ButtonCheckout);

    }
    public void clickCart(){
        super.clickBySelector(CartAccess);
    }

    public void clickAddProduct(){
        super.clickBySelector(AddButton);
    }

    public void clickRemoveProduct(){

        super.clickBySelector(RemoveProduct);
    }
    public void giveYourInfo(String Name, String Last, String Zip){
        super.setupInformation(NameSel, LastNameSel, ZipSel, Name, Last, Zip);
    }
    public void clickContinue(){
        super.clickBySelector(Continue);

    }
    public void clickMenu(){
        super.clickBySelector(Menu);
    }

    public void clickAbout(){
        super.clickBySelector(About);
    }

    public String checkNewURL(){
        String currentURL=currentURL();

        return currentURL;

    }
    public boolean checkIfMenuVisible(){
        WebElement menu= retrieveSingleElement(MenuButton);

        if(menu.isDisplayed()){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean checkIfBadgeVisible(){
        List<WebElement> badge= retrieveElementList(CartBadge);
//        String badgeText=badge.getText();
        if(!badge.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
    public void clickFinish(){
        super.clickBySelector(Finish);

    }

    public String retrieveTitle(){

        String title=retrieveText(Title);
        return title;
    }
    public int retrieveNumber(){
        int number=retrieveNumber(CartSelector);
        return number;
    }

}
