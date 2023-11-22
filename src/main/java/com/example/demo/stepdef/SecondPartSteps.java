package com.example.demo.stepdef;

import com.example.demo.TxtInfo;
import com.example.demo.pages.TestingBasket;
import com.example.demo.pages.TestingLogin;
import com.example.demo.pages.TestingProduct;
import com.example.demo.pages.TestingTransaction;
import cucumber.api.java.en.And;
import org.springframework.beans.factory.annotation.Autowired;

public class SecondPartSteps {
    @Autowired
    TestingLogin testingLogin;
    @Autowired
    TxtInfo txtInfo;
    @Autowired
    TestingProduct testingProduct;

    @Autowired
    TestingTransaction testingTransaction;

    @Autowired
    TestingBasket testingBasket;

    @And("I check product delivery options")
    public void productDelivery(){
        testingBasket.clickBasket();

    }

}
