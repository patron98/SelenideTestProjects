package com.patron.candy.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Dimension;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class CandyPage {

    private final SelenideElement xButton = $x("//div[@id='ef98684e-b67c-4535-8147-31bb7d59a05b']//div[@id='popup-widget63757']//svg[@id='popup-widget63757-close-icon']");

    public void clickXButton(){
        getWebDriver().manage().window().setSize(new Dimension(1728, 1079));
        xButton.shouldBe(visible).click();
    }
}
