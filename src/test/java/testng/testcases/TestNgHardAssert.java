package testng.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.Utility;

public class TestNgHardAssert {
	
	
Utility util;
	
	
	
	
	@Test  //annotations
	public void verifyPageTitle() throws IOException
	{
		
		util = new Utility();
		WebDriver driver =  util.getDriver();
		
		assertEquals(driver.getTitle(), "omayo (QAFox.com)","Title is equal 0"); // this compare actual and expected result
		
	    assertTrue(driver.getTitle().equals("omayo (QAFox.com)") ,"Title is equal 1"); // if given condition is true it will return true
		
	    assertNotEquals(driver.getTitle(),"omayo (QAFox.com)","Title is equal 2"); // 
		
	    
	    System.out.println("fail 1");
		assertFalse(driver.getTitle().equals("omayo (QAFox.com)"),"Title is equal 3");
	    System.out.println("fail 2");

		
// in hard assert if any assert condition fail then next code will not executed		

	}
	
}
