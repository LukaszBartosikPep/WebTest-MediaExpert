package com.example.demo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Component
public class NewStepsDef {

    @Autowired
    public TestingLogin testingLogin=new TestingLogin();
    @Autowired
    public TxtInfo txtInfo=new TxtInfo();
    @Autowired
    public TestingProduct testingProduct=new TestingProduct();


    public String Name;
    public String Password;

    @Given("I open login form")
    public void i_test_login_form() {

        // Write code here that turns the phrase above into concrete actions
        testingLogin.openPage("https://www.saucedemo.com/");

    }
    @Then("I give credentials")
    public void i_give_credentials() {

        List<LoginAccess> returnedAccessList =txtInfo.ReturnAccessList();
//        System.out.println("set");
//        System.out.println(returnedAccessList);

//            String Name= loginAccess.getName();
//            Password= loginAccess.getPassword();


//        Name="standard_user";  ///W pliku txt. osobna klasa do tego.
//        Password="secret_sauce";
        testingLogin.Name(returnedAccessList.get(0).getName());
        testingLogin.Password(returnedAccessList.get(0).getPassword());  //Jezeli druga kombinacja wtedy (1)
        testingLogin.clickLoginButton();
        String correctValue="Swag Labs";
        String textValue=testingLogin.retrieveText();
//        String current=testingLogin.currentURL();
        assertEquals(correctValue, textValue);
        //lepiej sprawdzić kluczowe elementy na stronie docelowej
        //check if element exists e.g.


    }
    @Given("I test adding product")
    public int i_test_adding_product() {

        List<LoginAccess> returnedAccessList2 =txtInfo.ReturnAccessList();
        testingProduct.openPage("https://www.saucedemo.com/");
        testingProduct.Name(returnedAccessList2.get(0).getName());
        testingProduct.Password(returnedAccessList2.get(0).getPassword());  //Jezeli druga kombinacja wtedy (1)
        testingProduct.clickLoginButton();
//        return testingProduct.retrieveNumber();
        return 0;
    }
    @When("I add product")
    public void i_add_product() {
     testingProduct.clickAddProduct();
    }
    @Then("Product must be in cart")
    public void product_must_be_in_cart() {
        int numberOfItemsBefore=0;
        int numberOfItemsAfter=testingProduct.retrieveNumber();
        assertNotEquals(numberOfItemsBefore, numberOfItemsAfter);

    }
}
