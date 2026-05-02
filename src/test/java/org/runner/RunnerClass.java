package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\win\\eclipse-workspace\\AdactinHotels\\src\\test\\resources\\FeatureFiles",
glue="org.stepDefinition",snippets = SnippetType.CAMELCASE)

public class RunnerClass {

}
