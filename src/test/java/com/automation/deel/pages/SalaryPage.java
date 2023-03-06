package com.automation.deel.pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.deel.abstraction.AbstractPage;

public class SalaryPage extends AbstractPage {
	
	@FindBy(xpath="//input[@id='mui-2']/following-sibling::div/button[@title='Open']/div")
	private WebElement openRoleMenu;
	
	@FindBy(xpath="//input[@id='mui-4']/following-sibling::div/button[@title='Open']/div")
	private WebElement openCountryMenu;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchButton;
	
	@FindBy(xpath="//div[@data-qa='filter-bar']/following-sibling::div/h2")
	private WebElement chartResultTitle;
	
	public SalaryPage(WebDriver driver) {
		super(driver);
	}
	
	public void openPage() {
		driver.get("https://growth.deel.training/dev/salary-insights");
		assertTrue(openRoleMenu.isDisplayed());
	}
	
	public void selectRole(String role) {
		openRoleMenu.click();
		driver.findElement(By.xpath("//ul[contains(@class,'MuiAutocomplete')]//div[text()='"+ role +"']")).click();
	}
	
	public void selectCountry(String country) {
		openCountryMenu.click();
		driver.findElement(By.xpath("//ul[contains(@class,'MuiAutocomplete-listbox')]//div/p[text()='"+ country +"']")).click();
	}
	
	public void clickOnSearch() {
		searchButton.click();
	}
	
	public boolean isRightChartResultTitleDisplayed(String role, String country) {
		return isElementPresentAfterWait(chartResultTitle, 5)
			&& chartResultTitle.getText().contains(role)
				&& chartResultTitle.getText().contains(country);
	}

}
