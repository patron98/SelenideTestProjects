package com.patron.theInternetApp;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/patron/theInternetApp/features",
        glue = "com.patron.theInternetApp.stepDefinitions",
        plugin = {"json:target/theInternetApp/cucumber-reports.json", "junit:target/theInternetApp/cucumber-reports"})
public class TheInternetRunner {
}
