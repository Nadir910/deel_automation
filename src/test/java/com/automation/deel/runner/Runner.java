package com.automation.deel.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "cucumber/features",
				 glue = {"com.automation.deel.stepsDefinition"},
				 tags = {"@SearchSalaryInCountry"},
				 plugin = {"pretty", "html:target/cucumber-reports/cucumber-pretty"})
public class Runner {

}
