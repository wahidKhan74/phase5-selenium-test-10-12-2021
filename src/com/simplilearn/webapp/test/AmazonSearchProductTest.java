package com.simplilearn.webapp.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchProductTest {

	public static void main(String[] args) {

		// 1. Formulate a test url
		String siteUrl = "https://www.amazon.in/";
		String driverPath = "drivers/chromedriver";

		// 2. Set selenium system properties
		System.setProperty("webdriver.chrome.driver", driverPath);

		// 3. Instantiate selenium webdriver
		WebDriver driver = new ChromeDriver();

		// 4. lauch browser
		driver.get(siteUrl);
		
		
		// search product
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphone 12 max pro");
		searchBox.submit();
		
		// 5. perform test
		String expectedTitle ="Amazon.in : iphone 12 max pro";
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
