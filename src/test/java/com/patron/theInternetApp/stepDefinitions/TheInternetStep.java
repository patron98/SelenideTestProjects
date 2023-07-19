package com.patron.theInternetApp.stepDefinitions;

import com.patron.theInternetApp.pages.*;
import io.cucumber.java.en.Then;

public class TheInternetStep {

    private final CheckBoxPage checkBoxPage = new CheckBoxPage();
    private final ContextMenuPage contextMenuPage = new ContextMenuPage();
    private final DragAndDropPage dragAndDropPage = new DragAndDropPage();
    private final DropDownPage dropDownPage = new DropDownPage();
    private final DynamicControls dynamicControls = new DynamicControls();
    private final EntryAdd entryAdd = new EntryAdd();
    private final DownloadPage downloadPage = new DownloadPage();

    @Then("i perform the checkbox test")
    public void checkBoxTest() {
        checkBoxPage.checkboxTest();
    }

    @Then("i perform the context menu test")
    public void contextMenuTest() {
        contextMenuPage.testContextMenu();
    }

    @Then("i perform the Drag and Drop Test")
    public void iPerformTheDragAndDropTest() {
        dragAndDropPage.dragAndDropTest();
    }


    @Then("i perform the Dropdown Test")
    public void iPerformTheDropdownTest() {
        dropDownPage.dropDownTest();
    }

    @Then("i perform the Dynamic Control Test")
    public void iPerformTheDynamicControlTest() {
        dynamicControls.dynamicControlTest();
    }

    @Then("i perform the Entry Add Test")
    public void iPerformTheEntryAddTest() {
        entryAdd.entryAddTest();
    }

    @Then("i perform the Download Test")
    public void iPerformTheDownloadTest() {
        downloadPage.downloadTest();
    }
}
