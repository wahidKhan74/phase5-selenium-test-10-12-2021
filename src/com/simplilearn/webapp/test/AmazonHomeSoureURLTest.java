package com.simplilearn.webapp.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHomeSoureURLTest {

	public static void main(String[] args) {

		// 1. Formulate a test url
		String siteUrl = "https://www.amazon.in/";
		String driverPath = "drivers/chromedriver";

		// 2. Set selenium system properties
		System.setProperty("webdriver.chrome.driver", driverPath);

		// 3. Instantiate selenium webdriver
		WebDriver driver = new ChromeDriver();

		// 4. launch browser
		driver.get(siteUrl);
		
		// 5. perform test
		
		if(siteUrl.equals(driver.getCurrentUrl())) {
			System.out.println("Test is passed !");
		} else {
			System.out.println("Test is failed !");
		}
		
		// 6. close driver
		driver.close();

	}

}
