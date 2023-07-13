package com.patron.candy.stepDefinitions;

import com.patron.candy.pages.CandyPage;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.switchTo;

public class CandyStep {
    private final CandyPage candyPage = new CandyPage();

    @When("i click the X Button")
    public void clickXButton(){
        switchTo().frame(2);
        candyPage.clickXButton();
    }
}
