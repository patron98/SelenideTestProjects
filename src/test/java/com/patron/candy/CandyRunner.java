package com.patron.candy;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/patron/candy/features",
        glue = "com.patron.candy.stepDefinitions",
        plugin = {"json:target/cucumber-reports.json", "junit:target/cucumber-reports"})
public class CandyRunner {

}
