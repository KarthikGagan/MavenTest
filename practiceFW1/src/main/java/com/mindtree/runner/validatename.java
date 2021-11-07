package com.mindtree.runner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mindtree.reusablecomponents.ReadPropertyFile;
import com.mindtree.uistore.mainpage;


public class validatename extends ReadPropertyFile {

	private static Logger log = LogManager.getLogger(ReadPropertyFile.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initDriver();
		log.info("Driver is initialized");
		driver.get("https://elocalshops.com");
		log.info("Navigated to homepage");
	}
	
	@Test
	public void basehomepage()
	{
		
		mainpage m = new mainpage(driver);
		
		m.getbook1().click();
		//Assert.assertEquals(m.getTiltle().getText(), "Sudha Murthy Books Combo (Set of 6)- Paperback");
		System.out.println(m.getTiltle().getText());
		//log.info("Successfully validated TEXT message");
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver = null;
	}
}
