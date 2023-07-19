package com.patron.theInternetApp.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.DragAndDropOptions.to;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DragAndDropPage {

    private final SelenideElement link = $(byLinkText("Drag and Drop"));
    private final SelenideElement columns = $(byId("columns"));
    private final SelenideElement objectA = $(byId("column-a"));
    private final SelenideElement objectB = $(byId("column-b"));

    public void dragAndDropTest() {
        link.click();
        objectA.dragAndDrop(to(objectB));
        assertEquals("column-b", columns.$$(".column").get(1).getAttribute("id"));
        back();
    }

}
