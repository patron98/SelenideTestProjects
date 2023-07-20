package com.patron.theInternetApp.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormAuthPage {

    private final SelenideElement link = $(byLinkText("Form Authentication"));
    private final SelenideElement usernameInput = $("#username");
    private final SelenideElement passwordInput = $("#password");
    private final SelenideElement loginButton = $("button");
    private final SelenideElement success = $("#flash");
    private final SelenideElement logoutButton = $(byLinkText("Logout"));

    public void formAuthPage(String username, String password){
        link.click();
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
        success.shouldBe(visible).shouldHave(text("You logged into a secure area!"));
        logoutButton.click();
        success.shouldBe(visible).shouldHave(text("You logged out of the secure area!"));
        open("https://the-internet.herokuapp.com");
    }

}
