package com.example.demo.stepdef;

import com.example.demo.LoginAccess;
import com.example.demo.pages.TestingLogin;
import com.example.demo.pages.TestingProduct;
import com.example.demo.TxtInfo;
import com.example.demo.pages.TestingTransaction;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.junit.Assert.*;

public class GenericSteps {

    @Autowired
    TestingLogin testingLogin;
    @Autowired
    TxtInfo txtInfo;
    @Autowired
    TestingProduct testingProduct;

    @Autowired
    TestingTransaction testingTransaction;




    @When("I add product to cart {int}")
    public void i_add_product_to_cart(int numberOfProducts) {
        // Write code here that turns the phrase above into concrete actions

        testingTransaction.scrollDown();
        testingTransaction.putToCart(numberOfProducts);


    }

    @Then("Products must be visible")
    public void products_must_be_visible() {
        // Write code here that turns the phrase above into concrete actions

    }
//
}