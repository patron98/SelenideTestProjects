package com.patron.theInternetApp.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.*;

public class WindowsPage {
    private final SelenideElement link = $(byLinkText("Multiple Windows"));
    private final SelenideElement openTab = $(byLinkText("Click Here"));
    private final SelenideElement textDiv = $(".example h3");

    public void windowsTest(){
        link.click();
        openTab.click();
        switchTo().window(1);
        textDiv.shouldHave(exactText("New Window"));
        closeWindow();
        back();
    }
}
