package com.Store_Ganesh;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Store_Generic_Utility.Base_Test;
import com.Store_pom.Iphone_Product_Page;
import com.Store_pom.Phone_Product_Page;


public class Verify_User_is_able_To_AddProduct extends Base_Test{
	
	@Test
	
	public void  addProduct() throws IOException, InterruptedException {
		
//		Login_Page login=new Login_Page(driver);
//		login.getEmailTf().sendKeys(file.readPropertyData("email"));
//		login.getPasswordTf().sendKeys(file.readPropertyData("password"));
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement phone_ele = wait.until(ExpectedConditions.elementToBeClickable(home.getPhones()));
		phone_ele.click();
		
		Phone_Product_Page productPage=new Phone_Product_Page(driver);
		
		wait.until(ExpectedConditions.elementToBeClickable(productPage.getIphone()));
		productPage.getIphone().click();
		
		
		Iphone_Product_Page iphonePage=new Iphone_Product_Page(driver);
		
		wait.until(ExpectedConditions.elementToBeClickable(iphonePage.getAddCart()));
	    iphonePage.getAddCart().click();
		
		
		wait.until(ExpectedConditions.elementToBeClickable(iphonePage.getWishlist()));
		iphonePage.getWishlist().click();
	}
	

}
