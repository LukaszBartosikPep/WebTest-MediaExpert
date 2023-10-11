package com.example.demo.stepdef;

//import com.example.demo.General;
import com.example.demo.DriverWeb;
import com.example.demo.General;
import com.example.demo.LoginAccess;
import com.example.demo.pages.TestingLogin;
import com.example.demo.pages.TestingProduct;
import com.example.demo.TxtInfo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


//@Component
public class NewStepsDef {

    @Autowired
    TestingLogin testingLogin;
    @Autowired
    TxtInfo txtInfo;
    @Autowired
    TestingProduct testingProduct;  ///szukac w packages


//    int numberOfItemsBefore;




    @Given("I open login form")
    public void i_test_login_form() {
//        General general=new General();
//        general.WD();
//        DriverWeb driverWeb=new DriverWeb();
//        driverWeb.Drive();
//        testingLogin.Driver();
        testingLogin.openPage("https://www.saucedemo.com/");

    }
    @Then("I give credentials")
    public void i_give_credentials() {

        List<LoginAccess> returnedAccessList =txtInfo.ReturnAccessList();

        testingLogin.Name(returnedAccessList.get(0).getName());
        testingLogin.Password(returnedAccessList.get(0).getPassword());  //Jezeli druga kombinacja wtedy (1)
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
//
    @Then("Product must be in cart")
    public void product_must_be_in_cart() {
        int numberOfItemsBefore=0;
        int numberOfItemsAfter=testingProduct.retrieveNumber();
        assertNotEquals(numberOfItemsBefore, numberOfItemsAfter);

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
}
