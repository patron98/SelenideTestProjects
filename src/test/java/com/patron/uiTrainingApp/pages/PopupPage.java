package com.patron.uiTrainingApp.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class PopupPage {

    private final List<SelenideElement> popUps = $$x("//span[starts-with(@id, 'button-close')]");
    private final SelenideElement confirmBanner = $("h1");
    private final SelenideElement button = $x("//button[@id='login-button']");

    //-----------------------------------------------------------------------------------------------------

    public void closePopUps() {
        for (SelenideElement popUp : popUps) {
            if (!popUp.is(interactable)) continue;
            String script = "arguments[0].click();";
            ((JavascriptExecutor) WebDriverRunner.getWebDriver()).executeScript(script, popUp);
        }
    }
    public void confirmPopUpsClosed() {
        String confirmation = "Ok, you've deleted all the ads... Are you happy now?";
        confirmBanner.shouldBe(visible).shouldHave(exactText(confirmation));
        button.shouldBe(visible).click();
    }
}
