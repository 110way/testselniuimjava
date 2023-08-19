package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropdown {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"); // this is code of invoking browser 
		
		WebDriver driver = new ChromeDriver (); // we have accessed chromdriver class
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		
		WebElement dropd = driver.findElement(By.xpath("//select[@id = 'drop1']"));
		
		Select singledd = new Select(dropd);
		
		System.out.println(singledd.isMultiple());
		
		singledd.selectByIndex(4);
		
		singledd.selectByValue("mno");
		
		singledd.selectByVisibleText("doc 3");
		
		System.out.println(singledd.getFirstSelectedOption().getText());
		
		singledd.getOptions();		
	}

}
