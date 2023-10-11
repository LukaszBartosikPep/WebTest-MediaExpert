package com.example.demo.pages;

import com.example.demo.General;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class TestingProduct extends General {
    public static final By LoginNameSelector= By.id("user-name");
    public static final By PasswordSelector= By.id("password"); //Usunac mozna i metody tez

    public static final By ButtonCheckout = By.id("checkout");
    public static final By Finish = By.id("finish");

    public static final By AddButton=By.id("add-to-cart-sauce-labs-backpack");
    public static final By CartSelector=By.className("shopping_cart_badge");
    public static final By CartAccess=By.id("shopping_cart_container");
    public static final By Continue=By.id("continue");
    public static final By NameSel=By.id("first-name");
    public static final By LastNameSel=By.id("last-name");
    public static final By ZipSel=By.id("postal-code");


    public static final By Title=By.className("title");



    public void Name(String NAME) {
        super.setupField(LoginNameSelector, NAME);
    }
    //
    public void Password(String PASSWORD) {
        super.setupField(PasswordSelector, PASSWORD);
    }
    public void clickCheckout() {
        super.clickBySelector(ButtonCheckout);

    }
    public void clickCart(){
        super.clickBySelector(CartAccess);
    }

    public void clickAddProduct(){
        super.clickBySelector(AddButton);
    }
    public void giveYourInfo(String Name, String Last, String Zip){
        super.setupInformation(NameSel, LastNameSel, ZipSel, Name, Last, Zip);
    }
    public void clickContinue(){
        super.clickBySelector(Continue);

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
