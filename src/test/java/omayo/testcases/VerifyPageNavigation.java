package omayo.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import omayo.blog.pages.HomePage;
import omayo.blog.pages.Selenium142;
import utilities.Utility;

public class VerifyPageNavigation extends BaseTest{

	HomePage page;
	Selenium142 seleniumpage;
	@Test
	public void verifyNavigation()
	{
		page = new HomePage(driver);
		
		seleniumpage = new Selenium142(driver);
		
		page.clickOnThisBlogCreatedForLink();
		
		String parentWindowHandle = Utility.switchToNewWindow(driver);
		
		assertEquals(seleniumpage.getLinkText(),"what is Selenium?");
		
		driver.close();
		

		Utility.switchToWindow(driver, parentWindowHandle);
		
		assertEquals(driver.getTitle(), "omayo (QAFox.com)");
	}
	
	
}
