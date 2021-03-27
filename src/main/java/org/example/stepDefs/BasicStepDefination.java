package org.example.stepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BasicStepDefination {

    @Given("^user is on Login Page$")
    public void userIsOnLoginPage(){
    System.out.println("User is in login Page");
    }

    @When("^user inputs userId as ([^\"]*)$")
    public void userInputsUserId(String userId){
        System.out.println("User Enters the user id as: "+userId);
    }

    @And("^inputs password as ([^\"]*)$")
    public void inputsPassword(String password){
        System.out.println("User Enters the Password as: "+password);
    }

    @And("hits submit button")
    public void hitsSubmitButton(){
        System.out.println("User hits submit button");
    }

    @Then("user lands on dashboard page")
    public void userLandsOnDashboardPage(){
        System.out.println("User is on dashboard page");
    }
}