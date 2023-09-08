package com.example.demo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepsDef {


    Testing testing;

    public String name;
    public String password;
    @Given("I test login form")
    public void i_test_login_form() {
        // Write code here that turns the phrase above into concrete actions
        testing=new Testing();

    }
    @When("I give correct credentials")
    public void i_give_correct_credentials() {
        // Write code here that turns the phrase above into concrete actions
        name="standard_user";
        password="secret_sauce";

    }
    @Then("Result is true")
    public void result_is_true() {
        // Write code here that turns the phrase above into concrete actions
        boolean credentialsResCorre=testing.testLogin(name,password);
        assertTrue(credentialsResCorre);
    }
    @Given("I give incorrect credentials")
    public void i_give_incorrect_credentials() {
        name="standard_admin";
        password="secret_soup";
    }
    @Then("Result is false")
    public void result_is_false() {
        testing=new Testing();
        // Write code here that turns the phrase above into concrete actions
        boolean credentialsResCorre=testing.testLogin(name,password);
        assertFalse(credentialsResCorre);
    }
    @Given("I log in")
    public void i_log_in() {


//        testing.testLogin("standard_user","secret_sauce");
//        // Write code here that turns the phrase above into concrete actions
//        testing.testAddProd();
//        testing.testLogin()
        testing=new Testing();
        testing.testLogin("standard_user","secret_sauce");
    }

    @Then("The cart contains")
    public void The_cart_contains() {
        // Write code here that turns the phrase above into concrete actions
//        String buttonText= testing.testAddProd();

//        testing.testAddProd();

        boolean notEmpty=testing.testAddProd("add-to-cart-sauce-labs-backpack",
                "Sauce Labs Backpack");
        assertTrue(notEmpty);
    }
















//    @Test
//    @When("credentialsCorrect")
//    public void credentialsCorrect() {
//        // Write code here that turns the phrase above into concrete actions
//        boolean credentialsResCorre=testing.testLogin("standard_user","secret_sauce");
//        assertTrue(credentialsResCorre);
//    }
//    @Test
//    @When("credentialsIncorrect")
//    public void credentialsIncorrect() {
//        // Write code here that turns the phrase above into concrete actions
//        boolean credentialsResIncorr=testing.testLogin("standard_admin","secret_soup");
//        assertTrue(credentialsResIncorr);
//    }




}
