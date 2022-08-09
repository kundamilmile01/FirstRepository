package com.saucedemoTESTclasses;

import java.io.IOException;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.saucedemoPOMclasses.LoginPomClass;
import com.saucedemoUTILITYclasses.ScreenshotClass;

public class TestBaseClass {
	
	 WebDriver driver;
	 
	  @Parameters("browserName")
	  @BeforeMethod
	  public void setUp(String browserName) throws IOException 
	  {
		  if(browserName.equals("chrome")) 
		  {
		  System.setProperty("webdriver.chrome.driver","./DriverFolder/chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Browser opened");
		  }
		  else 
		  {
			System.setProperty("webdriver.gecko.driver","./DriverFolder/geckodriver.exe");
			 driver = new FirefoxDriver();
			System.out.println("Browser opened");
		  }
			
			
			
			driver.manage().window().maximize();
			System.out.println("Window maximized");
			driver.get("https://www.saucedemo.com/");
			System.out.println("Url opened");
			ScreenshotClass.screenshootmethod(driver);
			System.out.println("screenshot has been taken");
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			LoginPomClass lp = new LoginPomClass(driver);
			lp.sendUsername();
			System.out.println("username send");
			lp.sendPassword();
			System.out.println("password send");
			lp.clickLogin();
			System.out.println("login button clicked");
			
			ScreenshotClass.screenshootmethod(driver);
			System.out.println("screenshot has been taken");
	  }
	  
	  @AfterMethod
		public void tearDown()
		{
			driver.quit();
			System.out.println("Browser closed");
		}
		

}
