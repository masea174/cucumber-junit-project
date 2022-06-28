package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatingCucumbers {

    @Given("John is hungry")
    public void john_is_hungry() {
        System.out.println("from Given");
    }
    @When("He eats some cucumbers")
    public void he_eats_some_cucumbers() {
        System.out.println("When");
    }
    @Then("He will be full")
    public void he_will_be_full() {
        System.out.println("then");
    }


}
