package com.serenity.stepdefinition;
import com.serenity.steps.LoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;


public class LoginStepDef {

    @Steps
    LoginSteps loginSteps;

    @Given("I am on the Application")
    public void i_am_on_the_application() {

    }
    @When("I navigate to Login popup by clicking on Log In button")
    public void i_navigate_to_login_page_by_clicking_on_log_in_button() {

    }
    @When("I enter valid testuser@gmail.com")
    public void i_enter_valid_testuser_gmail_com() {

    }
    @When("I enter valid {int}")
    public void i_enter_valid(Integer int1) {

    }
    @Then("I should be navigated to My account screen")
    public void i_should_be_navigated_to_my_account_screen() {

    }

}
