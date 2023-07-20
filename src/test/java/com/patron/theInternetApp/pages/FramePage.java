package com.patron.theInternetApp.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.*;

public class FramePage {

    private final SelenideElement link = $(byLinkText("Frames"));
    private final SelenideElement nestedLink = $(byLinkText("Nested Frames"));
    private final SelenideElement leftFrame = $("frame[src='/frame_left'][name='frame-left']");
    private final SelenideElement middleFrame = $("frame[src='/frame_middle'][name='frame-middle']");
    private final SelenideElement rightFrame = $("frame[src='/frame_right'][name='frame-right']");
    private final SelenideElement bottomFrame = $("frame[src='/frame_bottom'][name='frame-bottom']");

    private final SelenideElement iFrameLink = $(byLinkText("iFrame"));
    private final SelenideElement input = $("#tinymce");

    public void FramesTest(){
        link.click();
        nestedLinkTest();
        iFrameLinkTest();
        back();
    }

    private void nestedLinkTest() {
        nestedLink.click();

        switchTo().frame(0);
        switchTo().frame(leftFrame);
        $("body").shouldHave(text("LEFT"));
        switchTo().defaultContent();

        switchTo().frame(0);
        switchTo().frame(middleFrame);
        $("body").shouldHave(text("MIDDLE"));
        switchTo().defaultContent();

        switchTo().frame(0);
        switchTo().frame(rightFrame);
        $("body").shouldHave(text("RIGHT"));
        switchTo().defaultContent();

        switchTo().frame(bottomFrame);
        $("body").shouldHave(text("BOTTOM"));
        back();
    }

    private void iFrameLinkTest() {
        iFrameLink.click();
        switchTo().frame(0, Duration.ofSeconds(5));
        input.clear();
        input.sendKeys("this is content is a Iframe");
        back();
    }


}
