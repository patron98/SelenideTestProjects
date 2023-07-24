package com.patron.theInternetApp.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.*;

public class JQueryUIPage {
    private final SelenideElement link = $(byLinkText("JQuery UI Menus"));

    private final SelenideElement menu = $("#menu");

    public void jQueryTest() {
        link.click();
        navigateToExcelDownload();
        navigateToUIMenu();
        open("https://the-internet.herokuapp.com/");
    }


    private void navigateToDownloads() {
        menu.$("#ui-id-3").hover();
        menu.$("#ui-id-4").shouldBe(visible, Duration.ofSeconds(2)).click();
    }

    private void navigateToExcelDownload() {
        navigateToDownloads();
        menu.$(byId("ui-id-7")).shouldBe(visible, Duration.ofSeconds(2)).click();
    }

    private void navigateToUIMenu(){
        menu.$("#ui-id-3").hover();
        menu.$("#ui-id-8").shouldBe(visible, Duration.ofSeconds(2)).click();
        back();
    }
}
