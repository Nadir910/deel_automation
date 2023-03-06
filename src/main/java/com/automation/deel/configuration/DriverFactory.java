package com.automation.deel.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	public static WebDriver driver;
	private static final String driverPath = "src/main/resources/drivers/";
	private static String driverLocation;
	
	public static WebDriver initializeDriver() {
		driverLocation = driverPath + "chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverLocation);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

}
