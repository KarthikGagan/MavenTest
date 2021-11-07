package com.mindtree.pageobject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mindtree.reusablecomponents.ReadPropertyFile;
import com.mindtree.uistore.mainpage;


public class searchitem extends ReadPropertyFile {

	//private static Logger log = LogManager.getLogger(ReadPropertyFile.class.getName());
	private static Logger log = Logger.getLogger(ReadPropertyFile.class.getName());
	@BeforeTest
	public void loadpage() throws IOException {
		driver = initDriver();
		driver.get("https://elocalshops.com");
	}

	@Test(dataProvider = "getbook")
	public void search(String searchobj) {
		mainpage l = new mainpage(driver);
		l.getsearch().sendKeys(searchobj);
		l.getsearch().sendKeys(Keys.ENTER);
		log.info("Searched for Books");
	}

	@DataProvider
	public Object[][] getbook() {
		Object[][] o = new Object[1][1];
		o[0][0] = "Books";
		return o;
	}

	@AfterTest
	public void terminate() {
		driver.close();
		log.info("Closed the browser");
	}

}
