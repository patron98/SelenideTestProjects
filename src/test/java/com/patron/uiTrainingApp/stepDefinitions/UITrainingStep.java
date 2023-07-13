package com.patron.uiTrainingApp.stepDefinitions;

import com.patron.uiTrainingApp.pages.CoconutPage;
import com.patron.uiTrainingApp.pages.LandingPage;
import com.patron.uiTrainingApp.pages.PopupPage;
import com.patron.uiTrainingApp.pages.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;

public class UITrainingStep {

    private final LandingPage landingPage = new LandingPage();
    private final RegisterPage registerPage = new RegisterPage();
    private final PopupPage popupPage = new PopupPage();
    private final CoconutPage coconutPage = new CoconutPage();

    @Given("i surf to the website")
    public void openUrl(){
        String url = "http://ui-training-application.s3-website-eu-west-1.amazonaws.com/";
        open(url);
    }

    @When("i log into app with {string} {string}")
    public void login(String username, String password){
        landingPage.login(username, password);
    }

    @When("i register a user with {string} {string} {string} {int} {string}")
    public void registerUser(String firstname, String lastname, String phone, int attendees, String email){
        registerPage.registerUser(firstname, lastname, phone, attendees, email);
    }

    @When("i close all the popups")
    public void closePopups(){
        popupPage.closePopUps();
    }

    @Then("a confirm banner and a button should appear")
    public void confirmPopUpsAreClosed(){
        popupPage.confirmPopUpsClosed();
    }

    @When("i click 15 coconuts")
    public void clickCoconuts(){
        coconutPage.click15Coconuts();
    }

    @Then("i complete the site")
    public void completeTheSite(){
        coconutPage.verifyCoconuts();
    }
}
