package com.example.demo.stepdef;

import com.example.demo.DataAccess;
import com.example.demo.TxtInfo;
import com.example.demo.pages.*;
import cucumber.api.java.bs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalTime;
import static org.junit.Assert.*;

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

    @Autowired
    TestingLocalShop testingLocalShop;
    @Autowired
    DataAccess dataAccess;

    @And("I check product delivery options")
    public void productDelivery(){
        testingBasket.clickBasket();
        LocalTime timeLimit=LocalTime.parse("12:29");
        //In the shop, request only before 12.30 can be delivered the same day
        LocalTime timeNow=LocalTime.now();
        if(timeNow.isBefore(timeLimit)) {
            testingBasket.clickDeliveryOption();
            testingBasket.fillPostalCode();
            testingBasket.clickPostalCodeCheckButton();
            //The notice is displayed when the delivery
            // can not be shiped today for that postal code.
            if (testingBasket.checkIfNoticeDisplayed() == true) {
                testingBasket.clickClose();
            }

        }
        testingBasket.chooseTomorrowDelivery();
    }


    @Then("Form must be valid and proceed")
    public void form_must_be_valid_and_proceed() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("I search for shop")
    public void searchForShop(){
        testingLocalShop.clickSearchShop();
        testingLocalShop.setAddress();
//        testingLocalShop.clickSearch();
        testingLocalShop.clickSpecificShop();
    }
    @Then("Shop data must be valid")
    public void shopDataTest(){
       String actualAddress =testingLocalShop.returnShopAddress();
        String validAddress=dataAccess.returnShopAddress();
        assertEquals(validAddress,actualAddress);
        String actualPostalCode= testingLocalShop.returnShopPostalCode();
        String validPostalCoe=dataAccess.returnShopPostalCode();
        assertEquals(validPostalCoe,actualPostalCode);

    }

}
