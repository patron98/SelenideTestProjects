package com.patron.theInternetApp.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.back;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class DownloadPage {

    private final SelenideElement link = $(byLinkText("File Download"));
    private final SelenideElement downloadLink = $(byLinkText("10th Marksheet.pdf"));

    public void downloadTest(){
        link.click();
        downloadLink.click();
        Actions actions = new Actions(getWebDriver());
        actions.sendKeys(Keys.ENTER).perform();
        back();
    }
}
