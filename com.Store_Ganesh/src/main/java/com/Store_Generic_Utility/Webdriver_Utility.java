package com.Store_Generic_Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;


public class Webdriver_Utility {
	public void getWebPageScreenshot() throws IOException {
		TakesScreenshot ts=(TakesScreenshot) Base_Test.sDriver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("");
		FileHandler.copy(temp, dest);
		
	}
	
	public void getWebElementScreenshot(WebElement ele) throws IOException {
		File temp = ele.getScreenshotAs(OutputType.FILE);
		File dest = new File("");
		FileHandler.copy(temp, dest);
	}
	

}
