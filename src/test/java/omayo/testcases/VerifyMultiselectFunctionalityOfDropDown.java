package omayo.testcases;


import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

import omayo.blog.pages.HomePage;
import utilities.Utility;


public class VerifyMultiselectFunctionalityOfDropDown extends BaseTest{
	
	HomePage page;
	

	@Test
	
	public void verifyMultiselectFunctionalityOfDropdown()
	{
		
		page = new HomePage(driver);
		
		String [] options = {"Audi","Volvo"};
		ArrayList<String> selectOptions = Utility.selectOptionFromDropDown(page.getMultiselectDropdownLocator(), options);
		
		assertEquals(selectOptions, Arrays.asList("vo","Audi"));
	}
	
	
	
}

