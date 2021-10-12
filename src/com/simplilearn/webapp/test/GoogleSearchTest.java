package com.simplilearn.webapp.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {

		// 1. Formulate a test url
		String siteUrl = "https://www.google.com/";
		String driverPath = "drivers/chromedriver";

		// 2. Set selenium system properties
		System.setProperty("webdriver.chrome.driver", driverPath);

		// 3. Instantiate selenium webdriver
		WebDriver driver = new ChromeDriver();

		// 4. lauch browser
		driver.get(siteUrl);

		// search test
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("selenium documentation");
		searchBox.submit();  // submit search
		
		// 5. perform test
		
		String expectedTitle ="selenium documentation - Google Search";
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Test is passed !");
		} else {
			System.out.println("Test is failed !");
		}
		System.out.println("Expected Title : "+expectedTitle);
		System.out.println("Actual Title : "+actualTitle);
		
		// 6. close driver
		driver.close();
		
		
	}
}
