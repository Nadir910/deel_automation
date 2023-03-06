package com.automation.deel;

import org.openqa.selenium.WebDriver;

import com.automation.deel.pages.SalaryPage;

public class DeelAutomation {
	
	public WebDriver driver;
	public SalaryPage salaryPage;
	
	public DeelAutomation(WebDriver driver) {
		this.driver = driver;
		salaryPage = new SalaryPage(driver);
	}

}
