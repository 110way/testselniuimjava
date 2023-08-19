



package selenium.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelectTag {

	public static void main(String[] args) {
	
		

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"); // this is code of invoking browser 
		
		WebDriver driver = new ChromeDriver (); // we have accessed chromdriver class
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		
		WebElement mltiselect = driver.findElement(By.xpath("//select[@id = 'multiselect1']"));
		
		Select multiselect = new Select(mltiselect);

		System.out.println(multiselect.isMultiple());  // this will return true if dropdown multiselect
		
		
		
		List<WebElement> opt = multiselect.getOptions(); // this will print all option from dropdown
		
		for (WebElement option : opt)
		{
			System.out.println(option.getText()); //this will get text from option
		}
		
		
		multiselect.selectByIndex(0);  // this will select option from dropdown by index
		
		multiselect.selectByValue("audix");  //this will select option from dropdown by value
		
		multiselect.selectByVisibleText("Volvo");  // this will select option from dropdown by visible text
		
		
		// this will print all selected options
		
		List<WebElement> selectedopt = multiselect.getAllSelectedOptions();
		
		for (WebElement optt :selectedopt)
		{
			System.out.println(optt.getText());
		}
		
		
		System.out.println(multiselect.getFirstSelectedOption().getText()); // this will print first selected option
		
		
		//deselect methods
		

		multiselect.deselectByIndex(2);
		
		multiselect.deselectByValue("audix");
		
		multiselect.deselectByVisibleText("Hyundai");
		
		
		
	    multiselect.selectByIndex(0);  
		
		multiselect.selectByValue("audix");  
		
		multiselect.selectByVisibleText("Volvo"); 
		
		
		multiselect.deselectAll();
		
		driver.close();
		
	}
	
}
