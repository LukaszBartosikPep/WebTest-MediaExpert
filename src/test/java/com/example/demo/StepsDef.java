package com.example.demo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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
    @When("I give incorrect credentials")
    public void i_give_incorrect_credentials() {
        name="standard_admin";
        password="secret_soup";
    }
    @Then("Result is false")
    public void result_is_false() {
        // Write code here that turns the phrase above into concrete actions
        boolean credentialsResCorre=testing.testLogin(name,password);
        assertTrue(credentialsResCorre);
    }
    @Given("I click on add")
    public void i_click_add() {

        testing=new Testing();
        testing.testLogin("standard_user","secret_sauce");
        // Write code here that turns the phrase above into concrete actions
        testing.tesAddProd();
    }

    @Then("The button changed to Remove")
    public void the_button_changed_to_remove() {
        // Write code here that turns the phrase above into concrete actions
        String buttonText= testing.tesAddProd();
        Assert.assertEquals(buttonText, "Remove");
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
