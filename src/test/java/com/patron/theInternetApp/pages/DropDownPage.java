package com.patron.theInternetApp.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.back;

public class DropDownPage {

    private final SelenideElement link = $(byLinkText("Dropdown"));
    private final SelenideElement options = $("#dropdown");


    public void dropDownTest(){
        link.click();
        options.selectOption("Option 1");
        options.shouldHave(text("Option 1")).selectOption("Option 2");
        options.shouldHave(text("Option 2"));
        back();
    }

}
