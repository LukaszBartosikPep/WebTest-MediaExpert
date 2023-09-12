package com.example.demo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Service
public class NewStepsDef {

    @Autowired
    public TestingLogin testingLogin=new TestingLogin();
    @Autowired
    public TxtInfo txtInfo=new TxtInfo();
    @Autowired


    public String Name;
    public String Password;

    @Given("I open login form")
    public void i_test_login_form() {

        // Write code here that turns the phrase above into concrete actions
        testingLogin.openPage("https://www.saucedemo.com/");

    }
    @When("I give credentials")
    public void i_give_credentials() {

        List<LoginAccess> returnedAccessList =txtInfo.ReturnAccessList(2);
//        System.out.println("set");
//        System.out.println(returnedAccessList);
        for(LoginAccess loginAccess : returnedAccessList){
            Name= loginAccess.getName();
            Password= loginAccess.getPassword();
        }

//        Name="standard_user";  ///W pliku txt. osobna klasa do tego.
//        Password="secret_sauce";
        testingLogin.Name(Name);
        testingLogin.Password(Password);
        testingLogin.clickLoginButton();
        String current=testingLogin.currentURL();
        assertEquals(current, "https://www.saucedemo.com/inventory.html");
        //lepiej sprawdzić kluczowe elementy na stronie docelowej
        //check if element exists e.g.


    }
}
