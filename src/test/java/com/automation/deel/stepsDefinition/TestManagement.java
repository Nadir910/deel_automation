package com.automation.deel.stepsDefinition;

import org.openqa.selenium.WebDriver;

import com.automation.deel.DeelAutomation;
import com.automation.deel.abstraction.AbstractPage;
import com.automation.deel.configuration.DriverFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TestManagement {
	
	public WebDriver driver;
	public static DeelAutomation deelAutomation;
	public static AbstractPage abstractPage;
	
	@Before
	public void initialization() {
		driver = DriverFactory.initializeDriver();
		deelAutomation = new DeelAutomation(driver);
		abstractPage = new AbstractPage(driver);
	}
	
	@After
	public void quitDriver() {
		driver.quit();
	}


}
