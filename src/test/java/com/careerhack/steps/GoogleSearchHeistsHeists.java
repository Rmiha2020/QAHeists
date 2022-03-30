package com.careerhack.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.careerhack.common.GoogleBeseHeists;
import com.careerhack.pages.PageObjects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchHeistsHeists extends GoogleBeseHeists {

	
	
	@Given("I am on google homepage")
	public void i_am_on_google_homepage() {
		
		lunchBrowser();
	}

	@When("I enter a search {string}")
	public void i_enter_a_search(String string) {
		//step 1: identify the web element and give the element a name
		
		PageObjects po = new PageObjects(driver);
		po.enterSearch(string);
	
	
	}

	@When("I click on search button")
	public void i_click_on_search_button() {
	
	PageObjects po = new PageObjects(driver);
	po.clickSearch();
	}

	@Then("I see the number of results")
	public void i_see_the_number_of_results() {
		
		PageObjects po = new PageObjects(driver);
	po.results();
	po.close();
	}


}
