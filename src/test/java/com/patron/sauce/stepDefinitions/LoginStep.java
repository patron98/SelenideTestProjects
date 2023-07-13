package com.patron.sauce.stepDefinitions;

import com.patron.sauce.pages.LoginPage;
import io.cucumber.java.en.When;

public class LoginStep {

    private final LoginPage loginPage = new LoginPage();

    @When("i login with standard user")
    public void standardLogin(){
        loginPage.login("standard_user", "secret_sauce");
    }

    @When("i login with {string} and password {string}")
    public void iLoginWithUsernamesAndPassword(String username, String password) {
        loginPage.login(username, password);
    }
}
