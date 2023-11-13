package com.example.demo.stepdef;

//import com.example.demo.General;
import com.example.demo.LoginAccess;
import com.example.demo.pages.TestingLogin;
import com.example.demo.pages.TestingProduct;
import com.example.demo.TxtInfo;
//import com.example.demo.pages.TestingTransaction;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.junit.Assert.*;


//@Component
public class NewStepsDef {



    @Autowired
    TestingLogin testingLogin;
    @Autowired
    TxtInfo txtInfo;
    @Autowired
    TestingProduct testingProduct;

//    @Autowired
//    TestingTransaction testingTransaction;







    @Given("I open page")
    public void i_test_login_form() {
//




        testingLogin.openPage("https://www.mediaexpert.pl/");
        try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        testingLogin.clickIfAccept();

    }
    @Then("I give credentials {string} {string}")
    public void i_give_credentials(String name, String pass ) {

        List<LoginAccess> returnedAccessList =txtInfo.ReturnAccessListP();
//
//        testingLogin.Name(returnedAccessList.get(0).getName());
//        testingLogin.Password(returnedAccessList.get(0).getPassword());
//        testingLogin.Name(name);
//        testingLogin.Password(pass);
//        testingLogin.clickLoginButton();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        testingLogin.clickGenLogin();
        testingLogin.setLogin(name);
        testingLogin.setPassword(pass);



    }
        @When("I click login")
        public void clickLogin(){
        testingLogin.clickLogin();
        }
        @Then("I check if logged in")
        public void checkLogged(){

            String targetUrl="https://www.mediaexpert.pl/profile";

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String actualUrl= testingLogin.getURL();
            assertEquals(targetUrl,actualUrl);
        }
        @Then( "I logout and close browser")
            public void closeSession(){
            testingLogin.clickGenLogin();
            testingLogin.logoutClose();

                }
//        @When("I go to main page")
//        public void i_go_to_main_page() {
//            // Write code here that turns the phrase above into concrete actions
//            testingProduct.goToMainPage("https://www.mediaexpert.pl/");
//        }

        @When("I type product name {string}")
        public void i_type_product_name(String product) {
            // Write code here that turns the phrase above into concrete actions
            testingProduct.clickSearchBar();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            testingProduct.typeProduct(product);
        }

        @When("I click search")
        public void i_click_search() {
            // Write code here that turns the phrase above into concrete actions
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//
//            testingProduct.typeProduct("UPS");

            testingProduct.clickSearchButton();
//            testingProduct.clickTab();
//            WebElement bar=testingProduct.test();
//            assertTrue(bar.isDisplayed());
        }

        @Then("Product list must be valid {string}")
        public void product_list_must_be_valid(String expected) {
            // Write code here that turns the phrase above into concrete actions
            String searchResult=testingProduct.checkResult();
            assertEquals(expected, searchResult);
        }
    @When("I click on product button")
    public void i_click_on_product_button() {
        // Write code here that turns the phrase above into concrete actions
        testingProduct.hoverOverProdukty();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //await!

        testingProduct.clickProdukty();
//        testingProduct.clickProdukty();

    }

    @When("I chose the subcategory")
    public void i_chose_the_subcategory() {
        // Write code here that turns the phrase above into concrete actions
        testingProduct.hoverOverKompTab();
        testingProduct.clickGamingowe();

    }

    @Then("Given list of product must be visible {string}")
    public void given_list_of_product_must_be_visible(String expectedGamingResult) {
        // Write code here that turns the phrase above into concrete actions
        String gamingResult=testingProduct.checkGamingResult();
        assertEquals(expectedGamingResult, gamingResult);



    }
//
//

}
