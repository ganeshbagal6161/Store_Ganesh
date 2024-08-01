package com.Store_Generic_Utility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.Store_pom.Home_Page;
import com.Store_pom.Login_Page;
import com.Store_pom.Welcome_Page;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Base_Test {
	
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test;
	public static WebDriver sDriver;
	public File_Utility file=new File_Utility();
	public WebDriver driver;
	public Home_Page home;
	public Welcome_Page welcome;
	public Login_Page login;
	public Java_Utility util=new Java_Utility();
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest");
	    spark=new ExtentSparkReporter(Framework_Constant.reportPath+util.localDateTime()+ ".html");
	    report=new ExtentReports();
	    report.attachReporter(spark);
	    test=report.createTest("My Store");
	}
	
	@BeforeClass
	public void beforeClass() throws IOException {
		System.out.println("@BeforeClass");
		String browser = file.readPropertyData("browser");
		String url = file.readPropertyData("url");
		
		if(browser.contains("chrome")) {
		    driver=new ChromeDriver();
		}else if (browser.contains("firefox")) {
			driver=new FirefoxDriver();
		}else if (browser.contains("edge")) {
			driver=new EdgeDriver();
		}else {
			System.out.println("Please Provide Valid Browser Thank You....");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		home=new Home_Page(driver);	
		
	}
	
	@BeforeMethod
	public void beforeMethod() throws IOException {
		System.out.println("@BeforeMethod");
		welcome=new Welcome_Page(driver);
		 welcome.getAccountBtn().click();
		 WebElement ele = welcome.getLoginBtn();
		 
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
		 wait.until(ExpectedConditions.elementToBeClickable(ele));
		 ele.click();
		 
		 login=new Login_Page(driver);
		 login.getEmailTf().sendKeys(file.readPropertyData("email"));
		 login.getPasswordTf().sendKeys(file.readPropertyData("password"));
		 login.getLoginBtn().click();
		 
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod");
//		home.getLogot().click();
		
	}
	
	@AfterClass
	public void afterClass() throws InterruptedException {
		System.out.println("@AfterClass");
		Thread.sleep(3000);
		driver.quit();
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest");
		report.flush();
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("@AfterSuite");
	}

}
