package omayo.testcases;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.testng.annotations.Test;

import utilities.Utility;

public class VerifyTableDate extends BaseTest{

	
	
	@Test
	public void verifyDate()

	{
		
		ArrayList<String> expectedDataTable = new ArrayList<>();
		
		expectedDataTable.add("Kishore");
		expectedDataTable.add("22");
		expectedDataTable.add("Delhi");
		expectedDataTable.add("Manish");
		expectedDataTable.add("25");
		expectedDataTable.add("Pune");
		expectedDataTable.add("Praveen");
		expectedDataTable.add("29");
		expectedDataTable.add("Banglore");
		expectedDataTable.add("Dheepthi");
		expectedDataTable.add("31");
		expectedDataTable.add("Mumbai");
		
		
		assertEquals(Utility.getAllTabelData(driver, "//table[@id='table1']/tbody/tr/td"), expectedDataTable);
	}
}
