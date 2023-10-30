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




        testingLogin.openPage("https://www.mediaexpert.pl/");

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
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        testingLogin.clickIfAccept();
        testingLogin.clickGenLogin();
        testingLogin.setLogin(name);
        testingLogin.setPassword(pass);



    }




}
