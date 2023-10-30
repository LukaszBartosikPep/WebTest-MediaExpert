package com.example.demo.pages;

import com.example.demo.DriverWeb;
import com.example.demo.General;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestingLogin extends General {

    public static final By generalLogin=By.xpath("//*[text()='Moje konto']");
    public static final By accept=By.id("onetrust-accept-btn-handler");

    public static final By emailType=By.cssSelector("input[type='email']");

    public static final By passType=By.cssSelector("input[type='password']");
//    public static final By visibility=By.id("onetrust-accept-btn-handler");



    public void clickGenLogin() {
        super.click(generalLogin);
    }
    public void clickIfAccept(){

        List< WebElement> checkIfExists = super.ifVisible(accept);
        if(!checkIfExists.isEmpty()){
            super.click(accept);
        }
    }

    public void setLogin(String email){

        super.setField(emailType,email);
    }
    public void setPassword(String password){

        super.setField(passType,password);
    }
}

