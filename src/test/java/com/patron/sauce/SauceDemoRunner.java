package com.patron.sauce;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/patron/sauce/features",
        glue = "com.patron.sauce.stepDefinitions",
        plugin = {"json:target/cucumber-reports.json", "junit:target/cucumber-reports"})
public class SauceDemoRunner {

}
