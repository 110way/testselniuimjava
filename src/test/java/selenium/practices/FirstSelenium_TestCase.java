


package selenium.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium_TestCase {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"); // this is code of invoking browser 
		
		WebDriver driver = new ChromeDriver (); // we have accessed chromdriver class
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		
		// to find webelement by locators
		
		// by name attribute--
		
		WebElement element = driver.findElement(By.name("userid")); 
		
		element.sendKeys("Username");
		Thread.sleep(2000);
		element.clear();
		
		// by id locator--
		
		WebElement element1 = driver.findElement(By.id("but2"));
		System.out.println(element1.getText());  // this will print label of element
		
		// by class name locator--
		
//		System.out.println(driver.findElement(By.className("post-title entry-title")).getText());
		
		
		// by link text locator--
		
//		driver.findElement(By.linkText("Posts (Atom)")).click();
				
		// by partial link text locator---
		
		driver.findElement(By.partialLinkText("Atom"));
		
		//  by Tag name locator
		
		List<WebElement>  links = driver.findElements(By.tagName("a")); // this will list of all elments thats why it is findelements		
		System.out.println("No of links"+ links.size());
		
		
	    // by xpath locator------------------------
		
		// Types of xpath
		
//		1] Absolute xpath  
		
//		-- which starting from root note to till respective element
//		-- this are not a promisinh and not used in real time
//		-- always start with / slash
		
//		2] Relative xpath
		
//		-- which starting from  respective element
//		-- this is promising and used in real time
//		-- always start with // slash

//		Syntax :  
		// html tag name[@attribute name = 'attributr value']  
		// tagname 
		//tagname[@attribute name]
		
//		Ex: //button[@value = 'LogIn']
		
		
//		---- and , or conditions in xpath
		
//		Ex: //button[@type = 'button' and @value ='LogIn']
//		//button[@type = 'button' or @value='LogIn' ]
		
//		-- indexing of xpath/-
		
//		Ex //button[@name = 'samename' ][3]
		
//-------------- Xpath access methods
//		it is method which help us to write complex html code
		
//		  1]text()   --- //li[text()='Apple']
//        2]contains()  --- //button[contains(@value,'Log')]
//        3]starts-with() --- //button[starts-with(@value,'LogIn')]
//        4]ends-with() --- not in used
//        5]normalize-space() --- //button[normalize-space() = 'LogIn']
//        6]following --- 
//        7]preceding 
//        8]following-sibling
//        9]preceding-sibling
//        10]parent
//        11]descendant
//        12]anscentor
//        13]child
		
		
		
//		By css selectors------------
		
//		Synatx: tag name[attribute name = 'atrribute name']  EX: input[id = 'alert2']
		
//		Symbols in css selectors:
		
//		. , #,$,*,&
		
//		.  = represent class attribute  -- h2.title
//		#  = represent id attribute -- input#alert2
//		*  = represent id attribute contains -- input[id*='alert']
//		$  = represent end with -- input[id$='rt2']
		
//		driver.close(); //to close the browser
		
		
	}

}
