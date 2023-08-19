package selenium.practices;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"); // this is code of invoking browser 
		
		WebDriver driver = new ChromeDriver (); // we have accessed chromdriver class
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize(); // By by =  By.xpath("//input")
		
		WebElement searchbox = driver.findElement(By.xpath("//input[@title = 'search' and @name = 'q']"));
		
		searchbox.sendKeys("mobile"); // this is use to send text fields
				
		Thread.sleep(5000);
		
		searchbox.clear();
		
		// it will give value of specified attribute 
		
		System.out.println(searchbox.getAttribute("class"));
		
		// it will verify weather element is displayed on webpage
		
		System.out.println(searchbox.isDisplayed());
		
		// 
		
		System.out.println(searchbox.getAccessibleName());
		
		System.out.println(searchbox.getAriaRole());
		
		System.out.println(driver.findElement(By.cssSelector("button.dropbtn")).getCssValue("background-color"));
		
		// get location written point in x and y values
		
		Point p = searchbox.getLocation();
		
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		// this will get screenshots and it will saved to desired file location
		
		File file = searchbox.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("src/test/resources/screenshots/textboxss.png"));
		
		// gettagname - it will print tag name
		
		System.out.println(searchbox.getTagName());
		
		//get text -- it will get text 
		
		System.out.println(driver.findElement(By.xpath("//button[@id = 'but2']")).getText());
		
		//get size
		
		Dimension d = searchbox.getSize();
		
		System.out.println(d.height);
		System.out.println(d.width);
		
		
		driver.close();

	}

}
