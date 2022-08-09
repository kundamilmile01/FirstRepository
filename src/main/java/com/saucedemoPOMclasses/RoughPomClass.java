package com.saucedemoPOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RoughPomClass {
	
	private WebDriver driver;
	private Select s;
	
	@FindBy(xpath="//iframe[@id='frame2']")
	private WebElement framelement;
	
	public WebElement getelement() 
	{
		return framelement;
	}

	@FindBy(xpath="//select[@id='animals']")
	private WebElement dropdown;
	
	public void clickdropdown() 
	{
		dropdown.click();
		
		s.selectByVisibleText("Baby Cat");
	}
	
    
	public RoughPomClass(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		s = new Select(dropdown);
	}
	
}
