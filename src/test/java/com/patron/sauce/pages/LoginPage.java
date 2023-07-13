package com.patron.sauce.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    private final By usernameInput = byId("user-name");
    private final By passwordInput = byId("password");
    private final By loginButton = byId("login-button");

    public void login(String username, String password){
        $(usernameInput).sendKeys(username);
        $(passwordInput).sendKeys(password);
        $(loginButton).click();
    }
}
