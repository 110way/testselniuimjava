
package selenium.practices;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingSelenium {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"); // this is code of invoking browser 
		
		WebDriver driver = new ChromeDriver (); // we have accessed chromdriver class
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		//used javascript support
		
		JavascriptExecutor js = (JavascriptExecutor)driver;  // typecasted to javascript
		
		js.executeScript("window.scrollBy(0,1000)","");
		
	}

}
