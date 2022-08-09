package com.saucedemoTESTclasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.saucedemoPOMclasses.HomePomClass;
import com.saucedemoPOMclasses.LoginPomClass;

public class TC03VerifyBagProductTestClass extends TestBaseClass
{
     
	
	@Test
	public  void verifybagproduct()
	{
		// TODO Auto-generated method stub
		
		
		HomePomClass hp = new HomePomClass(driver);
		
		hp.clickBagproduct();
		System.out.println("bagproduct clicked");
		
		String expectedcount = "1";
		String actualcount = hp.gettextaddtocartbutton();
		 
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actualcount, expectedcount);
		// while using soft assetion we need to use softassert class and use assert all method
		soft.assertAll();
	}
	
	
		

	}


