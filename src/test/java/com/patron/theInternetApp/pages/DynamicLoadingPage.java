package com.patron.theInternetApp.pages;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.back;

public class DynamicLoadingPage {

    private final SelenideElement link = $(byLinkText("Dynamic Loading"));
    private final SelenideElement example1 = $(byPartialLinkText("Example 1"));
    private final SelenideElement example2 = $(byPartialLinkText("Example 2"));
    private final SelenideElement startButton = $("button");
    private final SelenideElement success = $("#finish h4");

    public void DynamicLoadTest(){
        link.click();
        example1Test();
        example2Test();
        back();
    }

    private void example1Test() {
        example1.click();
        startButton.click();
        success.shouldBe(visible, Duration.ofSeconds(10)).shouldHave(exactText("Hello World!"));
        back();
    }

    private void example2Test() {
        example2.click();
        startButton.click();
        success.shouldBe(visible, Duration.ofSeconds(10)).shouldHave(exactText("Hello World!"));
        back();
    }
}
