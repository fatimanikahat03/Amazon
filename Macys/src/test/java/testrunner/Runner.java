package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.lang.invoke.MethodHandles;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/featurefile"},
glue = {"stepdefinition"},
tags = "@C2",
plugin = {"pretty","html:target/cucumber.html","json:target/json1.json","junit:target/junit1.xml",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class Runner {
}
