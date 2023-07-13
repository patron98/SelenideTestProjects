package com.patron.uiTrainingApp.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.StaleElementReferenceException;

import java.util.List;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class CoconutPage {

    private final List<SelenideElement> coconutImages = $$(".snow img[src='assets/images/donkey/nuts.png']");
    private final SelenideElement button = $x("//button[@id='login-button']");
    private final SelenideElement kong = $("#kong");
    private final SelenideElement grandpa = $("#grandpa");


    public void click15Coconuts() {
        int count = 0;
        while (count < 16) {
            SelenideElement coconut = coconutImages.get(count);
            coconut.click();
            count++;

        }
    }


    public void verifyCoconuts() {
        String success = "Ok, congratz you've done it, now move on with your life";
        button.shouldBe(visible).shouldHave(exactText(success)).click();
        kong.shouldBe(visible);
        grandpa.shouldBe(visible);
    }
}
