package com.automation.deel.stepsDefinition;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SalaryPageStepsDefinition {
	
	@Given("^I am on Deel salary page$")
	public void i_am_on_deel_salary_website() {
		TestManagement.deelAutomation.salaryPage.openPage();
	}
	
	@When("^I select (.*?) as role$")
	public void select_role(String role) {
		TestManagement.deelAutomation.salaryPage.selectRole(role);
	}
	
	@When("^I select (.*?) as country$")
	public void select_country(String country) {
		TestManagement.deelAutomation.salaryPage.selectCountry(country);
	}
	
	@When("^I click on search$")
	public void click_on_search() {
		TestManagement.deelAutomation.salaryPage.clickOnSearch();
	}
	
	@Then("^Chart results for role (.*?) in country(.*?) should be displayed$")
	public void right_chart_displayed(String role, String country) {
		assertTrue(TestManagement.deelAutomation.salaryPage.isRightChartResultTitleDisplayed(role, country));
	}

}
