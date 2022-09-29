package com.planetpope.cucumber;

import calculator.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class StepDefinitions {
    private int x;
    private int y;
    private int result;

    @Given("x={int}")
    public void x(Integer int1) {

         this.x =  int1;
    }
    @Given("y={int}")
    public void y(Integer int1) {
     this.y = int1;   // Write code here that turns the phrase above into concrete actions
    }
    @When("x and y are added")
    public void x_and_y_are_added() {
        this.result=3;
        Calculator cal = new Calculator();// Write code here that turns the phrase above into concrete actions
        int add = cal.add(x, y);
        result = add;
    }
    @Then("the result is {int}")
    public void the_result_is(Integer int1) {
        Assertions.assertTrue(this.result == int1,"addition is correct " );
    }

}
