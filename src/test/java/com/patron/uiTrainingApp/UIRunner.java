package com.patron.uiTrainingApp;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/patron/uiTrainingApp/features",
        glue = "com.patron.uiTrainingApp.stepDefinitions",
        plugin = {"json:target/uiTrainingApp/cucumber-report.json", "junit:target/uiTrainingApp/cucumber-reports"})
public class UIRunner {
}
