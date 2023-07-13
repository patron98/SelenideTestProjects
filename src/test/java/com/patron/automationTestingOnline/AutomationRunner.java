package com.patron.automationTestingOnline;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/patron/automationTestingOnline/features",
        glue = "com.patron.automationTestingOnline.stepDefinitions",
        plugin = {"json:target/cucumber-reports.json", "junit:target/cucumber-reports"})
public class AutomationRunner {

}
