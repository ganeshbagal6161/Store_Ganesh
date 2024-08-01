package com.Store_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Phone_Product_Page {
	public Phone_Product_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div[@class='caption'])[2]/h4/a")
	private WebElement Iphone;

	public WebElement getIphone() {
		return Iphone;
	}
	
	

}
