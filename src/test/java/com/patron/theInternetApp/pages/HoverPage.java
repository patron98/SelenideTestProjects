package com.patron.theInternetApp.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.*;

public class HoverPage {

    private final SelenideElement link = $(byLinkText("Hovers"));
    private final ElementsCollection users = $$(".figure");

    public void hoverTest() {
        link.click();
        for (int i = 0; i < users.size(); i++) {
            SelenideElement userElement = users.get(i);
            userElement.hover();
            userElement.find(".figcaption h5").shouldBe(visible).shouldHave(text("name: user" + (i + 1)));
            back();
        }
    }
}
