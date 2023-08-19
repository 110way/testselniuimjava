
// Excplicit wait
//we have to wait for specific condition such as element to visible, enable , clickable,etc

// Implicit wait


// Fluent wait


package selenium.practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationInSelenium {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"); // this is code of invoking browser 
		
		WebDriver driver = new ChromeDriver (); // we have accessed chromdriver class
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		//used javascript support
		
		JavascriptExecutor js = (JavascriptExecutor)driver;  // typecasted to javascript
		
		js.executeScript("window.scrollBy(0,1000)","");
		
		
		//Explict wait
		
		WebElement mrOption = driver.findElement(By.xpath("//input[@id = 'dte']"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(11));
		
		wait.until(ExpectedConditions.elementToBeClickable(mrOption));
		
		
		// implicit wait 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//abc")).click();
		
		// Fluent wait
		
		FluentWait<WebDriver> wwait = new FluentWait<WebDriver>(driver);
		
		wwait.pollingEvery(Duration.ofSeconds(5));
		
		wwait.until(ExpectedConditions.elementSelectionStateToBe(mrOption, false));
		
		mrOption.click();
		
		
		
		
		
		
		
	}

}
