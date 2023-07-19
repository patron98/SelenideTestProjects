package com.patron.theInternetApp.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.*;

public class EntryAdd {

    private final SelenideElement link = $(byLinkText("Entry Ad"));
    private final SelenideElement closeButton = $x("//p[text()='Close']");


    public void entryAddTest(){
        link.click();
        closeButton.click();
        back();
    }
}
