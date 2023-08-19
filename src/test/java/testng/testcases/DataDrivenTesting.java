package testng.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.Utility;

public class DataDrivenTesting {
	
	WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	public void setup()throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(Utility.getProperty("url1"));
		
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "usrData")
	public void verifyValidLogin(String uname,String pass) throws IOException
	{
		
		
		
		driver.findElement(By.xpath("//input[@name = 'userName']")).sendKeys(uname);
		
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(pass);
		
		driver.findElement(By.xpath("//input[@name = 'submit']")).click();
		
		WebElement loginmessage = driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
		
		assertEquals(loginmessage.getText(),"Login Successfully");
		
		
	}
	
	@DataProvider(name="usrData" ) // browser run code for 3 time 3 data sets
	public String[][] usrDataProvider()
	{
		String  users[][] = {{"user1","password1"},{"user2","password2"},{"user3","password3"}};
		
		return users;
	}
	
	
	@AfterMethod(alwaysRun = true)
	
	public void testDown() {
		driver.quit();
	}
}
