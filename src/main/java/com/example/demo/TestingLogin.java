package com.example.demo;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class TestingLogin extends General{
    public static final By LoginNameSelector =By.id("user-name");
    public static final By PasswordSelector=By.id("password");

    public static final By ButtonSelector =By.id("login-button");



//    private static final String USERNAME = "standard_user";
//    private static final String PASSWORD = "secret_sauce";


    public void openPage(String url){
        super.openPage(url);
    }
    public void Name(String NAME) {
        super.setupField(LoginNameSelector, NAME);
    }

    public void Password(String PASSWORD) {
        super.setupField(PasswordSelector, PASSWORD);
    }
    public void click() {
        super.clickBySelector(ButtonSelector);

    }
    public String currentAddr(){
            String resultURL=currentURL();
            return resultURL;

    }

    }

