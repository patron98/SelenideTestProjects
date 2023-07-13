package com.patron.uiTrainingApp.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class RegisterPage {

    private final SelenideElement firstNameInput = $x("//input[@placeholder='First name']");
    private final SelenideElement lastNameInput = $x("//input[@placeholder='Last name']");
    private final SelenideElement phoneInput = $x("//input[@placeholder='Phone number']");
    private final SelenideElement attendeesInput = $x("//input[@placeholder='Attendees']");
    private final SelenideElement emailInput = $x("//input[@placeholder='Email']");
    private final SelenideElement button = $x("//button[@id='login-button']");

    //-----------------------------------------------------------------------------------------------------

    public void registerUser(String firstname, String lastname, String phone, int attendees, String email) {
        firstNameInput.sendKeys(firstname);
        lastNameInput.sendKeys(lastname);
        phoneInput.sendKeys(phone);
        attendeesInput.sendKeys(String.valueOf(attendees));
        emailInput.sendKeys(email);
        button.click();
    }
}
