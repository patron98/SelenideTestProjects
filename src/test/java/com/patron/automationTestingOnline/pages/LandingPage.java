package com.patron.automationTestingOnline.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LandingPage {

    private final By bookButton = byXpath("//button[text()='Book this room']");
    private final By firstnameInput = byName("firstname");
    private final By lastnameInput = byName("lastname");
    private final By emailInput = byName("email");
    private final By phoneInput = byName("phone");
    private final By bookConfirmation = byXpath("//button[text()='Book']");
    private final SelenideElement calendar = $(byClassName("rbc-calendar"));
    private final By nextButton = byXpath("//button[text()='Next']");
    private final By success = byCssSelector("h3");
    private final By successDate = byXpath("//div[@class='col-sm-6 text-center']//p[2]");

    public void fillInForm(String firstname, String lastname, String email, String phone) {
        $(firstnameInput).sendKeys(firstname);
        $(lastnameInput).sendKeys(lastname);
        $(emailInput).sendKeys(email);
        $(phoneInput).sendKeys(phone);
    }

    public void clickButton() {
        $(bookButton).click();
    }

    public void selectDate(String startDate, String endDate) {
        $(nextButton).click();
        SelenideElement startDateElement = calendar.$(byText(startDate));
        SelenideElement endDateElement = calendar.$(byText(endDate));
        Actions actions = new Actions(WebDriverRunner.getWebDriver());
        actions.clickAndHold(startDateElement)
                .moveToElement(endDateElement)
                .release()
                .build()
                .perform();
        $(bookConfirmation).click();
    }

    public void verifyBooking(String startDate, String endDate) {
        String confirmation = "Booking Successful!";
        String date = String.format("2023-07-%s - 2023-07-%s", startDate, endDate);
        $(success).shouldHave(exactText(confirmation));
        $(successDate).shouldHave(text(date));
    }
}
