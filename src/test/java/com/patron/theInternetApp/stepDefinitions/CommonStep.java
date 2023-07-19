package com.patron.theInternetApp.stepDefinitions;

import com.patron.theInternetApp.pages.Common;
import io.cucumber.java.en.Given;

public class CommonStep {
    private final Common common = new Common();

    @Given("i open the website")
    public void openWebsite(){
        common.openWebsite();
    }
}
