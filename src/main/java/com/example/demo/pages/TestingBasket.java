package com.example.demo.pages;

import com.example.demo.DataAccess;
import com.example.demo.General;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestingBasket extends General {

    @Autowired
    DataAccess dataAccess;

    public static final By BaseketIcon = By.xpath("/html/body/div[1]/div[2]/header[2]/div[2]/div/div/div[3]/div[4]");
    public static final By DeliveryOption = By.xpath("//*[@id=\"section_transport\"]/div[1]/label[1]/span");
    public static final By PostalCodeField = By.xpath("//*[@id=\"section_transport\"]/div[2]/div/div[2]/div[2]/form/div/div/label/div[1]/input");
    public static final By PostalCodeButtonCheck= By.xpath("//*[@id=\"section_transport\"]/div[2]/div/div[2]/div[2]/form/button");
    public static final By DeliveryLocationPossible=By.xpath("//*[@id=\"section_transport\"]/div[2]/div/div[2]/div[2]/div/span");
    public static final By closePostalCodeWindow=By.xpath("//div[@class='dialog']//button[@class='dialog-close-btn']");
    public static final By deliveryTomorrow=By.xpath("//div[@id='section_transport']//label[1]/span[1]");
    public void clickBasket() {
        click(BaseketIcon);

    }

    public void clickDeliveryOption() {
        click(DeliveryOption);
    }

    public void fillPostalCode() {
       String retrieveCode= dataAccess.returnPostalCode();
       System.out.println("the code is"+retrieveCode);
        setField(PostalCodeField, retrieveCode );


    }

    public void clickPostalCodeCheckButton(){
        click(PostalCodeButtonCheck);
    }
    public Boolean checkIfNoticeDisplayed(){
        WebElement notification=getElement(DeliveryLocationPossible);
        Boolean notificationVisible=notification.isDisplayed();
        return notificationVisible;

    }
    public void clickClose(){
        click(closePostalCodeWindow);
    }
    public void chooseTomorrowDelivery(){
        click(deliveryTomorrow);
    }





}