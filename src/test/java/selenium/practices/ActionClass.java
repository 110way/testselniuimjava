package selenium.practices;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"); // this is code of invoking browser 
		
		WebDriver driver = new ChromeDriver (); // we have accessed chromdriver class
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		//used action class to access its properties
		Actions actions = new Actions(driver);
		
		WebElement blogs = driver.findElement(By.xpath("//span[@id='blogsmenu']"));
		
		// hover
		
//		actions.moveToElement(blogs).build().perform();
		
		// key down
		
		WebElement textarea = driver.findElement(By.xpath("//textarea[@id = 'ta1']"));
		
		actions.keyDown(textarea, "A").keyUp("A").build().perform();
		
		actions.keyDown(textarea,Keys.SHIFT).build().perform();

		
		//right click
		
		actions.contextClick(textarea).build().perform();
		
		
	}

}
