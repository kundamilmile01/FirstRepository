package com.saucedemoPOMclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPomClass {

	
		// TODO Auto-generated method stub

		
		
		//WebElement username = driver.findElement(By.xpath(null));
		//username.sendKeys();
		//do not use this method to find element
		// we will take help of Annotation starts from==@ acts like method 
		//to find the element by standard way ===and easily inspect the elements
	
	   //1.WebDriver declaration
		private WebDriver driver;
		private Actions act;
	
		//2.FindElement
		@FindBy(id="user-name")
		private WebElement username;
		
		//3.element action method
		
		public void sendUsername() 
		{
			username.sendKeys("standard_user");
		}
	
		@FindBy(id="password")
		 private WebElement password;
		//4.create constructor of class
		
		public void sendPassword()
		{
			password.sendKeys("secret_sauce");
		}
		
		@FindBy(id="login-button")
		 private WebElement login;
		//4.create constructor of class
		
		public void clickLogin()
		{
			//login.click();
			
		    
			act.click(login).perform();
		}
		
		public LoginPomClass(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
			act = new Actions(driver);
		}
		
		
	

}
