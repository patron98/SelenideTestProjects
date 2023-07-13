package com.patron.automationTestingOnline.stepDefinitions;

import com.patron.automationTestingOnline.pages.Common;
import io.cucumber.java.en.Given;

public class CommonStep {
    private final Common common = new Common();

    @Given("i go to the website")
    public void openSite(){
        common.openWebsite();
    }
}
