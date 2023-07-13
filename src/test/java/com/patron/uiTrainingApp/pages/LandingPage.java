package com.patron.uiTrainingApp.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class LandingPage {

    private final SelenideElement usernameInput = $x("//input[@placeholder='User name']");
    private final SelenideElement passwordInput = $x("//input[@placeholder='Password']");
    private final SelenideElement button = $x("//button[@id='login-button']");

    //-----------------------------------------------------------------------------------------------------

    public void login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        button.click();
    }



}
