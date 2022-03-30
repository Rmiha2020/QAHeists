package com.careerhack.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleBeseHeists {

	 public WebDriver driver;
	 
	public void lunchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
	}
	}
	

