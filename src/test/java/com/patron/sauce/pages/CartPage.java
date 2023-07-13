package com.patron.sauce.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    private final By checkoutButton = byId("checkout");
    private final By firstNameInput = byId("first-name");
    private final By lastNameInput = byId("last-name");
    private final By zipCodeInput = byId("postal-code");
    private final By submit = byId("continue");
    private final By finishButton = byId("finish");
    private final By successBanner = byClassName("title");

    public void pressCheckoutButton(){
        $(checkoutButton).click();
    }
    public void fillInForm(String firstName, String lastName, String zipCode){
        $(firstNameInput).sendKeys(firstName);
        $(lastNameInput).sendKeys(lastName);
        $(zipCodeInput).sendKeys(zipCode);
        $(submit).click();
        $(finishButton).click();
    }

    public void confirmSuccess(){
        String confirmationString = "Checkout: Complete!";
        $(successBanner).shouldHave(exactText(confirmationString));

    }
}
