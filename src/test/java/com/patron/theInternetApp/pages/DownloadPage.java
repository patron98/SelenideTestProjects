package com.patron.theInternetApp.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class DownloadPage {

    private final SelenideElement link = $(byLinkText("File Download"));
    private final List<SelenideElement> links = $$("div.example a");

    public void downloadTest(){
        link.click();
        selectRandomLink(links);
        back();
    }
    public void selectRandomLink(List<SelenideElement> links){
        Random random = new Random();
        links.get(random.nextInt(links.size())).click();
    }
}
