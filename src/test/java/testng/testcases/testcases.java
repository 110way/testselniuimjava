package testng.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.Utility;

public class testcases {

	Utility util;
	
	@Test  //annotations
	public void verifyPageTitle() throws IOException
	{
		
		util = new Utility();
		WebDriver driver =  util.getDriver();
		
		Assert.assertEquals(driver.getTitle(), "omayo (QAFox.com)"); // this is assertion shows pass fail 
	}
	
}
