package com.careerhack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {

	
	WebDriver driver;
  
	public 	PageObjects(WebDriver driver){
		
    	this.driver = driver;
    	PageFactory.initElements(driver,this);
	}
	
	//WebElement SearchBox;
	//SearchBox = driver.findElement(By.name("q"));
	@FindBy(name="q")
	WebElement searchBox;
	
     //SearchBox.sendKeys(string);
     public void enterSearch(String text) {
	    searchBox.sendKeys(text);
 }
    // WebElement searchbtn;
 	//searchbtn = driver.findElement(By.name("btnK"));
 	@FindBy(name = "btnK")
     WebElement searchBtn;
 	//Searchbtn.click();
 	//searchbtn.submit();
 	public void clickSearch() {
 		searchBtn.submit();
 	}
	
 	
 	//WebElement resultStats;
//resultStats = driver.findElement(By.id("result-stats"));
 	@FindBy(name = "result-stats")
 	WebElement resultStats;
	//String results = resultStats.getText();
	//System.out.println("=======================");
	//System.out.println(results);
	//System.out.println("=======================");
	public void  results() {
		System.out.println("=======================");
		System.out.println(resultStats);
		System.out.println("=======================");
	}
	
	public void close() {
		driver.close();
	}
	
}
