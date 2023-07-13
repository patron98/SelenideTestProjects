package com.patron.candy.stepDefinitions;

import com.patron.candy.pages.Common;
import io.cucumber.java.en.Given;

public class CommonStep {
    private final Common common = new Common();

    @Given("i surf to the website")
    public void openWebsite(){
        common.openWebsite();
    }
}
