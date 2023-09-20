package com.example.demo.pages;

import com.example.demo.General;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class TestingProduct extends General {
    public static final By LoginNameSelector= By.id("user-name");
    public static final By PasswordSelector= By.id("password"); //Usunac mozna i metody tez

    public static final By ButtonSelectorLogin = By.id("login-button");

    public static final By AddButton=By.id("add-to-cart-sauce-labs-backpack");
    public static final By CartSelector=By.className("shopping_cart_badge");



    public void Name(String NAME) {
        super.setupField(LoginNameSelector, NAME);
    }
    //
    public void Password(String PASSWORD) {
        super.setupField(PasswordSelector, PASSWORD);
    }
    public void clickLoginButton() {
        super.clickBySelector(ButtonSelectorLogin);

    }
    public void clickAddProduct(){
        super.clickBySelector(AddButton);
    }
    public int retrieveNumber(){
        int number=retrieveNumber(CartSelector);
        return number;
    }

}
