package com.example.demo.pages;

import com.example.demo.DriverWeb;
import com.example.demo.General;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestingLogin extends General {

    @Autowired
    DriverWeb driver;

    public static final By generalLogin=By.xpath("//*[text()='Moje konto']");

    public static final By logout=By.xpath("//*[text()='Wyloguj']");
    public static final By accept=By.xpath("//div[@class='onetrust-banner-options']//button[@id='onetrust-accept-btn-handler']");

    public static final By emailTypeIn =By.cssSelector("input[type='email']");


    public static final By passTypeIn =By.cssSelector("input[type='password']");
    public static final By clickLocator =By.cssSelector(".spark-button.submit.is-primary.is-default.icon-left");
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
    public void clickLogin(){

        super.click(clickLocator);
    }
    public void setLogin(String email){

        super.setField(emailTypeIn,email);
    }
    public void setPassword(String password){

        super.setField(passTypeIn,password);
    }

    public void logoutClose(){
        super.click(logout);
        super.Close();


    }
}

