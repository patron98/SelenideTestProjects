package com.patron.theInternetApp.pages;

import com.codeborne.selenide.DragAndDropOptions;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.interactions.Actions;

import java.util.Objects;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.DragAndDropOptions.to;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.back;

public class SliderPage {

    private final SelenideElement link = $(byLinkText("Horizontal Slider"));
    private final SelenideElement slider = $("input[type='range']");
    private final SelenideElement value = $("#range");

    public void sliderTest() {
        link.click();
        int sliderWidth = slider.getSize().getWidth();

        double maxValue = Double.parseDouble(Objects.requireNonNull(slider.getAttribute("max")));
        double minValue = Double.parseDouble(Objects.requireNonNull(slider.getAttribute("min")));

        double range = maxValue - minValue;
        double stepValue = range / sliderWidth;

        double valueToSlide = maxValue * 0.9;

        int positionToSlide = (int) ((valueToSlide - minValue) / stepValue);

        new Actions(WebDriverRunner.getWebDriver())
                .clickAndHold(slider)
                .moveByOffset(positionToSlide, 0)
                .release()
                .perform();

        value.shouldHave(text("5"));
        back();
    }
}
