package com.patron.theInternetApp.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class DynamicControls {

    private final SelenideElement link = $(byLinkText("Dynamic Controls"));
    private final SelenideElement addCheckboxButton = $("#checkbox-example button");
    private final SelenideElement checkboxText = $("#checkbox-example #message");
    private final SelenideElement inputButton = $("#input-example button");
    private final SelenideElement inputText = $("#input-example #message");

    public void dynamicControlTest() {
        link.click();
        addCheckboxButton.click();
        inputButton.click();

        checkboxText.should(exist).shouldHave(text("it's gone!"));
        inputText.shouldBe(visible).shouldHave(text("It's enabled!"));
        back();
    }
}
