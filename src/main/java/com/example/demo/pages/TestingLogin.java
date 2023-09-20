package com.example.demo.pages;

import com.example.demo.General;
import org.openqa.selenium.By;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TestingLogin extends General {
    public static final By LoginNameSelector= By.id("user-name");
    public static final By PasswordSelector= By.id("password");

    public static final By ButtonSelectorLogin = By.id("login-button");
    public static final By TextValue=By.className("app_logo");




//    private static final String USERNAME = "standard_user";
//    private static final String PASSWORD = "secret_sauce";


//    public void openPage(String url){  //No sense
//        super.openPage(url);
//    }
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

    public String retrieveText(){

        String text=retrieveText(TextValue);
        return text;
    }

//    public String currentAddr(){ //No sense
//            String resultURL=currentURL();
//            return resultURL;
//
//    }

    }

