package com.mindtree.uistore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	public WebDriver driver;
	
	public loginpage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@name='customer[email]']")
	WebElement email;
	
	public WebElement getmail()
	{
		return email;
	}
	
	@FindBy(xpath="//input[@name='customer[password]']")
	WebElement pass;
	
	public WebElement getpass()
	{
		return pass;
	}
	
	@FindBy(xpath="(//button[@type='submit'])[6]")
	WebElement submit;
	
	public WebElement getsubmit()
	{
		return submit;
	}
}
