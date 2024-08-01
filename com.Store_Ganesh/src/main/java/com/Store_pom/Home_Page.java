package com.Store_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[contains(@class,'collapse navbar-collapse')]/ul/li[6]")
	private WebElement Phones;
	
	public WebElement getPhones() {
		return Phones;
	}
	
//	@FindBy(xpath = "(//a[text()='Logout'])[2]")
//	private WebElement Logot;



//	public WebElement getLogot() {
//		return Logot;
//	}
//	
	
	
	

}
