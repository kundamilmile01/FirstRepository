package com.saucedemoTESTclasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucedemoPOMclasses.LoginPomClass;
import com.saucedemoUTILITYclasses.ScreenshotClass;

public class TC01VerifyLoginTestClass extends TestBaseClass

{
	
	  @Test
	  public void verifylogin() throws IOException
	 {
		
	    String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		 
		Assert.assertEquals(actualTitle, expectedTitle);
		
	 }
	  
		
	

}
