package com.mindtree.pageobject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mindtree.reusablecomponents.ReadPropertyFile;
import com.mindtree.uistore.loginpage;
import com.mindtree.uistore.mainpage;


public class maintest extends ReadPropertyFile {

	//private static Logger log = LogManager.getLogger(ReadPropertyFile.class.getName());
	private static Logger log = Logger.getLogger(ReadPropertyFile.class.getName());

	@BeforeTest
	public void loadpage() throws IOException {
		driver = initDriver();
		driver.get(p.getProperty("url"));
		// driver.get("https://elocalshops.com");
	}

	@Test(dataProvider = "getData")
	public void login(String email, String pass) {
		mainpage l = new mainpage(driver);
		l.getlogin().click();

		log.info("Page loaded Successfully");

		loginpage lg = new loginpage(driver);
		lg.getmail().sendKeys(email);
		lg.getpass().sendKeys(pass);

		log.info("Entered login Details Successfully");

		lg.getsubmit().click();
		log.info("Submitted Details Successfully");
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] obj = new Object[1][2];
		obj[0][0] = "gagan@gmail.com";
		obj[0][1] = "password";

		return obj;
	}

	@AfterTest
	public void terminate() {
		driver.close();
		log.info("Closed the browser");
	}
}
