package testng.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.Utility;

public class ParellalTesting {

WebDriver driver;
	
	@BeforeMethod
	public void setup()throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(Utility.getProperty("url1"));
		
		driver.manage().window().maximize();
	}

	@Test
	public void verifyValidLogin()
	{
		
		
		
		driver.findElement(By.xpath("//input[@name = 'userName']")).sendKeys("user1");
		
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("password1");
		
		driver.findElement(By.xpath("//input[@name = 'userName']")).click();
		
		WebElement loginmessage = driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
		
		assertEquals(loginmessage.getText(),"Login Successfully","User not logged in successfully");
		
		
	}
	
	@Test
	public void verifyBrowser() {
		
		assertEquals(driver.getTitle(), "Welcome: Mercury Tours");
	}
	
	
	@Test
	public void verifyURL() {
		
		assertEquals(driver.getCurrentUrl(), "https://demo.guru99.com/test/newtours/index.php");
	}
	
	@AfterMethod
	
	public void testDown() {
		driver.quit();
	}
}

