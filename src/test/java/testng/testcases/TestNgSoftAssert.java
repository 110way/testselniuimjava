package testng.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.Utility;

public class TestNgSoftAssert {

	Utility util;
	
	SoftAssert verify = new SoftAssert();
	
	
	@Test  //annotations
	public void verifyPageTitle() throws IOException
	{
		
		util = new Utility();
		WebDriver driver =  util.getDriver();
		
		verify.assertEquals(driver.getTitle(), "omayo (QAFox.com)","Title is equal 0"); // this compare actual and expected result
		
		verify.assertTrue(driver.getTitle().equals("omayo (QAFox.com)") ,"Title is equal 1"); // if given condition is true it will return true
		
		verify.assertNotEquals(driver.getTitle(),"omayo (QAFox.com)","Title is equal 2"); // 
		
	    System.out.println("fail 1");

		verify.assertFalse(driver.getTitle().equals("omayo (QAFox.com)"),"Title is equal 3");
		
	    System.out.println("fail 2cq"); 

		
		verify.assertAll(); // always call assert all at end of your testcase
		
//		{  in soft assert code will excecute even after any asssertion fails }
	}
	
}
