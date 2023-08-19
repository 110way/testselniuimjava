

package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileSelenium {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"); // this is code of invoking browser 
		
		WebDriver driver = new ChromeDriver (); // we have accessed chromdriver class
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement fileUploader  = driver.findElement(By.xpath("//input[@id = 'uploadfile']"));
		
		fileUploader.sendKeys("C:/Users/ADMIN/Downloads/wallpaperflare.com_wallpaper.jpg");
		
		
	}

}
