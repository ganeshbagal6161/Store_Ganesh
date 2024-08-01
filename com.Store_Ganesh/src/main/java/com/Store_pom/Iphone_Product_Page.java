package com.Store_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Iphone_Product_Page {
	public Iphone_Product_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement AddCart;

   @FindBy(xpath = "(//button[contains(@data-original-title,'Add to Wish List')])[1]")
   private WebElement Wishlist;

public WebElement getAddCart() {
	return AddCart;
}

public WebElement getWishlist() {
	return Wishlist;
}
   
}
