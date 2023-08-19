package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderControl {
	
	
	//xpath parameters

	public static void main(String[] args) throws InterruptedException {
	
		
		CalenderControl con = new CalenderControl();
		
		con.selectDateFromDatePicker("1", "20");
		
		

	}
	
	public void selectDateFromDatePicker(String month, String date) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"); // this is code of invoking browser 
		
		WebDriver driver = new ChromeDriver (); // we have accessed chromdriver class
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(200000);
		
		driver.findElement(By.xpath("//input[@id='departure']/../span")).click(); // " this /../ this goes to parent element
		
		Thread.sleep(30000);
		
		//parameterized xpath
		
		driver.findElement(By.xpath("//div[@class='DayPicker']//div[@class='DayPicker-Month']["+month+"]//div[@class ='DayPicker-Day']//p[text()='"+date+"']")).click();
	}

}
