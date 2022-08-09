package com.saucedemoPOMclasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePomClass {
	
	private WebDriver driver;
	private Select s;
	
	@FindBy(xpath="/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[1]/div/button")
	private WebElement allbutton;
	
	public void clickallbutton() 
	{
		allbutton.click();
	}
	
	@FindBy(xpath="/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[3]")
	private WebElement logoutbutton;
	
	public void clicklogoutbutton() 
	{
		logoutbutton.click();
	}
	
	@FindBy(xpath="//button[@id=\"add-to-cart-sauce-labs-backpack\"]")
	private WebElement bagproduct;
	
	public void clickBagproduct() 
	{
		bagproduct.click();
	}
	
	
	@FindBy(xpath="//button[text()='Add to cart']")
	 List <WebElement> allproducts;
	
	public void clickallproducts() 
	{
		for(WebElement allprod : allproducts) 
		{
		 allprod.click();
			 
		}
		 
	
	}
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement dropdown;
	
	public void clickdropdown() 
	{
		dropdown.click();
		
		s.selectByVisibleText("Name (Z to A)");
	}
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement addtocartbutton;
	
	public String gettextaddtocartbutton() 
	{
		String totalproduct = addtocartbutton.getText();
		return totalproduct;
	}
	
	public HomePomClass(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		s = new Select(dropdown);
	}

}
