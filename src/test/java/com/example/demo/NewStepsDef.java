package com.example.demo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Service
public class NewStepsDef {

    @Autowired
    public TestingLogin testingLogin=new TestingLogin();

    public String Name;
    public String Password;

    @Given("I open login form")
    public void i_test_login_form() {

        // Write code here that turns the phrase above into concrete actions
        testingLogin.openPage("https://www.saucedemo.com/");

    }
    @When("I give credentials")
    public void i_give_credentials() {
        Name="standard_user";
        Password="secret_sauce";
        testingLogin.Name(Name);
        testingLogin.Password(Password);
        testingLogin.click();
        String current=testingLogin.currentAddr();
        assertEquals(current, "https://www.saucedemo.com/inventory.html");

    }
}
