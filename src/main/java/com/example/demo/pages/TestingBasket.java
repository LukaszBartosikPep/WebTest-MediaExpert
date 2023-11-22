package com.example.demo.pages;

import com.example.demo.General;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class TestingBasket extends General {

        public static final By BaseketIcon=By.xpath("/html/body/div[1]/div[2]/header[2]/div[2]/div/div/div[3]/div[4]");
        public static final By DeliveryOption=By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div[2]/div[1]/div[3]/div[1]/label[1]/span");


    public void clickBasket(){
        click(BaseketIcon);

    }

    public void clickDeliveryOption(){
        click(DeliveryOption);
    }
}
