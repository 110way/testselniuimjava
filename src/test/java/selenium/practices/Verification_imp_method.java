package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification_imp_method {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"); // this is code of invoking browser 
		
		WebDriver driver = new ChromeDriver (); // we have accessed chromdriver class
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize(); // By by =  By.xpath("//input")
		
		
		
//		is selected
		
		WebElement malerb = driver.findElement(By.xpath("//input[@id='radio1']"));
		
		WebElement femalerb = driver.findElement(By.xpath("//input[@id='radio2']"));
		
		malerb.click();
		
		System.out.println(malerb.isSelected());
		
		System.out.println(femalerb.isSelected());

		System.out.println(femalerb.isDisplayed());

		
		WebElement orangeb = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		
		WebElement blueb = driver.findElement(By.xpath("//input[@id='checkbox2']"));

		orangeb.click();


        System.out.println(orangeb.isSelected());
        
        System.out.println(orangeb.isDisplayed());
        
        System.out.println(blueb.isSelected());

        
        System.out.println(driver.findElement(By.xpath("//button[@id='but1']")).isEnabled());
		
		driver.close();
	}

}
