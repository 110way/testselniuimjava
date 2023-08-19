package selenium.practices;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.Utility;

public class AltertsHandling {

	public static void main(String[] args) throws IOException {


		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"); // this is code of invoking browser 
		
		WebDriver driver = new ChromeDriver (); // we have accessed chromdriver class
		
		driver.get(Utility.getProperty("url"));
		
		driver.manage().window().maximize(); // By by =  By.xpath("//input")
		
		driver.findElement(By.xpath("//input[@id='prompt']")).click();
		
		Alert al = driver.switchTo().alert();
				
		System.out.println(al.getText());
		
		al.accept();  // it will click on accept button in alert
		
//		al.dismiss(); // it will click on cancel button in alert
		
		driver.close();
		
		
		
	}

}
