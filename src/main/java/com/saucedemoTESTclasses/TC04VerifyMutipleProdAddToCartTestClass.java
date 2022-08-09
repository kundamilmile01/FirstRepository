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

public class TC04VerifyMutipleProdAddToCartTestClass extends TestBaseClass{

	
	@Test
	public  void verifymultipleproduct()
	{
		// TODO Auto-generated method stub
		
		
		HomePomClass hp = new HomePomClass(driver);
		hp.clickallproducts();
		System.out.println("clicked all products");
		
		String expectedcount = "6";
		String actualcount = hp.gettextaddtocartbutton();
		 
		Assert.assertEquals(actualcount, expectedcount);
	}
	
		

	}


