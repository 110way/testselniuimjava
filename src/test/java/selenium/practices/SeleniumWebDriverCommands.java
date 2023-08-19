package selenium.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverCommands {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"); // this is code of invoking browser 
		
		WebDriver driver = new ChromeDriver (); // we have accessed chromdriver class
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize(); // By by =  By.xpath("//input")
		
//		WebElement mRadioButton = driver.findElement(By.xpath("//input[@id='radio1']"));
//		
//		WebElement fRadioButton = driver.findElement(By.xpath("//input[@id='radio2']"));
//
//		mRadioButton.click();
		
//		WebElement fRadioButton = driver.findElement(By.cssSelector("input#abc"));
         // it will throw NoSuchElementException
		
//		
		Thread.sleep(5000);
		
//		fRadioButton.click();
		
		List<WebElement> buttono = driver.findElements(By.tagName("button"));
		
		System.out.println("no of element :  "+ buttono.size());
		
		
		System.out.println(driver.getCurrentUrl()); //this will print current open page url
		
		System.out.println(driver.getPageSource()); //print page source of html
		
		System.out.println(driver.getTitle()); // print web page title
		
		driver.close();
	}

}
