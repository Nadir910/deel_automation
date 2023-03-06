package com.deel.automation.utils;

import java.util.concurrent.TimeUnit;

public class GenericFunctions {
	
	public static void waitForSeconds(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
