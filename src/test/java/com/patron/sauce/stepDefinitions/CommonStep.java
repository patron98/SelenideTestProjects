package com.patron.sauce.stepDefinitions;

import com.patron.sauce.pages.Common;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CommonStep {

    private final Common common = new Common();

    @Given("i surf to the website")
    public void openWebsite(){
        common.openWebsite();
    }

    @Then("i should get to the {string} page")
    public void verifyEndpoint(String endpoint){
        common.verifyWebPage(endpoint);
    }


}
