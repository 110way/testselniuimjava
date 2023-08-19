package selenium.practices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavCommand {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.makemytrip.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.google.com"); //it will open new windiwa
		
//		driver.close(); // this will current browser instances
		
		driver.quit(); // it will close all  broweser instances
		
		
	}

}
