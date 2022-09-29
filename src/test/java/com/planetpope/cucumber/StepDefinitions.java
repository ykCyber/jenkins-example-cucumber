package com.planetpope.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {
    int int1;
    private int int2;
    private int result;

    @Given("x={int}")
    public void x(Integer int1) {

         this.int1 =  int1;
    }
    @Given("y={int}")
    public void y(Integer int1) {
     this.int2 = int1;   // Write code here that turns the phrase above into concrete actions
    }
    @When("x and y are added")
    public void x_and_y_are_added() {
        this.result = this.int1 + this.int2;  // Write code here that turns the phrase above into concrete actions
    }
    @Then("the result is {int}")
    public void the_result_is(Integer int1) {
        Assertions.assertTrue(this.result == int1,"addition is correct " );
    }

}
