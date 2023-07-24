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
    private final DynamicLoadingPage dynamicLoadingPage = new DynamicLoadingPage();
    private final FormAuthPage formAuthPage = new FormAuthPage();
    private final FramePage framePage = new FramePage();
    private final SliderPage sliderPage = new SliderPage();
    private final HoverPage hoverPage = new HoverPage();
    private final JQueryUIPage jQueryUIPage = new JQueryUIPage();
    private final JavaScriptAlerts javaScriptAlerts = new JavaScriptAlerts();
    private final WindowsPage windowsPage = new WindowsPage();

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

    @Then("i perform the Dynamic Load Test")
    public void iPerformTheDynamicLoadTest() {
        dynamicLoadingPage.DynamicLoadTest();
    }

    @Then("i perform the Form Auth Test with {string} {string}")
    public void iPerformTheFormAuthTest(String username, String password) {
        formAuthPage.formAuthPage(username, password);
    }

    @Then("i perform the Frame Test")
    public void iPerformTheFrameTest() {
        framePage.FramesTest();
    }

    @Then("i perform the Slider Test")
    public void iPerformTheSliderTest() {
        sliderPage.sliderTest();
    }

    @Then("i perform the Hover Test")
    public void iPerformTheHoverTest() {
        hoverPage.hoverTest();
    }

    @Then("i perform the JQuery Test")
    public void iPerformTheJQueryTest() {
        jQueryUIPage.jQueryTest();
    }

    @Then("i perform the JavaScript Alerts Test")
    public void iPerformTheJavaScriptAlertsTest() {
        javaScriptAlerts.javaScriptTest();
    }

    @Then("i perform the windows Test")
    public void iPerformTheWindowsTest() {
        windowsPage.windowsTest();
    }
}
