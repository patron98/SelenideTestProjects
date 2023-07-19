package com.patron.theInternetApp.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.checked;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.*;

public class CheckBoxPage {

    final SelenideElement checkboxLink = $(byLinkText("Checkboxes"));
    private final SelenideElement uncheckedBoxed = $x("//input[@type='checkbox'][1]");
    private final SelenideElement checkedBoxed = $x("//input[@type='checkbox'][2]");

    public void checkboxTest(){
        checkboxLink.click();
        uncheckedBoxed.shouldNotBe(checked).setSelected(true).shouldBe(checked);
        checkedBoxed.shouldBe(checked).setSelected(false).shouldNotBe(checked);
        back();
    }
}
