package com.karunia.step_definition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,
        tags = "@Test28",
        plugin = {"pretty", "html:target/site/cucumber-pretty.html"},
        features = {"src/test/resources/features"},
        glue = {"org.example", "com.karunia.step_definition"}
)
public class RunCukesTest {
}
