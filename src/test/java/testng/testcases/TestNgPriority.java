package testng.testcases;

import org.testng.annotations.Test;

public class TestNgPriority {

	
	@Test(groups = {"sanity"})
	public void test1()
	{
		System.out.println("ab");
	}
	
	//priority is used to decide priority which testcase execute first & highest priority for less number
	
	
	
	@Test(groups = {"smoke","regression"})
	public void test66()
	{
		System.out.println("fd");
	}
	
	
	@Test(priority = 2)
	public void test2()
	{
		System.out.println("fd");
	}
	
	
	@Test(priority = 4)
	public void test3()
	{
		System.out.println("cd");
	}
	
	
	
	// if two test case having same priority in that case it will excecute by order
	@Test(groups = {"sanity"})
	public void test4()
	{
		System.out.println("ef");
	}
	
}
