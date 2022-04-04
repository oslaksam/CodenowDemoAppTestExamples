package com.cucumberselenium;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/demoapp.feature"},
        glue = {"com.cucumberselenium"},
        plugin = {"pretty", "html:target/cucumber-reports"})
public class DemoAppCucumberTest {
}