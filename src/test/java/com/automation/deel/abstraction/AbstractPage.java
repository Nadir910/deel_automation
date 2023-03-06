package com.automation.deel.abstraction;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.deel.automation.utils.GenericFunctions;

public class AbstractPage {
	
	protected WebDriver driver;
	
	public AbstractPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean isElementPresentAfterWait(WebElement element, int timeoutSeconds) {
		int i=0;
		while(i < timeoutSeconds) {
			try {
				if(element.isDisplayed()) {
					return true;
				}
			} catch(NoSuchElementException | StaleElementReferenceException e) {
				GenericFunctions.waitForSeconds(1);
				i++;
			}
		}
		return false;
	}

}
