package selenium.practices;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class HandleMultipleTabsWindow {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"); // this is code of invoking browser 
		
		WebDriver driver = new ChromeDriver (); // we have accessed chromdriver class
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize(); // By by =  By.xpath("//input")
		
		driver.findElement(By.xpath("//a[@id = 'selenium143']")).click();
		
		String windowSwitch = driver.getWindowHandle(); // this will change to another window
		
		Set<String> allWidowhandles = driver.getWindowHandles();
		
		for (String handle:allWidowhandles)
		{
			if(!(handle.equals(windowSwitch)) ){
				driver.switchTo().window(handle);
			}
		}
		
	
	System.out.println(driver.findElement(By.xpath("//a[text()='What is Selenium?']")).getText());
	
   driver.switchTo().window(windowSwitch);
	
	driver.findElement(By.cssSelector("input#radio1")).click();
	
	}
}
