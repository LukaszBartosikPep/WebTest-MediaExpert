package com.example.demo.stepdef;

//import com.example.demo.General;
import com.example.demo.DriverWeb;
import com.example.demo.General;
import com.example.demo.LoginAccess;
import com.example.demo.pages.TestingLogin;
import com.example.demo.pages.TestingProduct;
import com.example.demo.TxtInfo;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Driver;
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






     @Before
     @Given("I open login form")
    public void i_test_login_form() {
//

//            System.out.println("is null");

//            testingLogin = new TestingLogin();
//        }


        testingLogin.openPage("https://www.saucedemo.com/");

    }
    @Given("I give credentials {string} {string}")
    public void i_give_credentials(String name, String pass ) {

//        List<LoginAccess> returnedAccessList =txtInfo.ReturnAccessListP();
////
//        testingLogin.Name(returnedAccessList.get(1).getName());
//        testingLogin.Password(returnedAccessList.get(1).getPassword());
        testingLogin.Name(name);
        testingLogin.Password(pass);
        testingLogin.clickLoginButton();
        String correctValue="Swag Labs";
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        numberOfItemsBefore=testingLogin.retrieveNumber();

    }


    @When("I add product")
    public void i_add_product() {


//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        testingProduct.clickAddProduct();
    }
//
   @Then("I remove product")
   public void remove(){
        testingProduct.clickRemoveProduct();

   }
    @Then("Product must be in cart")
    public void product_must_be_in_cart() {
        int numberOfItemsBefore=0;
        int numberOfItemsAfter=testingProduct.retrieveNumber();
        assertNotEquals(numberOfItemsBefore, numberOfItemsAfter);

    }
    @When("I click menu button")
    public void testMenu(){
        testingProduct.clickMenu();

    }

    @Then("If menu is visible")
    public void menuVisible(){
        boolean isVisible= testingProduct.checkIfMenuVisible();
        assertTrue(isVisible);

    }
    @When("I do redirection")
    public void checkRedirection(){

         testingProduct.clickAbout();
         String currentURL=testingProduct.checkNewURL();
         assertEquals("https://saucelabs.com/",currentURL);
    }

    @When("I do checkout")
    public void checkout(){
        testingProduct.clickCart();
        testingProduct.clickCheckout();
        String outTitle=testingProduct.retrieveTitle();
        String correctTitle="Checkout: Your Information";
        assertEquals(correctTitle, outTitle );
        testingProduct.giveYourInfo("Edi", "Brock", "90");
        testingProduct.clickContinue();
        String secoutTitle= testingProduct.retrieveTitle();
        String seccorrectTitle="Checkout: Overview";
        assertEquals(seccorrectTitle,secoutTitle);
        testingProduct.clickFinish();
        String thirdTitle= testingProduct.retrieveTitle();
        String thirdcorrectTitle="Checkout: Complete!";
        assertEquals(thirdcorrectTitle,thirdTitle);


    }
    @Then("Browser quit")
    public void quit(){

        testingLogin.driverClose();

    }

//    @When ("I run driver")
//    public void runDriver(){
//
//        TestingLogin testingLogin=new TestingLogin();
//    }


}
