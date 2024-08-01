package com.Store_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome_Page {
	public Welcome_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//a[contains(@title,'My Account')]")
	private WebElement AccountBtn;
	
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement LoginBtn;


	public WebElement getAccountBtn() {
		return AccountBtn;
	}


	public WebElement getLoginBtn() {
		return LoginBtn;
	}

}
