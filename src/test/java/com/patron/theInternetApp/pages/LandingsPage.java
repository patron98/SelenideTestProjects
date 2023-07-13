package com.patron.theInternetApp.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;

public class LandingsPage {

    private final SelenideElement checkbox = $(byLinkText("Checkboxes"));
}
