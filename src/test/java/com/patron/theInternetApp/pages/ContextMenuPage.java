package com.patron.theInternetApp.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static junit.framework.TestCase.assertEquals;

public class ContextMenuPage {

    private final SelenideElement contextLink = $(byLinkText("Context Menu"));

    private final SelenideElement contextMenu = $(byId("hot-spot"));

    public void testContextMenu(){
        String expected = "You selected a context menu";
        contextLink.click();
        contextMenu.contextClick();

        Alert alert = switchTo().alert();
        String actual = alert.getText();
        assertEquals("Text doesn't match", expected, actual);

        alert.accept();
        sleep(1000);

        Actions actions = new Actions(getWebDriver());
        actions.sendKeys(Keys.ESCAPE).perform();

        back();
    }
}
