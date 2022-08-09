package com.saucedemoTESTclasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucedemoPOMclasses.HomePomClass;
import com.saucedemoPOMclasses.LoginPomClass;
    
public class TC02VerifyLogoutTestClass extends TestBaseClass
{
	
	

	@Test
	public void verifylogout()
	{
		HomePomClass hp = new HomePomClass(driver);
		hp.clickallbutton();
		System.out.println("all menu button clicked");
		hp.clicklogoutbutton();
		System.out.println("logout button clicked");
		
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		
		 
		Assert.assertEquals(actualTitle, expectedTitle);
			
	} 
		
	

	}


