package com.patron.theInternetApp.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Alert;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.*;
import static junit.framework.TestCase.assertEquals;

public class JavaScriptAlerts {
    private final SelenideElement link = $(byLinkText("JavaScript Alerts"));
    private final SelenideElement jsAlertButton = $("button[onclick='jsAlert()']");
    private final SelenideElement jsConfirmButton = $("button[onclick='jsConfirm()']");
    private final SelenideElement jsPromptButton = $("button[onclick='jsPrompt()']");
    private final SelenideElement result = $("#result");

    public void javaScriptTest(){
        link.click();
        jsAlert();
        jsConfirm();
        jsPrompt();
        back();
    }

    private void jsPrompt() {
        jsPromptButton.click();
        String message = "Hello World";
        Alert alert = switchTo().alert();
        assertEquals("I am a JS prompt", alert.getText());
        alert.sendKeys(message);
        alert.accept();
        result.shouldHave(exactText("You entered: " + message));
    }

    private void jsConfirm() {
        jsConfirmButton.click();
        Alert alert = switchTo().alert();
        assertEquals("I am a JS Confirm", alert.getText());
        alert.accept();
        result.shouldHave(exactText("You clicked: Ok"));
    }

    private void jsAlert() {
        jsAlertButton.click();
        switchTo().alert().accept();
        result.shouldHave(exactText("You successfully clicked an alert"));
    }
}
