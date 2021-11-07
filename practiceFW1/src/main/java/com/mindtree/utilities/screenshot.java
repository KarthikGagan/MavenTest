package com.mindtree.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.mindtree.reusablecomponents.ReadPropertyFile;

public class screenshot extends ReadPropertyFile {

	public void getScreenshot(String result) throws IOException {
		java.io.File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,
				new File("D:\\Eclipse\\framework-workspace\\practiceFW1\\Screenshot\\" + result + "screenshot.png"));

	}
}
