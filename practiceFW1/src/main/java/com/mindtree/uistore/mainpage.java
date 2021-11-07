package com.mindtree.uistore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mainpage {

	
	public WebDriver driver;
	
	public mainpage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(linkText = "Login")
	WebElement login;
	
	public WebElement getlogin()
	{
		return login;
	}
	
	@FindBy(xpath="//input[@name='q']")
	WebElement search;
	
	public WebElement getsearch()
	{
		return search;
	}
	
	@FindBy(linkText="Sudha Murthy Books Combo (Set of 6)- Paperback")
	WebElement book1;
	
	public WebElement getbook1()
	{
		return book1;
	}
	
	@FindBy(xpath = "//*[@id=\"shopify-section-static-product\"]/section/article/div[2]/div[1]/h1")
	WebElement title;
	
	public WebElement getTiltle()
	{
		return title;
	}
}
