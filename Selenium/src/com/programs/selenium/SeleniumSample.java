package com.programs.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumSample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shine\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://google.com");
		

	}

}
