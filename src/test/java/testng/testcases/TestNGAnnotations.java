package testng.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("beforesuit");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforetest");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeclass");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforesuit");
	}
	
	@Test
	public void testcase()
	{
		System.out.println("testcase");
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("aftermethod");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("aftertest");
	}
	
	
	@AfterSuite
	public void aftersuit()
	{
		System.out.println("aftersuit");
	}
	
}
