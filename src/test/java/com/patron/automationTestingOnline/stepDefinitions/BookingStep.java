package com.patron.automationTestingOnline.stepDefinitions;

import com.patron.automationTestingOnline.pages.LandingPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookingStep {
    private final LandingPage landingPage = new LandingPage();

    @When("i book a room with form data: {string} {string} {string} {string}")
    public void bookARoom(String firstname, String lastname, String email, String phone){
        landingPage.clickButton();
        landingPage.fillInForm(firstname, lastname, email, phone);
    }

    @When("i book a room with start-end date: {string} - {string}")
    public void selectDate(String startDate, String endDate){
        landingPage.selectDate(startDate, endDate);
    }

    @Then("the booking is confirmed with {string} - {string}")
    public void verifyBooking(String start, String end){
        landingPage.verifyBooking(start, end);
    }
}
