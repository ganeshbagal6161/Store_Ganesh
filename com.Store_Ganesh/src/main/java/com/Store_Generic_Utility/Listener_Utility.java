package com.Store_Generic_Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class Listener_Utility implements ITestListener , ISuiteListener {
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Java_Utility java=new Java_Utility();

		TakesScreenshot ts=(TakesScreenshot)Base_Test.sDriver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File(Framework_Constant.screenshotPath+java.localDateTime()+".png");
		
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	

}
