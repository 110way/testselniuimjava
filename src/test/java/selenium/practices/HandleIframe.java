
package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIframe {

	public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"); // this is code of invoking browser 
		
		WebDriver driver = new ChromeDriver (); // we have accessed chromdriver class
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize(); // By by =  By.xpath("//input")
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='navbar-iframe']"))); // this will switch to iframe
		
		

		System.out.println(driver.findElement(By.xpath("//a[@id = 'b-getorpost']")).getText());
		
		driver.switchTo().defaultContent(); // it will get back user to orignal frame
		
		driver.findElement(By.cssSelector("input#radio1")).click();

		
		driver.quit();
		
	}

}
