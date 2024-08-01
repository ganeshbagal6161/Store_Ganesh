package com.Store_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "email")
	private WebElement EmailTf;
	
	@FindBy(name = "password")
	private WebElement PasswordTf;
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement LoginBtn;
	
	

	public WebElement getEmailTf() {
		return EmailTf;
	}

	public WebElement getPasswordTf() {
		return PasswordTf;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	
	

}
